package pedido.decorator;

import pedido.PedidoItem;

public class Logo extends Bordado{

	PedidoItem item;
	String texto;

	public Logo(PedidoItem item, String texto) {
		super(item);
		this.item = item;
		this.texto = texto;
	}

	@Override
	public void bordar() {
		super.bordar();
		System.out.println("Agregar el siguiente Logo: " + texto + " al pedido: " + item.getID());		
	}

}
