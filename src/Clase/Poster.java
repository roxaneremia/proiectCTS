package Clase;

import Interfete.IMaterial;

public class Poster implements IMaterial{
	//Declarare atribute pentru clasa Poster
	private String format;
	private String culoare;
	private float pret;
	private String specificatii;
		
	//Constructor cu si fara paramatrii	
	public Poster(String format, String culoare, float pret, String specificatii) {
		super();
		this.format = format;
		this.culoare = culoare;
		this.pret = pret;
		this.specificatii = specificatii;
	}
	
	public Poster() {
		super();
	}
	
	
	//Getteri si setteri
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	public String getSpecificatii() {
		return specificatii;
	}

	public void setSpecificatii(String specificatii) {
		this.specificatii = specificatii;
	}
	
	//Metoda toString()
	@Override
	public String toString() {
		return "Poster [format=" + format + ", culoare=" + culoare + ", pret=" + pret + ", specificatii=" + specificatii + "]";
	}

	@Override
	public String publica() {
		return "DONE Poster";
	}
}
