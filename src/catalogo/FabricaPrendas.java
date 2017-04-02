package Catalogo;
import java.util.ArrayList;


public class FabricaPrendas {
	
	private static ArrayList<Prenda> almacenPantalones = new ArrayList();
	private static ArrayList<Prenda> almacenCamisas = new ArrayList();
	private static ArrayList<Prenda> almacenFaldas = new ArrayList();
	private static ArrayList<Prenda> almacenPlayeras = new ArrayList();
	private static ArrayList<Prenda> almacenSacos = new ArrayList();
	private static ArrayList<Prenda> almacenBlusas = new ArrayList();
	

	private static Prenda prototipoPantalon = new Pantalon(); 
	private static Prenda prototipoCamisa = new Camisa();
	private static Prenda prototipoFalda = new Falda();
	private static Prenda prototipoPlayera = new Playera();
	private static Prenda prototipoSaco = new Saco();
	private static Prenda prototipoBlusa = new Blusa();
	 
	//Catalogo predefinido
	static {		
		Prenda pantalon = prototipoPantalon.clone(); pantalon.setModelo("Modelo1"); pantalon.setSexo("Caballero"); pantalon.setPrecio(550); pantalon.asignaID();almacenPantalones.add(pantalon);
		pantalon = prototipoPantalon.clone(); pantalon.setModelo("Modelo2"); pantalon.setSexo("Caballero"); pantalon.setPrecio(700); pantalon.asignaID(); almacenPantalones.add(pantalon);
		pantalon = prototipoPantalon.clone(); pantalon.setModelo("Modelo3"); pantalon.setSexo("Caballero"); pantalon.setPrecio(550); pantalon.asignaID(); almacenPantalones.add(pantalon);
		pantalon = prototipoPantalon.clone(); pantalon.setModelo("Modelo1"); pantalon.setSexo("Dama"); pantalon.setPrecio(550); pantalon.asignaID(); almacenPantalones.add(pantalon);
		pantalon = prototipoPantalon.clone(); pantalon.setModelo("Modelo2"); pantalon.setSexo("Dama"); pantalon.setPrecio(740); pantalon.asignaID(); almacenPantalones.add(pantalon);
		Prenda blusa = prototipoBlusa.clone(); blusa.setModelo("Modelo1"); blusa.setPrecio(350); blusa.asignaID(); almacenBlusas.add(blusa);
		blusa = prototipoBlusa.clone(); blusa.setModelo("Modelo2"); blusa.setPrecio(500); blusa.asignaID(); almacenBlusas.add(blusa);
		blusa = prototipoBlusa.clone(); blusa.setModelo("Modelo3"); blusa.setPrecio(200); blusa.asignaID(); almacenBlusas.add(blusa);
		blusa = prototipoBlusa.clone(); blusa.setModelo("Modelo4"); blusa.setPrecio(350); blusa.asignaID(); almacenBlusas.add(blusa);
		Prenda falda = prototipoFalda.clone(); falda.setModelo("Modelo1"); falda.setPrecio(512); falda.asignaID(); almacenFaldas.add(falda);
		falda=prototipoFalda.clone(); falda.setModelo("Modelo2");falda.setPrecio(200); falda.asignaID(); almacenFaldas.add(falda);
		falda=prototipoFalda.clone(); falda.setModelo("Modelo3");falda.setPrecio(300); falda.asignaID(); almacenFaldas.add(falda);
		falda=prototipoFalda.clone(); falda.setModelo("Modelo4");falda.setPrecio(450); falda.asignaID(); almacenFaldas.add(falda);
		Prenda camisa = prototipoCamisa.clone();  camisa.setModelo("Modelo1"); camisa.setPrecio(450); camisa.asignaID(); almacenCamisas.add(camisa);
		camisa = prototipoCamisa.clone();  camisa.setModelo("Modelo2"); camisa.setPrecio(750); camisa.asignaID(); almacenCamisas.add(camisa);
		camisa = prototipoCamisa.clone();  camisa.setModelo("Modelo3"); camisa.setPrecio(600); camisa.asignaID(); almacenCamisas.add(camisa);
		Prenda playera = prototipoPlayera.clone(); playera.setModelo("Modelo1"); playera.setSexo("Dama"); playera.setPrecio(150); playera.asignaID(); almacenPlayeras.add(playera); 
		playera = prototipoPlayera.clone(); playera.setModelo("Modelo2"); playera.setSexo("Dama"); playera.setPrecio(350); playera.asignaID(); almacenPlayeras.add(playera);
		playera = prototipoPlayera.clone(); playera.setModelo("Modelo1"); playera.setSexo("Caballero"); playera.setPrecio(450); playera.asignaID(); almacenPlayeras.add(playera);
		playera = prototipoPlayera.clone(); playera.setModelo("Modelo2"); playera.setSexo("Caballero"); playera.setPrecio(890); playera.asignaID(); almacenPlayeras.add(playera);
		playera = prototipoPlayera.clone(); playera.setModelo("Modelo3"); playera.setSexo("Caballero"); playera.setPrecio(450); playera.asignaID(); almacenPlayeras.add(playera);
		Prenda saco = prototipoSaco.clone();saco.setModelo("Modelo1"); saco.setSexo("Caballero");saco.setPrecio(700); saco.asignaID(); almacenSacos.add(saco);
		saco = saco = prototipoSaco.clone();saco.setModelo("Modelo2"); saco.setSexo("Caballero");saco.setPrecio(800); saco.asignaID(); almacenSacos.add(saco);
		saco = saco = prototipoSaco.clone();saco.setModelo("Modelo1"); saco.setSexo("Dama");saco.setPrecio(900); saco.asignaID(); almacenSacos.add(saco);
		saco = saco = prototipoSaco.clone();saco.setModelo("Modelo1"); saco.setSexo("Dama");saco.setPrecio(1000); saco.asignaID(); almacenSacos.add(saco);
		saco = saco = prototipoSaco.clone();saco.setModelo("Modelo2"); saco.setSexo("Dama");saco.setPrecio(1500); saco.asignaID(); almacenSacos.add(saco);		
	}
	
	
	//Método para la creación de nuevas prendas que tienen una subdivisión por sexo
	private static void nuevaPrenda(ArrayList<Prenda> almacenPrendas, Prenda prototipoPrenda, String modelo, String sexo, float precio){
		Prenda nuevaPrenda = null; 
		if(almacenPrendas.isEmpty()){
			//Se crea una nueva prenda
			Prenda prenda = prototipoPrenda.clone();
			prenda.setModelo(modelo);
			prenda.setSexo(sexo);
			prenda.setPrecio(precio);
			prenda.asignaID();
			almacenPrendas.add(prenda);				
			nuevaPrenda=prenda;			
		}
		else{
			for(Prenda p : almacenPrendas){
				if(p.getModelo().equalsIgnoreCase(modelo)&&p.getSexo().equalsIgnoreCase(sexo)&&p.getPrecio()==precio)
					nuevaPrenda = p; 	//Se reutiliza la prenda				
			}
			if(nuevaPrenda==null){
				//Se crea una nueva prenda
				Prenda prenda = prototipoPrenda.clone();
				prenda.setModelo(modelo);
				prenda.setSexo(sexo);
				prenda.setPrecio(precio);
				prenda.asignaID();
				almacenPrendas.add(prenda);				
				nuevaPrenda=prenda;
			}			
		}
	}
	
