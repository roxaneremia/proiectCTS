package Teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;

import Clase.Operatie;
import Clase.Scenariu;

public class Test_Scenariu {

	@Test
	public void lista_null() {
		List<Operatie> operatii = null;
		  try{
			  Operatie op=new Operatie();
			  operatii.add(op);
			  fail("null");
		  }
		  catch(NullPointerException ex){
		   
		  }
	}
	
	@Test
	public void lista_goala() {
		List<Operatie> operatii = new ArrayList<Operatie>();
		  try{
			  Operatie op=new Operatie();
			  //operatii.add(op);
			  Scenariu sp = new Scenariu();
			  assertEquals(0, sp.numaraOperatii());
			  fail("null");
		  }
		  catch(NullPointerException ex){
		   
		  }
	}

}
