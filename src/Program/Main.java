package Program;

import Clase.AProgram;
import Clase.Administrator;
import Clase.Afis;
import Clase.AfisBuilder;
import Clase.Builder;
import Clase.Client;
import Clase.ComandaFacade;
import Clase.ComandaHandler;
import Clase.DesignerFactory;
import Clase.EnumMaterialePublicitare;
import Clase.ImplementeazaSolutie;
import Clase.Livrare;
import Clase.MasterCard;
import Clase.PayPal;
import Clase.Pliant;
import Clase.Poster;
import Clase.Program;
import Clase.ProgramAdaptat;
import Clase.ProgramBazaDecorator;
import Clase.ProgramNouDecorator;
import Clase.PublicaCerinte;
import Clase.Tiparire;
import Clase.Visa;
import Interfete.IProgram;


public class Main {
	
	static void functie(IProgram programFolosit) {
		programFolosit.InDesign();
		programFolosit.Photoshop();
		programFolosit.Corel();
	}

	public static void main(String[] args) {

		System.out.println("Merge bine proiectul");
		System.out.println("");
		
		//Implementare Singleton
		System.out.println("Implementare Singleton");
		Administrator a1 = Administrator.getInstance("Eremia", "Roxana", "roxana.eremia", "parolaCTS", "roxana.eremia94@gmail.com", "0723456789", "Toate");
		System.out.println(a1.toString());
		System.out.println("Mai putem avea un administrator?");
		Administrator a2 = Administrator.getInstance("Anastase", "Alexandra", "anastase.alexandra", "parolaCTSS", "alexandra.anastase@yahoo.com", "0743456789", "Toate");
		System.out.println(a2.toString());
		System.out.println("Raspuns: administratorul este unic!");
		
		System.out.println("");
		
		//Implementare Simple Factory
		System.out.println("Implementare Factory");
		DesignerFactory designer = new DesignerFactory();
		Afis afis = (Afis)designer.createObject(EnumMaterialePublicitare.Afis);
		System.out.println(afis.publica());
		Pliant pliant = (Pliant)designer.createObject(EnumMaterialePublicitare.Pliant);
		System.out.println(pliant.publica());
		Poster poster = (Poster)designer.createObject(EnumMaterialePublicitare.Poster);
		System.out.println(poster.publica());
		
		System.out.println("");
		
		//Implementare Builder
		System.out.println("Implementare Builder");
		// TODO Auto-generated method stub
		Afis af1 = new Afis();
		af1.setFormat("A4");
		af1.setCuloare("rosu");
		af1.setPret(23);
		af1.setSpecificatii("Sa puna in evidenta noile tehnologii de pe piata. Sa fie sugestiv si prietenos. Sa atraga atentia");
		System.out.println("Primul afis este: " + af1.toString());
					
		Afis af2 = new AfisBuilder().setFormat("A5").setCuloare("mov").setPret(10).setSpecificatii("Sa fie despre masini.").build();
		System.out.println("Al doilea afis este: " + af2.toString());
					
		Afis af3 = new Builder().setFormat("A3").setCuloare("roz").setPret(30).setSpecificatii("Sa fie despre papusi.").build();
		System.out.println("Al treilea caine este " + af3.toString());
		
		System.out.println("");
		
		//Implementare Strategy
		System.out.println("Implementare Strategy");
		Client cl1 = new Client("Coman", "Corina", "corina.coman", "parolaCTScori", "corina.coman@gmail.com", "0723453781", "plateste, posteaza, primeste" ,null,new Visa());
		Client cl2 = new Client("Cartianu", "Ileana", "ileana.cartianu", "parolaCTSilee", "ilee.cartianu@gmail.com", "0745453781", "posteaza, primeste" ,null,new PayPal());
		Client cl3 = new Client("Ciobanu", "Cristina", "cristina.ciobanu", "parolaCTScrs", "cristina.ciobanu@gmail.com", "0725453781", "plateste" ,null,new MasterCard());
		System.out.print(cl1.getPrenume() + " ");
		cl1.plateste();
		System.out.print(cl2.getPrenume() + " ");
		cl2.plateste();
		System.out.print(cl3.getPrenume() + " ");
		cl3.plateste();
		System.out.println("Ilee isi schimba modalitatea de plata");
		cl2.setMod(new MasterCard());
		System.out.print(cl2.getPrenume() + " ");
		cl2.plateste();
		System.out.println("Cristina isi schimba modalitatea de plata");
		cl3.setMod(new Visa());
		System.out.print(cl3.getPrenume() + " ");
		cl3.plateste();
		
		System.out.println("");
		
		//Implementare Chain of Responsability
		ComandaHandler publica = new PublicaCerinte();
		ComandaHandler implementeaza = new ImplementeazaSolutie();
		ComandaHandler tiparire = new Tiparire();
		ComandaHandler livrare = new Livrare();
		
		publica.setServiciulUrmator(implementeaza);
		implementeaza.setServiciulUrmator(tiparire);
		tiparire.setServiciulUrmator(livrare);
		System.out.println("Clientul publica cerintele");
		publica.comanda("dePublicat");
		System.out.println("Designerul implementeaza solutia");
		publica.comanda("deImplementat");
		System.out.println("Tipografia printeaza materialele publicitare");
		publica.comanda("deTiparit");
		System.out.println("Curierul livreaza materialele publicitare la destinatie");
		publica.comanda("deLivrat");
		
		System.out.println("");
		
		//Implementare Observer
		System.out.println("Implementare Observer");
		Client clientSubject = new Client();
		DesignerFactory designerSubject = new DesignerFactory();
		Administrator adminObserver =  new Administrator();
		
		clientSubject.add(adminObserver);
		designerSubject.add(adminObserver);
		
		clientSubject.comanda("Alexandru Salajan", "afis pentru promovarea unei masini");
		designerSubject.rezolva("Dorin Andrei", "solutia lui Alexandru Salajan");
		
		System.out.println("");
		
		//Implementare Adapter
		System.out.println("Implementare Adapter");
		DesignerFactory designerProgram= new DesignerFactory();
		designerProgram.setNume("Dorin");
		System.out.println(designerProgram.getNume());
		Program program = new Program();
		ProgramAdaptat programFolosit = new ProgramAdaptat(program);
		functie(programFolosit);
		
		System.out.println("");
		
		//Implemenentare Decorator
		System.out.println("Implementare Decorator");
		DesignerFactory designerProgramDecorator= new DesignerFactory();
		designerProgramDecorator.setNume("Dorin");
		IProgram programNou = new ProgramBazaDecorator();
		programNou.InDesign();
		programNou.Photoshop();
		programNou.Corel();
		System.out.println("Elementele de baza sunt");
		System.out.println(designerProgramDecorator.getNume());
		programNou.InDesign();
		programNou.Photoshop();
		programNou.Corel();
		System.out.println("Elementele de noutate");
		System.out.println(designerProgramDecorator.getNume());
		AProgram prNou = new ProgramNouDecorator(programNou);
		prNou.Illustrator();
		prNou.AdobeFireworks();
	
		System.out.println("");
		
		//Implementare Facade
		System.out.println("Implementare Facade");
		ComandaFacade.seDesfasoaraComanda("comanda1",4);
		
		System.out.println("");
		System.out.println("Sfarsit aplicatie");
	}
}

