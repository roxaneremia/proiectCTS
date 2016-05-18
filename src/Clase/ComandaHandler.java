package Clase;

public abstract class ComandaHandler {
	protected ComandaHandler serviciulUrmator;
	
	public void setServiciulUrmator(ComandaHandler serviciulUrmator) {
		this.serviciulUrmator = serviciulUrmator;
	}
	
	public abstract void comanda(String stare);
	
}
