package Teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Test_Administrator.class, Test_Afis.class, Test_Client.class, Test_Comanda.class,
		Test_Designer.class, Test_Livrare.class, Test_Pliant.class, Test_Poster.class, Test_Scenariu.class,
		Test_Tiparire.class, Teste_Materiale_Publicitare.class, Teste_Operatii_Platforma.class,
		Teste_Utilizatori_Platforma.class })
public class Teste_Platforma {

}
