package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Clase.Livrare;

public class Test_Livrare {

	@Test
	public void destinatie_corecta() {
		try
		{
			Livrare destinatie = new Livrare();
			destinatie.destinatie("Constanta");
			fail("Nu se poate livra");
		}

		catch(Exception ex) 
		{
			
		}
	}
	
	@Test
	public void calcul_suma_oras_Buzau() {
			Livrare destinatie = new Livrare();
			int pret = 25;
			int nrMateriale = 5;
			int rezultatAsteptat = 375;
			
			assertEquals(destinatie.suma_livrare_oras("Buzau",pret,nrMateriale),rezultatAsteptat);
	}
	
	@Test
	public void calcul_suma_oras_Brasov() {
			Livrare destinatie = new Livrare();
			int pret = 25;
			int nrMateriale = 5;
			int rezultatAsteptat = 250;
			
			assertEquals(destinatie.suma_livrare_oras("Brasov",pret,nrMateriale),rezultatAsteptat);
	}
	
	@Test
	public void calcul_suma_oras_Bucuresti() {
			Livrare destinatie = new Livrare();
			int pret = 25;
			int nrMateriale = 5;
			int rezultatAsteptat = 125;
			
			assertEquals(destinatie.suma_livrare_oras("Bucuresti",pret,nrMateriale),rezultatAsteptat);
	}

	@Test
	public void suma_livrare_3zile() {
			Livrare destinatie = new Livrare();
			int nrZile = 3;
			int nrMateriale = 5;
			int pret = 20;
			int rezultatAsteptat = 100;
			
			assertEquals(destinatie.suma_livrare_zile(nrZile,pret,nrMateriale),rezultatAsteptat);
	}
	
	@Test
	public void suma_livrare_2zile() {
			Livrare destinatie = new Livrare();
			int nrZile = 2;
			int nrMateriale = 5;
			int pret = 20;
			int rezultatAsteptat = 200;
			
			assertEquals(destinatie.suma_livrare_zile(nrZile,pret,nrMateriale),rezultatAsteptat);
	}
	
	@Test
	public void suma_livrare_1zi() {
			Livrare destinatie = new Livrare();
			int nrZile = 1;
			int nrMateriale = 5;
			int pret = 20;
			int rezultatAsteptat = 400;
			
			assertEquals(destinatie.suma_livrare_zile(nrZile,pret,nrMateriale),rezultatAsteptat);
	}
}
