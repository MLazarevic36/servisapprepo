package app;


import java.io.IOException;

import model.Administrator;
import model.Automobil;
import model.Marka_auta;
import model.Model_auta;
import model.Musterija;


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
		
		Musterija musterija = new Musterija();
		musterija.setPrezime("Firmino");
		
		Automobil automobil = new Automobil();
//		automobil.setVlasnik(musterija);
		automobil.setMarka(Marka_auta.VOLKSWAGEN);
		automobil.setModel(Model_auta.GOLF7);
		automobil.setGodina_proizvodnje(2019);
		automobil.setZapremina_motora("36");
		automobil.setSnaga_motora("250");
		automobil.setVrsta_goriva("dizel");
		
//		Integer idMusterije = 2;
//		
//		automobil.dodajAutomobil(idMusterije, automobil);
		
//		Integer idZaIzmenu = 3;
//		
//		automobil.izmeniAutomobil(idZaIzmenu, automobil);
//		
		automobil.obrisiAutomobil(3);
		
		
	}

}
