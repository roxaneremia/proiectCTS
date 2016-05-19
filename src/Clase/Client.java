package Clase;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import Interfete.ModPlata;
import Interfete.Observer;
import Interfete.Subiect;

public class Client implements ModPlata, Subiect {
	//Atribute pentru clasa Client
	private String nume;
	private String prenume;
	private String cnp;
	private String sex;
	private String user;
	private String parola;
	private String email;
	private String telefon;
	private String drepturi;
	private String cerinte;
	private ModPlata mod;
	private List<Observer> lista = new ArrayList<Observer>();
	
	//Constructori cu si fara parametrii
	public Client(String nume, String prenume, String cnp, String sex, String user, String parola, String email, String telefon,
			String drepturi, String cerinte, ModPlata mod) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.cnp = cnp;
		this.sex = sex;
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
		if (nume==null)
			throw new UnsupportedOperationException("Numele clientului nu poate fi null");
		this.nume = nume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public void setEmail(String email) {
		if(!email.contains("@"))
			throw new UnsupportedOperationException("Emailul clientului trebuie sa contina @");
		this.email = email;
	}

	public void setTelefon(String telefon) {
		int length = telefon.length();
		if(!Character.isDigit(telefon.charAt(0)))
				throw new UnsupportedOperationException("Telefonul clientului trebuie sa inceapa cu o cifra");
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
	
	public String getCnp() {
		return cnp;
	}
	
	public String getSex() {
		switch(cnp.charAt(0)){
			case '1': return "M";
			case '2': return "F";
			case '3': return "M";
			case '4': return "F";
			case '5': return "M";
			case '6': return "F";
		}
		return "N/A";
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
	
	public boolean check_cnp(){
		
		int s=0;
		String cnp="279146358279";
		for(int i=0;i<12;i++){
			s+=Integer.parseInt(""+cnp.charAt(i))*Integer.parseInt(""+cnp.charAt(i));			
		}
		int cifra=s%11;
		if(cifra==10)
			cifra=1;
		return cifra==Integer.parseInt(""+cnp.charAt(12));
	}
	
	public int get_varsta_client(){
		Calendar cal = Calendar.getInstance();
		int prima_cifra = Integer.parseInt(""+cnp.charAt(0));
		
		int an_de_adaugat=0;
		if(prima_cifra == 3 || prima_cifra == 4)
		{
			an_de_adaugat = 1800;
		}
		else if(prima_cifra ==1 || prima_cifra == 2)
		{
			an_de_adaugat = 1900;
		}
		else if(prima_cifra == 5 || prima_cifra ==6)
		{
			an_de_adaugat = 2000;
		}

		String an_string=""+cnp.charAt(1)+cnp.charAt(2);
		int an=an_de_adaugat + Integer.parseInt(an_string);
		String lunaString=""+cnp.charAt(3)+cnp.charAt(4);
		int luna=Integer.parseInt(lunaString);
		String ziString=""+cnp.charAt(5)+cnp.charAt(6);
		int zi=Integer.parseInt(ziString);
		
		cal.set(an, luna, zi);
		
		Calendar data_curenta=Calendar.getInstance();
		long varsta=data_curenta.getTimeInMillis()-cal.getTimeInMillis();
		int zile=(int)TimeUnit.MILLISECONDS.toDays(varsta);
		
		//return Calendar.getInstance().get(1) - (1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
		return zile/365;
	}
	
	public void ciclu_infinit()
	{
		while(true)
		{
			int i=1;
		}
	}
}
