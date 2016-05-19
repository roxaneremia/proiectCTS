package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Clase.Pliant;
import Clase.Poster;

public class Test_Pliant {

	@Test
	public void test_lipsa_specificatii() {
		try {
			Pliant pliant = new Pliant();
			pliant.setSpecificatii(null);
			fail("Nuu avem specificatii de la client");
		}
		catch(Exception ex) {
			
		}
	}
	
	@Test
	public void test_lipsa_format() {
		try {
			Pliant pliant = new Pliant();
			pliant.setFormat(null);
			fail("Nuu avem format de la client");
		}
		catch(Exception ex) {
			
		}
	}

	
	@Test
	public void test_lipsa_culoare() {
		try {
			Pliant pliant = new Pliant();
			pliant.setCuloare(null);
			fail("Nuu avem culoare de la client");
		}
		catch(Exception ex) {
			
		}
	}
	
	@Test
	public void test_lipsa_pret() {
		try {
			Pliant pliant = new Pliant();
			pliant.setPret(0);
			fail("Nu avem pret");
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
