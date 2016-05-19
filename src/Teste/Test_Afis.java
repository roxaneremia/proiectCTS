package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Clase.Afis;
import Clase.AfisBuilder;

public class Test_Afis {

	@Test
	public void afiseaza_afis() {
		Afis afis = new AfisBuilder().setFormat("A5").setCuloare("mov").setPret(10).setSpecificatii("Sa fie despre masini.").build();
		boolean afiseaza = false;
		if("Afis [format=A5, culoare=mov, pret=10.0, specificatii=Sa fie despre masini.]".equals(afis.toString()))
			afiseaza=true;
	}

	@Test
	public void publica() {
		Afis afis = new AfisBuilder().setFormat("A5").setCuloare("mov").setPret(10).setSpecificatii("Sa fie despre masini.").build();
		boolean publica = false;
		if("DONE Afis".equals(afis.publica()))
			publica=true;
	}
}
