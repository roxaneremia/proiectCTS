package Clase;

public class ImplementeazaSolutie extends ComandaHandler {

	@Override
	public void comanda(String stare) {
		if(stare == "deImplementat") {
			System.out.println("Designerul a implementat cerintele");
			stare = "deTiparit"; //comanda este gata de tiparit
		}
		else {
			serviciulUrmator.comanda(stare); //Muta responsabilitatea catre operatia urmatoare
		}
	}

}
