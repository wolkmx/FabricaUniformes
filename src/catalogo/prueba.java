package catalogo;

public class prueba {

	public static void main(String[] args) {
		
		/*Hola chicos:
		 *Ésta es una pequeña clase de prueba que muestra el funcionamiento del catalogo
		 */
		
		//Mostramos los catalogos de todas las prendas
			//PrendaConcreta.mostrarCatalogos();	
		
		//Mostramos el catalogo de un tipo de prenda en particular
			//PrendaConcreta.mostrarCatalogo("pantalon");
		
		
		//Seleccionar prenda del catalogo
			/*
			PrendaConcreta prueba = new PrendaConcreta();
			prueba.seleccionarPrendaCatalogo("SAC-MODELO1-M"); //Selecciona la prenda que desea del catalogo enviando su ID como parámetro
			prueba.seleccionarTalla("EG"); //De la prenda ya escogida, le asigna una talla
			
			//Recuperando la información de la prenda de prueba
			System.out.println("ID: " + prueba.getPrenda().getId());
			System.out.println("Nombre: " + prueba.getPrenda().getNombre());
			System.out.println("Modelo: " + prueba.getPrenda().getModelo());
			System.out.println("Sexo: " + prueba.getPrenda().getSexo());
			System.out.println("Precio: " + prueba.getPrenda().getPrecio());
			System.out.println("Talla: " + prueba.getTalla());
			System.out.println(prueba.toString());
			 */
		
		//Mostrano las tallas disponibles para todos los tipos de prendas
			//PrendaConcreta.mostrarTallas();
		
		//Mostrano las tallas disponibles para un tipo de prenda
			//PrendaConcreta.mostrarTallasPrenda("blusa");
		
		//Agregando una nueva prenda al catalogo
			/*
			PrendaConcreta.agregarPrendaCatalogo("pantalon", "Modelo5", "Dama", 780);
			PrendaConcreta.agregarPrendaCatalogo("pantalon", "Modelo4", "Dama", 900);
			PrendaConcreta.mostrarCatalogo("pantalon");
			 */
		
		//Agregando una nueva talla al catalogo
			/*
			PrendaConcreta.mostrarTallasPrenda("blusa");
			PrendaConcreta.agregarTalla("blusa", "dama", "EEG");	
			PrendaConcreta.mostrarTallasPrenda("blusa");
			 */
		
		//Agregando una nueva prenda
		//Agregando una nueva talla
			/*
			PrendaConcreta prueba2 = new PrendaConcreta();
			PrendaConcreta.agregarPrendaCatalogo("blusa", "Modelo5", "Dama", 900);
			PrendaConcreta.agregarTalla("blusa", "dama", "EEG");	
			//PrendaConcreta.mostrarCatalogo("blusa");
			prueba2.seleccionarPrendaCatalogo("BLU-MODELO5-M");
			prueba2.seleccionarTalla("EEG");
						
			//Recuperando la información de la prenda de prueba
			System.out.println("ID: " + prueba2.getPrenda().getId());
			System.out.println("Nombre: " + prueba2.getPrenda().getNombre());
			System.out.println("Modelo: " + prueba2.getPrenda().getModelo());
			System.out.println("Sexo: " + prueba2.getPrenda().getSexo());
			System.out.println("Precio: " + prueba2.getPrenda().getPrecio());
			System.out.println("Talla: " + prueba2.getTalla());
			System.out.println(prueba2.toString());
			*/
	}

}
