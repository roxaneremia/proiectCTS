package Clase;

import Interfete.ModPlata;

public class MasterCard implements ModPlata {

	@Override
	public void plateste() {
		System.out.println("plateste prin MasterCard");
	}

}
