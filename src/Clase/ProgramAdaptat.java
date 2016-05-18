package Clase;

import Interfete.IProgram;

public class ProgramAdaptat implements IProgram {
	Program program;
	
	public ProgramAdaptat(Program program) {
		this.program = program;
	}

	@Override
	public void InDesign() {
		program.InDesign();
	}

	@Override
	public void Photoshop() {
		program.Photoshop();
	}

	@Override
	public void Corel() {
		program.Corel();
	}
}
