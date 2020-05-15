package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import model.Administrator;

public class ServisApplication {

	public static void main(String[] args) throws IOException {
		
		FileReader frAdmin = new FileReader("C:\\Users\\hrle9\\eclipse-workspace\\ServisApplication\\src\\app\\administratori");
		BufferedReader brAdmin = new BufferedReader(frAdmin);

		try {
		String fileLine = null;
		
		while ((fileLine =  brAdmin.readLine()) != null) {
			String[] fields = fileLine.split(",");
				
			Administrator admin = new Administrator();
			admin.setIme(fields[0]);
			admin.setPrezime(fields[1]);
			admin.setKorisnicko_ime(fields[2]);
			admin.setLozinka(fields[3]);
			admin.setAdresa(fields[4]);
			admin.setBroj_telefona(fields[5]);
			admin.setJMBG(fields[6]);
			admin.setPlata(fields[7]);
			admin.setPol(fields[8]);
			
			System.out.println(admin);
		}
		} finally {
			brAdmin.close();
		}
		
		
	}

}
