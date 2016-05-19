package Teste;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Clase.Comanda;
import Clase.Operatie;
import Clase.Platforma;
import Clase.Scenariu;

public class Test_Comanda {

	@Test
	public void verifica_suma_in_cont() {
		try
		{
			Comanda com = new Comanda();
			com.setPlata(0);
			fail("Clientul nu a platit comanda");
		}
		
		catch(Exception ex) 
		{
			
		}
	}
	
	@Test
	public void verifica_suma_negativa() {
		try
		{
			Comanda com = new Comanda();
			com.setPlata(-5);
			fail("Clientul nu poate plati cu valori negative");
		}
		
		catch(Exception ex) 
		{
			
		}
	}
	
}


