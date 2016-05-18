package Clase;

import java.util.ArrayList;
import java.util.List;

public class Scenariu {
	
	private List<Operatie> operatii;
	
	public Scenariu(int nrOperatii) {
		operatii = new ArrayList<Operatie>();
		for(int i = 0;  i<nrOperatii; i++)
		{
			operatii.add(new Operatie("Operatie " + i));
		}
	}
	
	public void intraInScenariu() {
		for(Operatie p:operatii) {
			p.seDesfasoara();
		}
	}

}
