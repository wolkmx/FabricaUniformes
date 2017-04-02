package pedido.decorator;

import pedido.Pedido;

public abstract class Bordado implements PedidoBordado{
	protected Pedido pedido;
	
	public Bordado(Pedido pedido){
		this.pedido = pedido;
	}
	
	public void bordar(){
		pedido.bordar();
	} 
}
