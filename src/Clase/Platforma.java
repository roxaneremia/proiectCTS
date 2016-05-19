package Clase;

public class Platforma {
	private int nrOperatii;
	boolean publica = true;
	boolean implementeaza = true;
	boolean tipareste = true;
	boolean livreaza = true;

	//Constructori cu parametrii si fara
	public Platforma(int nrOperatii, boolean publica, boolean implementeaza, boolean tipareste, boolean livreaza) {
		super();
		this.nrOperatii = nrOperatii;
		this.publica = publica;
		this.implementeaza = implementeaza;
		this.tipareste = tipareste;
		this.livreaza = livreaza;
	}

	public Platforma() {
		super();
	}
	
	public int getNrOperatii() {
		return nrOperatii;
	}

	public void setNrOperatii(int nrOperatii) {
		this.nrOperatii = nrOperatii;
	}
	
	public Platforma(int nr) {
		setNrOperatii(nr);
	}
	
	public void comanda() {
		if(publica) {
			System.out.println("Clientul a publicat cerintele");
			publica = false;
		}
		else 
		{
			if(implementeaza) {
				System.out.println("Clientul a primit solutia");
				implementeaza = false;
			}
			else 
			{
				if(tipareste) 
				{
					System.out.println("Tipografia a tiparit materialele publicitare");
					tipareste = false;
				}
				else
				{
					System.out.println("Curierul a livrat comanda");
					livreaza = false;
				}
			}
		}
		
	}
	
	public void inceputComanda() {
		System.out.println("Avem o noua comanda");
	}
	
	public void sfarsitComanda() {
		System.out.println("Finalizare comanda");
	}
}
