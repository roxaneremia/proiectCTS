package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Clase.DesignerFactory;
import Clase.Operatie;
import Clase.Scenariu;

public class Test_Designer {

	@Test
	public void program_InDesign() {
		DesignerFactory designer = new DesignerFactory();
		assertEquals(designer.programUtilizat("Afis"),"InDesign");
	}
	
	@Test
	public void program_Photoshop() {
		DesignerFactory designer = new DesignerFactory();
		assertEquals(designer.programUtilizat("Poster"),"Photoshop");
	}
	
	@Test
	public void program_Corel() {
		DesignerFactory designer = new DesignerFactory();
		assertEquals(designer.programUtilizat("Pliant"),"Corel");
	}

}
