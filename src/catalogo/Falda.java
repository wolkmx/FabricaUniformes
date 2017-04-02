package catalogo;

public class Falda extends Prenda{
	

	public Falda(){
		this.setNombre("Falda");
		this.setSexo("Dama");
		
		}

	public void asignaID(){
		String id = this.getNombre().substring(0, 3).toUpperCase() + "-" + this.getModelo().toUpperCase()+"-M";
		this.setId(id);
	}
	
	public String info(){
		return "ID:" + this.getId() + "   Modelo:" + this.getModelo() + "   Precio:$" + this.getPrecio() ;
	}

}
