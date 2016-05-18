package Clase;

public class Tiparire extends ComandaHandler {

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

}
