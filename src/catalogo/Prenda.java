package Catalogo;

public abstract class Prenda implements Cloneable {
	
	private String id;
	private String nombre;
	private String modelo;
	private String sexo;
	private float precio;
	
	
	public Prenda clone() {
		Prenda clone = null;
		try {
			clone = (Prenda) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	public abstract void asignaID();
	public abstract String info();
	
	public String toString(){
		return "ID:" + this.getId() + "   Nombre:" + this.getNombre() + "   Modelo:" + this.getModelo() + "   Sexo:" + this.getSexo() + "   Precio:$" + this.getPrecio() ;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
}
