package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Clase.Afis;
import Clase.AfisBuilder;
import Clase.Client;
import Clase.Pliant;
import Clase.Poster;

public class Test_Poster {

	@Test
	public void test_lipsa_specificatii() {
		try {
			Poster poster = new Poster();
			poster.setSpecificatii(null);
			fail("Nuu avem specificatii de la client");
		}
		catch(Exception ex) {
			
		}
	}
	
	@Test
	public void test_lipsa_specificatii1() {
		try {
			Poster poster = new Poster();
			poster.setSpecificatii(null);
			fail("Nuu avem specificatii de la client");
		}
		catch(Exception ex) {
			
		}
	}
	
	@Test
	public void test_lipsa_format() {
		try {
			Poster poster = new Poster();
			poster.setFormat(null);
			fail("Nuu avem format de la client");
		}
		catch(Exception ex) {
			
		}
	}

	
	@Test
	public void test_lipsa_culoare() {
		try {
			Poster poster = new Poster();
			poster.setCuloare(null);
			fail("Nuu avem culoare de la client");
		}
		catch(Exception ex) {
			
		}
	}
	
	@Test
	public void test_lipsa_pret() {
		try {
			Poster poster = new Poster();
			poster.setPret(0);
			fail("pret");
		}
		catch(Exception ex) {
			
		}
	}
	

	@Test
	public void publica() {
		Poster poster = new Poster();
		boolean publica = false;
		if("DONE Poster".equals(poster.publica()))
			publica=true;
	}

}
