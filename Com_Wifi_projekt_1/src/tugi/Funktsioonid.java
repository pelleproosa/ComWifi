package tugi;

import java.io.File;
import java.io.IOException;

import main.GLOBAL;

public class Funktsioonid {
	
	



public static String AsendaStringis(String Tekstiosa, String Asendatav, String Asendaja){
	
	String LoodavTekstiosa;
	String jupp1;
	String jupp2;
	String vahepealneLiidetudOsa;
	int lipp1;
	int lipp2;
	int AsendatavaPikkus;
	int vahepealneLiidetudOsaPikkus;
	int whileX;
	whileX=0;
	LoodavTekstiosa=Tekstiosa;
	vahepealneLiidetudOsa=LoodavTekstiosa;
	
	AsendatavaPikkus=Asendatav.length();
	// DEBUG +
	//System.out.println("Asendatava Pikkus: "+AsendatavaPikkus);
	// DEBUG -
	
	while(whileX<1){
	try
	{
		vahepealneLiidetudOsaPikkus=vahepealneLiidetudOsa.length();
		//System.out.println("vahepealneLiidetudOsa: "+vahepealneLiidetudOsa);
		//System.out.println("vahepealneLiidetudOsaPikkus: "+vahepealneLiidetudOsaPikkus);
		lipp1=vahepealneLiidetudOsa.indexOf(Asendatav);
		jupp1=vahepealneLiidetudOsa.substring(0, lipp1);
		//System.out.println("Jupp1: "+jupp1);
		lipp2=lipp1+AsendatavaPikkus;
		jupp2=vahepealneLiidetudOsa.substring(lipp2, vahepealneLiidetudOsaPikkus);
		//System.out.println("jupp2: "+jupp2);
		vahepealneLiidetudOsa=jupp1+Asendaja+jupp2;
		//System.out.println("vahepealneLiidetudOsa: "+vahepealneLiidetudOsa);
		
		}catch(Exception e){
		//System.out.println("ERROR!!!!");
		//System.out.println("Ilmselt sai STRING otsa ja töö kenasti tehtud :)");
		whileX=1;
		Tekstiosa=vahepealneLiidetudOsa;
	}
	}
	
	
	
	return Tekstiosa;
			}


public static void KontrolliINIFailiOlemasolu(){
File f = new File(GLOBAL.ProgrammiKataloogiAadress+"/ComWifi.ini");
if(f.exists() && !f.isDirectory()) { 
    System.out.println("On olemas!");
}
else{
	System.out.println("Pole olemas!");
	System.out.println("Otsiti: "+GLOBAL.ProgrammiKataloogiAadress+"/ComWifi.ini");
}
}


public static void KustutaINIFail(){




	
	try{
		
		File f = new File(GLOBAL.ProgrammiKataloogiAadress+"/ComWifi.ini");
    	
		if(f.delete()){
			System.out.println(f.getName() + " is deleted!");
		}else{
			System.out.println("Delete operation is failed.");
		}
	   
	}catch(Exception e){
		
		e.printStackTrace();
		
	}
	




}

public static void LooFail(String aadress)
{	
	try {
		 
      File file = new File(aadress);
      
      if (file.createNewFile()){
        System.out.println("File is created!");
      }else{
        System.out.println("File already exists.");
      }
      
	} catch (IOException e) {
      e.printStackTrace();
}
}



}
