package pedido.decorator;

import pedido.PedidoItem;

public class NombrePersona extends Bordado{

	PedidoItem item;
	String texto;

	public NombrePersona(PedidoItem item, String texto) {
		super(item);
		this.item = item;
		this.texto = texto;
	}

	@Override
	public void bordar() {
		super.bordar();
		System.out.println("Agregar el siguiente Nombre de ¿Persona?: " + texto + " al ¿pedido?: " + item);		
	}

}
