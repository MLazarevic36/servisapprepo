package app;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Administrator;
import model.Automobil;
import model.Deo;
import model.Marka_auta;
import model.Model_auta;
import model.Musterija;
import model.Servis;


public class ServisApplication {

	public static void main(String[] args) throws IOException {
		
		Administrator admin = new Administrator();
		admin.setIme("Gini");
		admin.setPrezime("Wijnaldum");
		admin.setKorisnicko_ime("gini");
		admin.setLozinka("mid");
		admin.setAdresa("Anfield Road 30");
		admin.setJMBG("5446464684767");
		admin.setBroj_telefona("104564305");
		admin.setPlata(2000);
		admin.setPol("muski");
		
//		admin.dodajAdministratora(admin);
//		Integer id = 3;
//		admin.izmeniAdministratora(id, admin);
//		admin.obrisiAdministratora(id);
		
//		Musterija musterija = new Musterija();
//		musterija.setPrezime("Beker");
		
//		Automobil automobil = new Automobil();
//		automobil.setVlasnik(musterija);
//		automobil.setMarka(Marka_auta.VOLKSWAGEN);
//		automobil.setModel(Model_auta.GOLF7);
//		automobil.setGodina_proizvodnje(2019);
//		automobil.setZapremina_motora("36");
//		automobil.setSnaga_motora("250");
//		automobil.setVrsta_goriva("dizel");
//		
//		Integer idMusterije = 2; //ovaj id ces izvuci preko swinga kad budes birao koji je musterija
//		
//		automobil.dodajAutomobil(idMusterije, automobil);
		
//		Integer idZaIzmenu = 3;
//		
//		automobil.izmeniAutomobil(idZaIzmenu, automobil);
//		
//		automobil.obrisiAutomobil(3);
		
		List<Deo> delovi = new ArrayList<>();
		Deo prviDeo = new Deo();
		Deo drugiDeo = new Deo();
		prviDeo.setId(1);
		prviDeo.setNaziv("vrata");
		drugiDeo.setId(2);
		drugiDeo.setNaziv("motor");
		delovi.add(prviDeo);
		delovi.add(drugiDeo);
		
		//ovaj deo sa listom trenutno zanemari, ti ces preko swinga verovatno iz nekog dropdown menija
		//(u dropdown ces ucitati delove iz njihovog falja) birati koji se delovi servisiraju 
		//i onda ces moci da izvuces njihove id-eve pa ces tek onda inicijalizovati objekte i listu delova
		//koju ces proslediti metodi dodajServis (izmenio sam malo metode, klase i fajlove, pogledaj detaljno)   
		
		Servis servis = new Servis();
		servis.setTermin("10:00");
		servis.setOpis("opis novih kola");
		servis.setStatus_servisa("prosao");
		
		servis.dodajServis(2, 2, delovi, servis);
		
		
	}

}
