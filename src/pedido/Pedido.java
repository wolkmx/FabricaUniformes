package pedido;

import java.util.Map;

import catalogo.PrendaConcreta;

public interface Pedido {

	void agregarPrenda(PrendaConcreta p, int c);
	void generaID();
	void setCliente(Cliente cliente);
	void mostrarPedido();
	double costoPedido();
	boolean registrarAnticipo(String respuesta, double monto);
	boolean isAnticipo();
	public Map<PrendaConcreta, Integer> getPedido();
	double getTotal();
	void bordar();

}
