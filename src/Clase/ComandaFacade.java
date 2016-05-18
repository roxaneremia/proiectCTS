package Clase;

public class ComandaFacade {
	public static void seDesfasoaraComanda(String nume, int nrOperatii) {
		ComandaDeDesfasurat comanda = new ComandaDeDesfasurat(nume);
		Platforma platforma = new Platforma(nrOperatii);
		
		platforma.inceputComanda();
		platforma.comanda();
		
		Scenariu p = new Scenariu(nrOperatii);
		p.intraInScenariu();
		platforma.comanda();
		comanda.play(platforma);
		platforma.sfarsitComanda();
	}
}
