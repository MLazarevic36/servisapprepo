package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import model.Administrator;
import model.Automobil;
import model.Deo;
import model.Marka_auta;
import model.Model_auta;
import model.Musterija;
import model.Servis;
import model.Serviser;

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
		
	}

}
