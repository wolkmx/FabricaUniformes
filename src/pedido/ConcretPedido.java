package pedido;

public class ConcretPedido implements CreatorPedido {

	@Override
	public PedidoItem crearPedido() {
		return new PedidoItem();		
	}

}
