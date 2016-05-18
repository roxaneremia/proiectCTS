package Clase;

import Interfete.IProgram;

public abstract class AProgram {
	IProgram program;
	
	public AProgram(IProgram _program) {
		program = _program;
	}
	
	public abstract void Illustrator();
	public abstract void AdobeFireworks();
	
	public void InDesign(){
		program.InDesign();
	}
	
	public void Photoshop(){
		program.Photoshop();
	}
	
	public void Corel(){
		program.Corel();
	}
}
