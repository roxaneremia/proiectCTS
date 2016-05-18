package Clase;

import java.util.ArrayList;
import java.util.List;

import Interfete.ModPlata;
import Interfete.Observer;
import Interfete.Subiect;

public class Client implements ModPlata, Subiect {
	//Atribute pentru clasa Client
	private String nume;
	private String prenume;
	private String user;
	private String parola;
	private String email;
	private String telefon;
	private String drepturi;
	private String cerinte;
	private ModPlata mod;
	private List<Observer> lista = new ArrayList<Observer>();
	
	//Constructori cu si fara parametrii
	public Client(String nume, String prenume, String user, String parola, String email, String telefon,
			String drepturi, String cerinte, ModPlata mod) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.user = user;
		this.parola = parola;
		this.email = email;
		this.telefon = telefon;
		this.drepturi = drepturi;
		this.cerinte = cerinte;
		this.mod = mod;
	}
	
	public Client() {		
		super();
	}
	
	//Getteri si seteri pentru clasa Client
	
	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public void setDrepturi(String drepturi) {
		this.drepturi = drepturi;
	}
	
	public void setCerinte(String cerinte) {
		this.cerinte = cerinte;
	}
	
	public void setMod(ModPlata mod) {
		this.mod = mod;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public String getUser() {
		return user;
	}

	public String getParola() {
		return parola;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefon() {
		return telefon;
	}

	public String getDrepturi() {
		return drepturi;
	}
	
	public String getCerinte() {
		return cerinte;
	}

	public ModPlata getMod() {
		return mod;
	}
	
	public List<Observer> getLista() {
		return lista;
	}

	public void setLista(List<Observer> lista) {
		this.lista = lista;
	}
	
	//Metoda din interfata ModPlata
	@Override
	public void plateste() {
		mod.plateste();
	}

	//Metoda toString()
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", prenume=" + prenume + ", user=" + user + ", parola=" + parola + ", email="
				+ email + ", telefon=" + telefon + ", drepturi=" + drepturi + ", cerinte=" + cerinte + ", mod=" + mod + ", lista=" + lista + "]";
	}
	
	//Interfata Subiect
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
	public void comanda(String nume, String cerinte) {
		System.out.println("Clientul cu numele " + nume + " comanda: " + cerinte);
	}
	
}
