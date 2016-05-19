package Clase;

import Interfete.IMaterial;

public class Pliant implements IMaterial{
	//Declarare atribute pentru clasa Pliant
	private String format;
	private String culoare;
	private float pret;
	private String specificatii;
		
	//Constructor cu si fara paramatrii	
	public Pliant(String dimensiune, String culoare, float pret, String specificatii) {
		super();
		this.format = format;
		this.culoare = culoare;
		this.pret = pret;
		this.specificatii = specificatii;
	}
	
	public Pliant() {
		super();
	}
	
	
	//Getteri si setteri
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		if(format == null)
			throw new UnsupportedOperationException("Nu exista format");
		this.format = format;
	}
	
	public void setCuloare(String culoare) {
		if(culoare == null)
			throw new UnsupportedOperationException("Nu exista culoare");
		this.culoare = culoare;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		if(pret == 0)
			throw new UnsupportedOperationException("Nu exista pret");
		this.pret = pret;
	}

	public String getSpecificatii() {
		return specificatii;
	}

	public void setSpecificatii(String specificatii) {
		if(specificatii == null)
			throw new UnsupportedOperationException("Nu exista specificatii");
		this.specificatii = specificatii;
	}
	
	//Metoda toString()
	@Override
	public String toString() {
		return "Pliant [format=" + format + ", culoare=" + culoare + ", pret=" + pret + ", specificatii=" + specificatii + "]";
	}

	@Override
	public String publica() {
		return "DONE Pliant";
	}
}
