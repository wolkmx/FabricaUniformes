package pedido.decorator;

import pedido.PedidoItem;

public class NombreCompania extends Bordado{

	PedidoItem item;
	String texto;

	public NombreCompania(PedidoItem item, String texto) {
		super(item);
		this.item = item;
		this.texto = texto;
	}

	@Override
	public void bordar() {
		super.bordar();
		System.out.println("Agregar el siguiente Nombre de la compañia: " + texto + " al pedido: " + item);		
	}
}
