package produccion;
import java.util.Map;
import java.util.Map.Entry;

import catalogo.PrendaConcreta;

public class ProduccionReal implements Produccion{
	
	Map<PrendaConcreta, Integer> objPedido;
	
	ProduccionReal(Map<PrendaConcreta, Integer> objPedido)
	{
		this.objPedido = objPedido;
	}

	public void RealizarProduccion()
	{
		
		//Aqui van las operaciones del builder, las llamadas.
		
	}
}
