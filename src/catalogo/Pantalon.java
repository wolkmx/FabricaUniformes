package Catalogo;

public class Pantalon extends Prenda{
	
	
	
	public Pantalon(){
		this.setNombre("Pantalon");
		
	}

	public void asignaID(){
		String id = this.getNombre().substring(0, 3).toUpperCase() + "-" + this.getModelo().toUpperCase()+"-";
		id += this.getSexo().equalsIgnoreCase("Dama") ? "M" : "H";
		this.setId(id);
	}
	
	public String info(){
		return "ID:" + this.getId() + "   Modelo:" + this.getModelo() + "   Sexo:" + this.getSexo() + "   Precio:$" + this.getPrecio() ;
	}


}
