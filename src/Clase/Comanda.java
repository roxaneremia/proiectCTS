package Clase;

public class Comanda {
	public String stare; //poate fi publicat, implementat, tiparit, livrat
	public float plata;
	
	public Comanda(String stare, float plata) {
		super();
		this.stare = stare;
		this.plata = plata;
	}
	
	public Comanda() {
		super();
	}

	public String getStare() {
		return stare;
	}

	public void setStare(String stare) {
		this.stare = stare;
	}
	
	public float getPlata() {
		return plata;
	}

	public void setPlata(float plata) {
		if(plata == 0)
			throw new UnsupportedOperationException("Nu poti plasa comanda fara sa platesti suma"); 
		if(plata < 0)
		    throw new UnsupportedOperationException("Nu poti plasa comanda cu valori negative"); 
		this.plata = plata;
	}

	@Override
	public String toString() {
		return "Comanda [stare=" + stare + ", plata=" + plata + "]";
	}

}
