package Clase;

public class Comanda {
	public String stare; //poate fi publicat, implementat, tiparit, livrat

	public Comanda(String stare) {
		super();
		this.stare = stare;
	}

	public String getStare() {
		return stare;
	}

	public void setStare(String stare) {
		this.stare = stare;
	}

	@Override
	public String toString() {
		return "Comanda [stare=" + stare + "]";
	}
	
}
