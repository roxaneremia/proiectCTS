package Clase;

import Interfete.IMaterial;

public class Afis implements IMaterial{
	//Declarare atribute pentru clasa Afis
	private String format;
	private String culoare;
	private float pret;
	private String specificatii;
		
	//Constructor cu si fara paramatrii	
	public Afis(String format, String culoare, float pret, String specificatii) {
		super();
		this.format = format;
		this.culoare = culoare;
		this.pret = pret;
		this.specificatii = specificatii;
	}
	
	public Afis() {
		this.format = "";
		this.culoare = "";
		this.pret = 0;
		this.specificatii = "";	
	}
	
	
	//Getteri si setteri
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
	public String getCulaore() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
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
		return "Afis [format=" + format + ", culoare=" + culoare + ", pret=" + pret + ", specificatii=" + specificatii + "]";
	}

	@Override
	public String publica() {
		return "DONE Afis";
	}
	

}
