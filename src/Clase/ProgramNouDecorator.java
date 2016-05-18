package Clase;

import Interfete.IProgram;

public class ProgramNouDecorator extends AProgram {

	public ProgramNouDecorator(IProgram _program) {
		super(_program);
	}
	
	@Override
	public void Illustrator() {
		System.out.println(" foloseste si Illustrator pentru realizarea unui afis.");	
	}

	@Override
	public void AdobeFireworks() {
		System.out.println(" foloseste si AdobeFireworks pentru realizarea unui pliant.");
	}
	
}
