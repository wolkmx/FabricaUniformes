package produccionBuilder;

public class CamisaB implements UniformesBuilder{
	//private PrendaCompleta prenda;
	
		public CamisaB(){
			//this.prenda = new PrendaCompleta();
		}
		
		public void realizarCorte() {
			//prenda.setModelo("Cortando tela para: Blusa");
			//prenda.setSexo();
		}

		
		public void armarPrenda() {
			System.out.println("Armando Prenda");
		}

		
		public void bordarPrenda() {
			System.out.println("Bordando Prenda");
		}
		
		//public PrendaCompleta getPrenda(){
			//return this.prenda;
		//}
}
