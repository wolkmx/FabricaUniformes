package produccion;

/**
 * Se esta inicializando el almacen con lo siguiente
 * 1000 unidades de Tela
 * 100 botones
 * 100 cierres
 */

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import catalogo.PrendaConcreta;

public class ProxyProduccion implements Produccion{
	
	Map<PrendaConcreta, Integer> objPedido;
	Almacen objAlmacen;
	boolean bandera;
	ProduccionReal produccionReal;
	Scanner entrada = new Scanner(System.in);
	
	public ProxyProduccion(Map<PrendaConcreta, Integer> objPedido)
	{
		this.objPedido = objPedido;
		bandera = false;
		objAlmacen = new Almacen(100, 200, 100); //Unidades de tela, botones y cierres
	}
	
	public void RealizarProduccion()
	{
		System.out.println("Estamos en el proxy...");
		
		ConsultarPedido(); //Consultando almacen si se cuenta con existencia
		
		if(bandera)
		{
			produccionReal = new ProduccionReal();
			produccionReal.RealizarProduccion();
			System.out.println("Todo en orden...");
		}		
	}
	
	public void ConsultarPedido()
	{
		boolean todoEnOrden = true;
		double totalTela = 0;
		int totalBotones = 0;
		int totalCierres = 0;
		String nomPrenda;
		
		for(Entry<PrendaConcreta, Integer> element : objPedido.entrySet()){
			nomPrenda = element.getKey().getPrenda().getNombre();
			
			switch(nomPrenda)
			{			
			case "Pantalon": 
				totalTela += 3 * element.getValue();//El pantalón consume 50 unidades de Tela
				totalCierres += 1 * element.getValue();//El pantalón consume 1 cierre
				totalBotones += 3 * element.getValue(); //El pantalón consume 3 botones;				
				break;
			case "Saco":
				totalTela += 20 * element.getValue();
				totalCierres += 0 * element.getValue();
				totalBotones += 3 * element.getValue(); 
				break;

			case "Faldas":
				totalTela += 2 * element.getValue();
				totalCierres += 1 * element.getValue();
				totalBotones += 2 * element.getValue(); 
			break;
			case "Camisa":
				totalTela += 3 * element.getValue();
				totalCierres += 0 * element.getValue();
				totalBotones += 3 * element.getValue(); 
				break;
				
			case "Blusa":
				totalTela += 3 * element.getValue();
				totalCierres += 0 * element.getValue();
				totalBotones += 8 * element.getValue(); 
				break;
				
			case "Playera":
				totalTela += 3 * element.getValue();
				totalCierres += 0 * element.getValue();
				totalBotones += 0 * element.getValue(); 
				break;

			default:
				System.out.println("La prenda: " + element.getKey().getPrenda().getNombre() + " no se encontró, favor de verificar.\nProcedimiento Cancelado");
				todoEnOrden = false;
				break;
			}
		}//for
		
		if(todoEnOrden)//Verifica que todo haya procedido correctamente
		{
			mtdVerificarExistenciaEnAlmacen(totalTela, totalBotones, totalCierres);			
		}
	}
	
	private void mtdVerificarExistenciaEnAlmacen(double totalTela, int totalBotones, int totalCierres) {
		
		//System.out.println("TotalTela: " + totalTela + " TelaAlmacen: " +objAlmacen.getTotalTela());
		if(totalBotones < objAlmacen.getTotalBotones())
			if(totalTela < objAlmacen.getTotalTela())
				if(totalCierres < objAlmacen.getTotalCierres())
					bandera = true; //Si hay existencia se cambia el estado a true de lo contrario debería seguir en falso
				else
					System.out.println("No se cuenta con suficientes cierres. Faltan: " + (totalCierres - objAlmacen.getTotalCierres()));
			else
				System.out.println("No se cuenta con suficiente tela. Falta: " + (totalTela - objAlmacen.getTotalTela()));
		else
			System.out.println("No se cuenta con suficientes botones. Faltan: " + (totalBotones - objAlmacen.getTotalBotones()));
		
		//Ver si se desea surtir el almacen en caso de no tener
		if(!bandera)
		{
			System.out.println("¿Desea surtir el almacen? S/N");			
			String strEntrada = entrada.nextLine();
			if(strEntrada.equals("Si") || strEntrada.equals("S")) // Si no hay 
				SurtirAlmacen();
		}
	}

	public void SurtirAlmacen()
	{
		try
		{
		System.out.println("Ingresar las nuevas unidades de tela:");
		objAlmacen.setTotalTela(Double.parseDouble(entrada.nextLine()));
		System.out.println("Ingresar las nuevas unidades de botones:");
		objAlmacen.setTotalBotones(Integer.parseInt(entrada.nextLine()));
		System.out.println("Ingresar las nuevas unidades de cierres:");
		objAlmacen.setTotalCierres(Integer.parseInt(entrada.nextLine()));
		}
		catch(Exception e)
		{
			System.out.println("Se ingresaron datos no validos, favor de verificar.");
			//SurtirAlmacen();
		}
		
		System.out.println("Datos ingresados, re-validando.");
		ConsultarPedido();
		//Ingresar datos para surtir el almacen
	}
	
}
