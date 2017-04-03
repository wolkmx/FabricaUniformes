package catalogo;

public class Blusa extends Prenda {
	
	
	public Blusa(){
		this.setNombre("Blusa");
		this.setSexo("Mujer");
		// prueba... =) 
		}

	public void asignaID(){
		String id = this.getNombre().substring(0, 3).toUpperCase() + "-" + this.getModelo().toUpperCase()+"-M";
		this.setId(id);
	}
	
		
	public String info(){
		return "ID:" + this.getId() + "   Modelo:" + this.getModelo() + "   Precio:$" + this.getPrecio() ;
	}

}
