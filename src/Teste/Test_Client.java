package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Clase.Client;
import Clase.Visa;

public class Test_Client {

	@Test
	public void test_setNume_null() {
		try {
			Client client = new Client();
			client.setNume(null);
			fail("Clientul nu si-a introdus numele");
		}
		catch(Exception ex) {
			
		}
	}
	
	@Test
	public void test_setEmail_format() {
		try {
			Client client = new Client();
			client.setEmail("ceva");
			fail("Clientul nu si-a introdus email-ul corect");
		}
		catch(Exception ex) {
			
		}
	}
	
	@Test
	public void test_setTelefon_format_inceput() {
		try {
			Client client = new Client();
			client.setTelefon("ceva8394234");
			fail("Clientul nu si-a introdus telefonul corect");
		}
		catch(Exception ex) {
			
		}
	}

	@Test
	public void test_sex_feminin() {
		Client p = new Client("Coman", "Corina", "2941001420045","F","corina.coman", "parolaCTScori", "corina.coman@gmail.com", "0723453781", "plateste, posteaza, primeste" ,null,new Visa());
		String sex = p.getSex();
		assertEquals("F", sex);
	}
	
	@Test
	public void test_sex_masculin() {
		Client p = new Client("Ciobanu", "Razvan", "1941001420045","F","corina.coman", "parolaCTScori", "corina.coman@gmail.com", "0723453781", "plateste, posteaza, primeste" ,null,new Visa());
		String sex = p.getSex();
		assertEquals("M", sex);
	}
	
	@Test
	public void test_varsta_mare() {
		Client p = new Client("Ciocoiu", "Razvan", "316051080020","F","razvan.ciocoiu", "parolaCTScori", "corina.coman@gmail.com", "0723453781", "plateste, posteaza, primeste" ,null,new Visa());
		int varsta=p.get_varsta_client();
		assertEquals(200, varsta);
	}
	
	@Test
	public void test_varsta_mica() {
		Client p = new Client("Cirstica", "Corina", "5160510180020","F","corina.coman", "parolaCTScori", "corina.coman@gmail.com", "0723453781", "plateste, posteaza, primeste" ,null,new Visa());
		int varsta=p.get_varsta_client();
		assertEquals(0, varsta);
	}
	
	@Test
	public void test_cnp_varsta() {
		Client p = new Client("Cirstica", "Corina", "2941001420043","F","corina.coman", "parolaCTScori", "corina.coman@gmail.com", "0723453781", "plateste, posteaza, primeste" ,null,new Visa());
		int varsta=p.get_varsta_client();
		assertEquals(21, varsta);
	}
	
	@Test(timeout=100000000)
	public void test_de_performanta() {
		Client p = new Client();
		p.ciclu_infinit();
	}
}
