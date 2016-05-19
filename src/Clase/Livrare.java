package Clase;

public class Livrare extends ComandaHandler {

	public String destinatie;
	
	public Livrare(String destinatie) {
		super();
		this.destinatie = destinatie;
	}
	
	public Livrare() {
		super();
	}
	
	public String getDestinatie() {
		return destinatie;
	}



	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}


	@Override
	public void comanda(String stare) {
		if(stare == "deLivrat") {
			System.out.println("Curierul a livrat materialele");
		}
		else {
			serviciulUrmator.comanda(stare); //Muta responsabilitatea catre operatia urmatoare
		}
	}
	
	public void destinatie(String oras) {
		if(oras == "Bucuresti") {
			System.out.println("Livrarea este pentru Bucuresti");
		}
		else {
			if(oras == "Brasov")
				System.out.println("Livrarea este pentru Brasov");
			else{
				if(oras == "Buzau")
					System.out.println("Livrarea este pentru Buzau");
				else
					throw new UnsupportedOperationException("Destinatia nu este in aria noastra de livrare"); 
			}
		}
	}
	
	public int suma_livrare_oras(String oras, int pret, int nrMateriale)
	{
		int calcul=0;
		if(oras == "Bucuresti") {
			calcul=  pret*nrMateriale;
		}
		else {
			if(oras == "Brasov")
				calcul = pret*nrMateriale*2;
			else
			{
				if(oras == "Buzau")
					calcul =  pret*nrMateriale*3;
				else
				{
						throw new UnsupportedOperationException("Destinatia nu este in aria noastra de livrare"); 
				}
			}
		}
		return calcul;
	}
	
	public int suma_livrare_zile(int nrZile, int pret, int nrMateriale)
	{
		int calcul=0;
		if(nrZile == 1) {
			calcul=  pret*nrMateriale*4;
		}
		else {
			if(nrZile == 2)
				calcul = pret*nrMateriale*2;
			else
			{
				if(nrZile == 3)
					calcul =  pret*nrMateriale;
				else
				{
						throw new UnsupportedOperationException("Se livreaza normal"); 
				}
			}
		}
		return calcul;
	}

}
