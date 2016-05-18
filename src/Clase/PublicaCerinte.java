package Clase;

public class PublicaCerinte extends ComandaHandler {

	@Override
	public void comanda(String stare) {
		if(stare == "dePublicat") {
			System.out.println("Clientul a publicat cerintele");
			stare = "deImplementat"; //comanda este gata de implementat
		}
		else {
			serviciulUrmator.comanda(stare); //Muta responsabilitatea catre operatia urmatoare
		}
	}

}
