package Clase;

import Interfete.IProgram;

public class ProgramBazaDecorator implements IProgram {
	public void InDesign() {
		System.out.println(" -> foloseste programul InDesign pentru realizarea afisului.");
	}
	
	public void Photoshop(){
		System.out.println(" -> foloseste programul Photoshop pentru realizarea posterului.");
	}
	
	public void Corel(){
		System.out.println(" -> foloseste programul Corel pentru realizarea pliantului.");
	}
}
