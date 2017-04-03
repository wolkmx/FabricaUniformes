package pedido;

import catalogo.PrendaConcreta;
import pedido.decorator.Logo;
import pedido.decorator.PedidoBordado;

public class AppPedidos {

	public static void main(String[] args) {
		//01 Traer catalogo de prendas y visualizar
		//PrendaConcreta.mostrarCatalogos();	
		//System.out.println();
		
		//02 Seleccionar prendas para hacer el pedido.
		PrendaConcreta saco = new PrendaConcreta();
		saco.seleccionarPrendaCatalogo("SAC-MODELO1-M");
		saco.seleccionarTalla("EG");
		
		PrendaConcreta pantalon = new PrendaConcreta();
		pantalon.seleccionarPrendaCatalogo("PAN-MODELO3-H");
		pantalon.seleccionarTalla("EG");
		
		//03 Creamos el pedido. =Lo que nos corresponde=
		CreatorPedido cp = new ConcretPedido();
		Pedido pedido = cp.crearPedido();
		
		pedido.generaID(); //Generamos un ID.
		Cliente cliente = new Cliente(023, "Cristian", "Enriquez", "Marcial", "Calle siempre viva #202"); //Generamos un cliente
		pedido.setCliente(cliente); // Pasamos el cliente creado en el paso anterior.
		pedido.agregarPrenda(saco, 10); // Agregamos una prenda.
		pedido.agregarPrenda(pantalon, 5); // Agregamos una prenda.
		pedido.agregarPrenda(pantalon, 5);// NO permite agregar la misma prenda.
		pedido.mostrarPedido(); //Mostramos el pedido y la cantidad de productos.
		System.out.println("Total: " + pedido.costoPedido()); //Mostramos el total del pedido.

		//Registramos un  anticipo.
		pedido.registrarAnticipo("Si", 7000);
		
		//Decorar Pedido
		PedidoBordado pedidoBordado = new Logo((PedidoItem) pedido, "LOGO X");
		pedidoBordado.bordar();
		//Imprimimos nuestro objeto pedido
		System.out.println("Objeto: " + pedido);
		System.out.println(pedido.getPedido());
		System.out.println(pedido.isAnticipo()? "Si" : "No");
		System.out.println(pedido.getTotal());

	}

}
