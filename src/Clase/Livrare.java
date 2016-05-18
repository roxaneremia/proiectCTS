package Clase;

public class Livrare extends ComandaHandler {

	@Override
	public void comanda(String stare) {
		if(stare == "deLivrat") {
			System.out.println("Curierul a livrat materialele");
		}
		else {
			serviciulUrmator.comanda(stare); //Muta responsabilitatea catre operatia urmatoare
		}
	}

}