	//Método para la creación de nuevas prendas que no tienen una subdivisión por sexo
	private static void nuevaPrenda(ArrayList<Prenda> almacenPrendas, Prenda prototipoPrenda, String modelo, float precio){
			Prenda nuevaPrenda = null; 
			if(almacenPrendas.isEmpty()){
				//Se crea una nueva prenda
				Prenda prenda = prototipoPrenda.clone();
				prenda.setModelo(modelo);
				prenda.setPrecio(precio);
				prenda.asignaID();
				almacenPrendas.add(prenda);				
				nuevaPrenda=prenda;			
			}
			else{
				for(Prenda p : almacenPrendas){
					if(p.getModelo().equalsIgnoreCase(modelo)&&p.getPrecio()==precio)
						nuevaPrenda = p; 	//Se reutiliza la prenda				
				}
				if(nuevaPrenda==null){
					//Se crea una nueva prenda
					Prenda prenda = prototipoPrenda.clone();
					prenda.setModelo(modelo);
					prenda.setPrecio(precio);
					prenda.asignaID();
					almacenPrendas.add(prenda);				
					nuevaPrenda=prenda;
				}			
			}
		}
	
	
	//Agregar una nueva prenda al catalogo, verificando si hay existencia previa de la prenda
	public static void nuevaPrenda(String tipoPrenda, String modelo, String sexo, float precio){
			
		//Determinamos que tipo de prenda vamos a buscar
		switch (tipoPrenda){
		case "pantalon": nuevaPrenda(almacenPantalones, prototipoPantalon, modelo, sexo, precio); 	break;			
		case "camisa": nuevaPrenda(almacenCamisas, prototipoCamisa, modelo, precio); 	break;			
		case "falda": nuevaPrenda(almacenFaldas, prototipoFalda, modelo, precio); 	break;			
		case "playera": nuevaPrenda(almacenPlayeras, prototipoPlayera, modelo, sexo, precio); 	break;			
		case "saco": nuevaPrenda(almacenSacos, prototipoSaco, modelo, sexo, precio); 	break; 			
		case "blusa": nuevaPrenda(almacenBlusas, prototipoBlusa, modelo, precio); 	break;	
		default: System.out.println("No se reconoce la opción " + tipoPrenda); break;
		}		
	}
	
	//Devuelve el catalogo de pantalones
	public ArrayList<Prenda> catalogoPantalones(){
		return almacenPantalones;
	}
	
	//Devuelve el catalogo de camisas
	public ArrayList<Prenda> catalogoCamisas(){
		return almacenCamisas;
	}
	
	//Devuelve el catalogo de faldas
	public ArrayList<Prenda> catalogoFaldas(){
		return almacenFaldas;
	}
	
	//Devuelve el catalogo de playeras
	public ArrayList<Prenda> catalogoPlayeras(){
		return almacenPlayeras;
	}
	
	//Devuelve el catalogo de sacos
	public ArrayList<Prenda> catalogoSacos(){
		return almacenSacos;
	}
	
	//Devuelve el catalogo de blusas
	public ArrayList<Prenda> catalogoBlusas(){
		return almacenBlusas;
	}
	
}
