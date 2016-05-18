package Clase;

import Interfete.ModPlata;

public class PayPal implements ModPlata {

	@Override
	public void plateste() {
		System.out.println("plateste prin PayPal");
	}

}
