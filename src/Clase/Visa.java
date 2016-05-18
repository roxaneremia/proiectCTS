package Clase;

import Interfete.ModPlata;

public class Visa implements ModPlata {

	@Override
	public void plateste() {
		System.out.println("plateste prin Visa");
	}

}
