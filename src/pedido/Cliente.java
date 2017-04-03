package pedido;

public class Cliente {
	int ID;
	String nombre;
	String ape_p;
	String ape_m;
	String direccion;
	
	public Cliente(int iD, String nombre, String ape_p, String ape_m, String direccion) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.ape_p = ape_p;
		this.ape_m = ape_m;
		this.direccion = direccion;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe_p() {
		return ape_p;
	}

	public void setApe_p(String ape_p) {
		this.ape_p = ape_p;
	}

	public String getApe_m() {
		return ape_m;
	}

	public void setApe_m(String ape_m) {
		this.ape_m = ape_m;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
