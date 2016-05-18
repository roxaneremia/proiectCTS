package Clase;

import Interfete.IAfisBuilder;

public class Builder implements IAfisBuilder {
	private Afis afis;
	
	//Constructor
	public Builder() {
		afis = new Afis();
	}
	
	//Getteri si setteri

	public Builder setFormat(String format) {
		this.afis.setFormat(format);
		return this;
	}

	public Builder setCuloare(String culoare) {
		this.afis.setCuloare(culoare);
		return this;
	}

	public Builder setPret(float pret) {
		this.afis.setPret(pret);
		return this;
	}

	public Builder setSpecificatii(String specificatii) {
		this.afis.setSpecificatii(specificatii);
		return this;
	}

	
	@Override
	public Afis build() {
		return afis;
	}

	//Metoda toString()
	@Override
	public String toString() {
		return "Builder [afis=" + afis + "]";
	}

}
