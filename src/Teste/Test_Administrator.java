package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Clase.Administrator;

public class Test_Administrator {

	@Test
	public void calculeaza_suma_total_comanda() {
		Administrator admin = new Administrator();
		int comanda = 23;
		int tiparire = 15;
		int livrare = 10;
		int suma=admin.calculeaza_suma(comanda, tiparire, livrare);
		
		assertEquals(comanda+tiparire+livrare, suma);
	}
	
	@Test
	public void calculeaza_suma_total_comanda_invers_1termen() {
		Administrator admin = new Administrator();
		int comanda = 27;
		int tiparire = 25;
		int livrare = 13;
		int suma=admin.calculeaza_suma(comanda, tiparire, livrare);
		
		assertEquals(suma-tiparire-livrare, comanda);
	}
	
	@Test
	public void calculeaza_suma_total_comanda_invers_2termeni() {
		Administrator admin = new Administrator();
		int comanda = 19;
		int tiparire = 10;
		int livrare = 5;
		int suma=admin.calculeaza_suma(comanda, tiparire, livrare);
		
		assertEquals(suma-tiparire, livrare + comanda);
	}
	
	@Test
	public void admin_unic_1() {
		String nume = "Vasilescu";
		String prenume = "Andrei";
		String user = "vasilescu.andrei";
		String parola = "user";
		String email = "vasilescu.andrei@admin.ro";
		String telefon = "0723456789";
		String drepturi = "toate";
		Administrator admin = Administrator.getInstance(nume, prenume, user, parola, email, telefon, drepturi);
		
		assertEquals(nume,admin.getNume());
	}
	
	@Test
	public void admin_unic_2() {
		String nume = "Vasilescu";
		String prenume = "Andrei";
		String user = "vasilescu.andrei";
		String parola = "user";
		String email = "vasilescu.andrei@admin.ro";
		String telefon = "0723456789";
		String drepturi = "toate";
		Administrator admin = Administrator.getInstance(nume, prenume, user, parola, email, telefon, drepturi);
		
		assertEquals(user,admin.getUser());
	}
	
	@Test
	public void admin_unic_3() {
		String nume = "Vasilescu";
		String prenume = "Andrei";
		String user = "vasilescu.andrei";
		String parola = "user";
		String email = "vasilescu.andrei@admin.ro";
		String telefon = "0723456789";
		String drepturi = "toate";
		Administrator admin = Administrator.getInstance(nume, prenume, user, parola, email, telefon, drepturi);
		
		assertEquals(drepturi,admin.getDrepturi());
	}
	
	@Test
	public void stergere_cont_utilizator_1() {
		int nrTotalUtilizatori = 27;
		int utilizatoriDeSters = 2;
		int rezultatAsteptat = 25;
		
		assertEquals(nrTotalUtilizatori-utilizatoriDeSters,rezultatAsteptat);
	}
	
	@Test
	public void stergere_cont_utilizator_2() {
		int nrUtilizatoriRamasi = 25;
		int utilizatoriDeSters = 5;
		int rezultatAsteptat = 30;
		
		assertEquals(nrUtilizatoriRamasi+utilizatoriDeSters,rezultatAsteptat);
	}
}
