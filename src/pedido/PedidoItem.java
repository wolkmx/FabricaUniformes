package pedido;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import catalogo.PrendaConcreta;
import pedido.decorator.PedidoBordado;

public class PedidoItem implements Pedido, PedidoBordado {
	int ID;
	Cliente cliente;
	boolean anticipo = false;
	double total = 0;
	Map<PrendaConcreta, Integer> pedido = new HashMap<>();

	@Override
	public void agregarPrenda(PrendaConcreta p, int c){
		pedido.put(p, c);
	}
	
	public void mostrarPedido(){
		for(Entry<PrendaConcreta, Integer> element : pedido.entrySet()){
			System.out.println("Prenda: " + element.getKey() + " Cantidad: " +element.getValue());
		}
	}
	
	public double costoPedido(){
		for(Entry<PrendaConcreta, Integer> element : pedido.entrySet()){
			PrendaConcreta prenda= element.getKey();
			double precio = prenda.getPrenda().getPrecio();
			double cantidad = element.getValue();
			double concepto = precio * cantidad;
			this.total += concepto;			
		}
		return this.total;
	}
	
	public boolean registrarAnticipo(String respuesta, double monto){
		switch (respuesta) {
		case "Si":
			if(monto>=(total/2)){
				anticipo = true;
			}
			this.total = this.total - monto;
			break;
		case "No":
			anticipo = false;
			break;
		}
		return anticipo;
	}

	
	public void generaID(){
		Random r = new Random();
		this.ID = r.nextInt(100);
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isAnticipo() {
		return anticipo;
	}

	public void setAnticipo(boolean anticipo) {
		this.anticipo = anticipo;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Map<PrendaConcreta, Integer> getPedido() {
		return pedido;
	}

	public void setPedido(Map<PrendaConcreta, Integer> pedido) {
		this.pedido = pedido;
	}

	@Override
	public void bordar() {
		// TODO Auto-generated method stub
		
	}

	

}
