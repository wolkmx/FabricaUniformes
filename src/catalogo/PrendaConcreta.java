package catalogo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PrendaConcreta implements PrendaInt{
	
	private static List<String> tallasPantalonH =  new ArrayList<String>(Arrays.asList("28","30","32","34","36","38","40","42"));
	private static List<String> tallasPantalonM = new ArrayList<String>(Arrays.asList("1","3","5","7","9","11","13","15","17","19"));
	private static List<String> tallasCamisa = new ArrayList<String>(Arrays.asList("ECH","CH", "M", "G", "EG"));
	private static List<String> tallasBlusa = new ArrayList<String>(Arrays.asList("ECH","CH", "M", "G", "EG"));
	private static List<String> tallasFalda = new ArrayList<String>(Arrays.asList("1","3","5","7","9","11","13","15","17","19"));
	private static List<String> tallasPlayera = new ArrayList<String>(Arrays.asList("ECH","CH", "M", "G", "EG"));
	private static List<String> tallasSaco = new ArrayList<String>(Arrays.asList("ECH","CH", "M", "G", "EG"));
	//Talla saco es la misma que blusa o camisa 
	
	
	Prenda prenda = null;
	String talla = null;
	
	public Prenda getPrenda(){
		return prenda;
	}
	
	public String getTalla(){
		return talla;
	}
	
	//Método para mostrar los elementos de un catalogo de prendas, para los casos en que hay presente una sibdivisión de tallas por sexo
	//Se considera que tallasD corresponde a tallas de dama y tallasC a tallas de caballero 
	private static void mostrarCatalogo(ArrayList<Prenda> catalogo, List<String> tallasD, List<String> tallasC,String tipoPrenda){
		if(catalogo.isEmpty()){
			System.out.println("El catalogo se encuentra vacio");
		}
		else{
			System.out.println("---CATALOGO DE " + tipoPrenda.toUpperCase() + "---");
			for(Prenda p : catalogo){
				System.out.println(p.info());
				}
			System.out.println("Tallas disponibles dama: " + tallasD.toString());
			System.out.println("Tallas disponibles caballero: " + tallasC.toString());
		}	
	}
	
	////Método para mostrar los elementos de un catalogo de prendas, para el caso en que no hay presente una sibdivisión de tallas por sexo
	private static void mostrarCatalogo(ArrayList<Prenda> catalogo, List<String> tallas, String tipoPrenda ){
		if(catalogo.isEmpty()){
			System.out.println("El catalogo se encuentra vacio");
		}
		else{
			System.out.println("---CATALOGO DE " + tipoPrenda.toUpperCase() + "---");
			for(Prenda p : catalogo){
				System.out.println(p.info());
				}
			System.out.println("Tallas disponibles: " + tallas.toString());
		}
	}
	//Muestra  el contenido de un catalogo en particular
	//Recibe un String correspondiente al catalogo que se quiere visualizar
	// pantalon, camisa, falda, playera, saco, blusa
	public static void mostrarCatalogo(String tipoPrenda){
		FabricaPrendas catalogo = new FabricaPrendas();
		switch (tipoPrenda){
		case "pantalon":mostrarCatalogo(catalogo.catalogoPantalones(),tallasPantalonM, tallasPantalonH, "pantalones");	break;						
		case "camisa":	mostrarCatalogo(catalogo.catalogoCamisas(), tallasCamisa, "camisas"); break;			
		case "falda": mostrarCatalogo(catalogo.catalogoFaldas(), tallasFalda, "faldas"); break;			
		case "playera": mostrarCatalogo(catalogo.catalogoPlayeras(), tallasPlayera, "playeras"); break;			
		case "saco": mostrarCatalogo(catalogo.catalogoSacos(), tallasSaco, "sacos"); break;
		case "blusa": mostrarCatalogo(catalogo.catalogoBlusas(), tallasBlusa, "blusas"); break;	
		default: System.out.println("No se reconoce la opción " + tipoPrenda); break;
		}		
	}
	
	//Muestra  el contenido de todos los catalodgos
	public static void mostrarCatalogos(){
		mostrarCatalogo("pantalon");
		mostrarCatalogo("camisa");
		mostrarCatalogo("falda");
		mostrarCatalogo("blusa");
		mostrarCatalogo("playera");
		mostrarCatalogo("saco");
		
	}
				
	//Muestra las tallas disponibles de un tipo de prenda en particular
	// pantalon, camisa, falda, playera, saco, blusa
	public static void mostrarTallasPrenda(String prenda){
		switch (prenda.toLowerCase()){
		case "pantalon": 
			System.out.println("Pantalones de dama \n" + tallasPantalonM.toString());
			System.out.println("Pantalones de caballero\n" + tallasPantalonH.toString());		
			break;
		case "blusa": System.out.println("Blusas \n" + tallasBlusa.toString()); break;
		case "playera": System.out.println("Playeras \n" + tallasPlayera.toString()); break;
		case "falda": System.out.println("Faldas \n" + tallasFalda.toString()); break;
		case "saco": System.out.println("Sacos \n" + tallasSaco.toString()); break;
		case "camisa": System.out.println("Camisas \n" + tallasCamisa.toString()); break;
		default : System.out.println("Error: no se reconoce la opción " + prenda); break;
		}
	}
	
	//Muestra las tallas disponibles de todos los tipos de prendas
	public static void mostrarTallas(){
		mostrarTallasPrenda("pantalon");
		mostrarTallasPrenda("camisa");
		mostrarTallasPrenda("blusa");
		mostrarTallasPrenda("falda");
		mostrarTallasPrenda("playera");
		mostrarTallasPrenda("saco");
	}

	//Asigna la talla recibida como parametro a la prenda 
	private void seleccionarTalla(List<String> catalogoTallas, String talla){
		for(String t : catalogoTallas){
			if(talla.equalsIgnoreCase(t))
				this.talla = t;
		}
		if(this.talla == null)
			System.out.println("La talla " + talla + "no se encuentra en el catalogo de tallas");
	}
	
	//Asigna una talla a la prenda	
	public void seleccionarTalla(String talla){
		//Verificamos que se tenga una prenda a la cual asignar la talla
		if(this.prenda == null)
			System.out.println("Antes de asignar la talla es necesario que selecciones una prenda del catalogo");
		else{
			//Determinamos que tipo de prenda es con los primeros 3 caracteres del ID
			switch(this.prenda.getId().substring(0,3)){
			case "PAN" : 
				if (this.prenda.getSexo().equalsIgnoreCase("Dama"))
					seleccionarTalla(tallasBlusa, talla);			
				else if (this.prenda.getSexo().equalsIgnoreCase("Caballero"))
					seleccionarTalla(tallasBlusa, talla); 
			break;			
			case "CAM" : seleccionarTalla(tallasCamisa, talla); break;			
			case "BLU" : seleccionarTalla(tallasBlusa, talla); break;
			case "FAL" : seleccionarTalla(tallasFalda, talla); break;
			case "PLA" : seleccionarTalla(tallasPlayera, talla); break;		
			case "SAC" : seleccionarTalla(tallasSaco, talla); break;		
			}
		}		
	}	
	
	//Metodo para agregar una nueva talla al catalogo
	// se espera que tipoPrenda corresponda con pantalon, camisa, falda, playera, saco, blusa
	public static void agregarTalla(String tipoPrenda, String sexo, String nuevaTalla){		
		switch(tipoPrenda){
		case "pantalon": 
			if(sexo.equalsIgnoreCase("Dama"))
				agregarTalla(tallasPantalonM, nuevaTalla ); 
			if(sexo.equalsIgnoreCase("Caballero"))
				agregarTalla(tallasPantalonH, nuevaTalla ); 
			break;			
		case "camisa":agregarTalla(tallasCamisa, nuevaTalla ); break;		
		case "blusa":agregarTalla(tallasBlusa, nuevaTalla ); break;			
		case "falda":agregarTalla(tallasFalda, nuevaTalla ); break;
		case "playera":agregarTalla(tallasPlayera, nuevaTalla ); break;			
		case "saco": agregarTalla(tallasSaco, nuevaTalla ); break;
		default: System.out.println("No se reconoce la opción de " + tipoPrenda);
		}

	}
	
	//Método para determinar si agregar o no una nueva talla al catalogo correspondiente
	private static void agregarTalla(List<String> listaTallas, String nuevaTalla){
		String tallaAgregar = null;
		for(String t : listaTallas){
			if (t.equalsIgnoreCase(nuevaTalla))
				tallaAgregar =  t;							
		}
		if(tallaAgregar != null){
			System.out.println("La talla ya se encontraba disponible en el catalogo");
		}else{
			listaTallas.add(nuevaTalla);}
	}
	
	//Método para seleccionar una prenda del catalogo
	private void seleccionarPrendaCatalogo(ArrayList<Prenda> catalogoPrendas, String IDprenda){
		if(catalogoPrendas.isEmpty())
			System.out.println("No hay elemtos para seleccionar dentro del catálogo");
		else{
			for (Prenda p : catalogoPrendas){
				if(p.getId().compareToIgnoreCase(IDprenda)==0)
					prenda = p;						
			}
			if(prenda == null)
				System.out.println("No se ha encontrado la prenda con el ID " + IDprenda);
		}		
	}
	
	//Asigna a la referencia prenda el objeto del catalogo que coincida 
	//con el IDprenda recibido como parámetro 
	public void seleccionarPrendaCatalogo(String IDprenda){
		FabricaPrendas catalogo = new FabricaPrendas();
		switch(IDprenda.substring(0, 3)){
		case "BLU": seleccionarPrendaCatalogo(catalogo.catalogoBlusas(), IDprenda); break;
		case "CAM": seleccionarPrendaCatalogo(catalogo.catalogoCamisas(), IDprenda); break;
		case "FAL": seleccionarPrendaCatalogo(catalogo.catalogoFaldas(), IDprenda); break;
		case "PLA": seleccionarPrendaCatalogo(catalogo.catalogoPlayeras(), IDprenda); break;			
		case "SAC": seleccionarPrendaCatalogo(catalogo.catalogoSacos(), IDprenda); break;
		case "PAN": seleccionarPrendaCatalogo(catalogo.catalogoPantalones(), IDprenda); break;		
		}
		
	}
	
	//Agrega una nueva prenda al catálogo 
	public static void agregarPrendaCatalogo(String tipoPrenda, String modelo, String sexo, float precio){
		FabricaPrendas.nuevaPrenda(tipoPrenda, modelo, sexo, precio);
	}	
	
	//Devuelve el contenido de prenda concreta como cadena
	public String toString(){
		return "ID:" + prenda.getId() + "   Nombre:" + prenda.getNombre() + "   Modelo:" + prenda.getModelo() + "   Sexo:" + prenda.getSexo() + "   Talla:" + this.talla + "   Precio:$" + prenda.getPrecio() ;
	}

}
