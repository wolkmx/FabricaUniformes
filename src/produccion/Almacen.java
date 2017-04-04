package produccion;

public class Almacen {
	
	private double totalTela;
	private int totalBotones;
	private int totalCierres;
	
	public Almacen(double totalTela, int totalBotones, int totalCierres)
	{
		this.totalTela = totalTela;
		this.totalBotones = totalBotones;
		this.totalCierres = totalCierres;		
	}	
	
	public double getTotalTela() {
		return totalTela;
	}
	public void setTotalTela(double totalTela) {
		this.totalTela = totalTela;
	}
	public int getTotalBotones() {
		return totalBotones;
	}
	public void setTotalBotones(int totalBotones) {
		this.totalBotones = totalBotones;
	}
	public int getTotalCierres() {
		return totalCierres;
	}
	public void setTotalCierres(int totalCierres) {
		this.totalCierres = totalCierres;
	}

}
