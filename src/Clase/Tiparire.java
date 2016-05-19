package Clase;

public class Tiparire extends ComandaHandler {
	public boolean cartus;
	public boolean material;

	public Tiparire(boolean cartus, boolean material) {
		super();
		this.cartus = cartus;
		this.material = material;
	}

	public Tiparire() {
		super();
	}
	
	@Override
	public void comanda(String stare) {
		if(stare == "deTiparit") {
			System.out.println("Tipografia a tiparit materialele");
			stare = "deLivrat"; //comanda este gata de livrare
		}
		else {
			serviciulUrmator.comanda(stare); //Muta responsabilitatea catre operatia urmatoare
		}
	}
	
	public void verifica_cartus(boolean check) {
		if(check) {
			System.out.println("Putem printa");
		}
		else 
			throw new UnsupportedOperationException("Nu putem printa"); 
	}
	
	public void verifica_material(String mat) {
		if(mat == "A5") {
			System.out.println("Putem printa");
		}
		else
		{
			if(mat == "A4") {
				System.out.println("Putem printa");
			}
			else {
				if(mat == "A3") {
					System.out.println("Putem printa");
				}
				else 			
					throw new UnsupportedOperationException("Nu putem printa"); 
					
			}
		}
	}
	
	public int total_tiparire(int nrMaterial, int pret) {
		return nrMaterial*pret;
	}
	
	public String promotie_nume_tipografie(String nume){
		String text = "";
		if(nume=="ROMPRINT") {
			text = "Aveti reducere de 20% in urmatoarea luna";
		}
		else {
			if(nume=="printART Co.") {
				text = "Aveti reducere de 10% in urmatoarea luna";
			}
			else {
				if(nume=="RINGIER PRINT") {
					text = "Aveti reducere de 25% in urmatoarea luna";
				}
				else {
					throw new UnsupportedOperationException("Nu exista promotie");
				}
			}
		}
		return text;
	}
}
