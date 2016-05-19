package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Clase.Tiparire;

public class Test_Tiparire {

	@Test
	public void check_tiparire_1(){
		try 
		{
			Tiparire tip = new Tiparire();
			tip.verifica_cartus(false);
			fail("Nu se poate tipari comanda");
		}
		catch(Exception ex) 
		{
			
		}
	}
	
	@Test
	public void check_tiparire_2(){
		try 
		{
			Tiparire tip = new Tiparire();
			tip.verifica_material("A12");
			fail("Nu se poate tipari comanda");
		}
		catch(Exception ex) 
		{
			
		}
	}
	
	@Test
	public void total_tiparire_1(){
		int nrMateriale = 25;
		int pret = 5;
		int rezultatAsteptat = 125;
		
		assertEquals(nrMateriale*pret,rezultatAsteptat);
	}
	
	@Test
	public void total_tiparire_2(){
		int total = 625;
		int pret = 5;
		int rezultatAsteptat = 125;
		
		assertEquals(total/pret,rezultatAsteptat);
	}
	
	@Test
	public void oferta_servicii_ROMPRINT() {
			Tiparire tip = new Tiparire();
			assertEquals(tip.promotie_nume_tipografie("ROMPRINT"),"Aveti reducere de 20% in urmatoarea luna");
	}
	
	@Test
	public void oferta_servicii_printARTCo() {
			Tiparire tip = new Tiparire();
			assertEquals(tip.promotie_nume_tipografie("printART Co."),"Aveti reducere de 10% in urmatoarea luna");
	}
	
	@Test
	public void oferta_servicii_RINGIERPRINT() {
			Tiparire tip = new Tiparire();
			assertEquals(tip.promotie_nume_tipografie("RINGIER PRINT"),"Aveti reducere de 25% in urmatoarea luna");
	}
	
}
