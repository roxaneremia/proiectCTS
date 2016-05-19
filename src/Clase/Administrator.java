package Clase;

import Interfete.Observer;

public class Administrator implements Observer {
	
	//Declarare atribute pentru claasa Administrator
	private String nume;
	private String prenume;
	private String user;
	private String parola;
	private String email;
	private String telefon;
	private String drepturi;
	private static Administrator admin;
	
	//Constructori: fara si cu parametrii
	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Administrator(String nume, String prenume, String user, String parola, String email, String telefon,
			String drepturi) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.user = user;
		this.parola = parola;
		this.email = email;
		this.telefon = telefon;
		this.drepturi = drepturi;
	}

	//Getteri si setteri
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getDrepturi() {
		return drepturi;
	}

	public void setDrepturi(String drepturi) {
		this.drepturi = drepturi;
	}

	public static Administrator getAdmin() {
		return admin;
	}

	public static void setCaine(Administrator admin) {
		Administrator.admin = admin;
	}
	
	//Metoda getInstance pentru a-l face pe Administrator sa fie unic
	//Alaturi de atributul private static Administrator admin;
	public static Administrator getInstance(String nume, String prenume, String user, String parola, String email, String telefon, String drepturi) {
		if(admin == null)
			admin = new Administrator(nume, prenume, user, parola, email, telefon, drepturi);
		return admin;
	}

	//Metoda toString()
	@Override
	public String toString() {
		return "Administrator [nume=" + nume + ", prenume=" + prenume + ", user=" + user + ", parola=" + parola
				+ ", email=" + email + ", telefon=" + telefon + ", drepturi=" + drepturi + "]";
	}

	//Metoda din interfata Observer
	@Override
	public void update(String mesaj) {
		System.out.println(mesaj);
	}
	
	public int calculeaza_suma(int comanda,int tiparire, int livrare){
		return comanda+tiparire+livrare;
	}
	
	public int dezactivare_cont_utilizator(int u1, int u2) {
		return u1-u2;
	}
}
