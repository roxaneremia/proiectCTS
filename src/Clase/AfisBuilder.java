package Clase;

import Interfete.IAfisBuilder;

public class AfisBuilder implements IAfisBuilder {
	//Declarare atribute pentru clasa Afis
	private String format;
	private String culoare;
	private float pret;
	private String specificatii;
	
	//Constructor cu si fara paramatrii	
		public AfisBuilder(String format, String culoare, float pret, String specificatii) {
			super();
			this.format = format;
			this.culoare = culoare;
			this.pret = pret;
			this.specificatii = specificatii;
		}
		
		public AfisBuilder() {
			this.format = "";
			this.culoare = "";
			this.pret = 0;
			this.specificatii = "";	
		}
		
		//Getteri si setteri
		public String getFormat() {
			return format;
		}

		public AfisBuilder setFormat(String format) {
			this.format = format;
			return this;
		}
		
		public String getCulaore() {
			return culoare;
		}

		public AfisBuilder setCuloare(String culoare) {
			this.culoare = culoare;
			return this;
		}
		public float getPret() {
			return pret;
		}

		public AfisBuilder setPret(float pret) {
			this.pret = pret;
			return this;
		}

		public String getSpecificatii() {
			return specificatii;
		}

		public AfisBuilder setSpecificatii(String specificatii) {
			this.specificatii = specificatii;
			return this;
		}

		@Override
		public Afis build() {
			return new Afis(format,culoare,pret,specificatii);
		}

		//Metoda toString()
		@Override
		public String toString() {
			return "AfisBuilder [format=" + format + ", culoare=" + culoare + ", pret=" + pret + ", specificatii="
					+ specificatii + "]";
		}
		
		
}
