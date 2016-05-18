package Clase;

public class Operatie {
	private String nume;
	
	public Operatie(String nume) {
		super();
		this.nume = nume;
	}
	
	
	public String getNume() {
		return nume;
	}

	public void seDesfasoara() {
		System.out.println(nume + " este in curs de executie");
	}
}
