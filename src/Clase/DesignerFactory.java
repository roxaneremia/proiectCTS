package Clase;

import java.util.ArrayList;
import java.util.List;

import Interfete.IMaterial;
import Interfete.Observer;
import Interfete.Subiect;

public class DesignerFactory implements Subiect {
	public String solutie;
	public String nume;
	private List<Observer> lista = new ArrayList<Observer>();
	
	//Constructori cu si fara parametrii	
	public DesignerFactory(String solutie, String nume, List<Observer> lista) {
		super();
		this.solutie = solutie;
		this.nume = nume;
		this.lista = lista;
	}
	
	public DesignerFactory() {
		super();
	}
	
	//Getteri si setteri
	public String getSolutie() {
		return solutie;
	}

	public void setSolutie(String solutie) {
		this.solutie = solutie;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public List<Observer> getLista() {
		return lista;
	}

	public void setLista(List<Observer> lista) {
		this.lista = lista;
	}
	
	public IMaterial createObject(EnumMaterialePublicitare e) {
		
		switch(e) {
		case Afis: return new Afis();
		case Pliant: return new Pliant();
		case Poster: return new Poster();
		}
		return null;
	}
	

	@Override
	public String toString() {
		return "DesignerFactory [solutie=" + solutie + ", nume=" + nume + ", lista=" + lista + "]";
	}

	//Metode din interfata Subiect
	@Override
	public void add(Observer o) {
		lista.add(o);
	}

	@Override
	public void remove(Observer o) {
		lista.remove(o);
	}

	@Override
	public void notifica(String mesaj) {
		for(Observer p:lista) {
			p.update(mesaj);
		}	
	}	
	
	//Metode proprii in clasa
	public void rezolva(String nume, String solutie) {
		System.out.println("Designerul cu numele " + nume + " rezolva si ofera solutie " + solutie);
	}
}
