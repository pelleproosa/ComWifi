package tugi;

import main.GLOBAL;

public class TugiMain {
	
	
	public static void SeadistaKataloogiAadress() {
		//     main.Main << Funktsioonid.AsendaStringis >>
		String Asendatav;
		String Asendaja;
		Asendatav= "\\"; // peab panema kaks kaldkriipsu 'java' eripära tõttu!
		Asendaja= "/";
		GLOBAL.ProgrammiKataloogiAadress=(Funktsioonid.AsendaStringis(System.getProperty("user.dir"), Asendatav, Asendaja));
		System.out.println("Tulemus  : "+GLOBAL.ProgrammiKataloogiAadress);
	}
	public static void KontrolliINIFailiOlemasolu(){
		
		//Näha, mis teeb
		
		Funktsioonid.KontrolliINIFailiOlemasolu();
		
		
		
	}
	
	public static  void KustutaINIFail(){
		Funktsioonid.KustutaINIFail();
	}
	
	public static void LooINIFail(){
		Funktsioonid.LooFail((GLOBAL.ProgrammiKataloogiAadress+"/ComWifi.ini"));
	}
	
}
