package catalogo;

public class Camisa extends Prenda {
	

	public Camisa(){
		this.setNombre("Camisa");
		this.setSexo("Caballero");
		
		}

	public void asignaID(){
		String id = this.getNombre().substring(0, 3).toUpperCase() + "-" + this.getModelo().toUpperCase()+"-H";
		this.setId(id);
	}
	
	public String info(){
		return "ID:" + this.getId() + "   Modelo:" + this.getModelo() + "   Precio:$" + this.getPrecio() ;
	}
	
}
