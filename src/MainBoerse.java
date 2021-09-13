import java.util.Scanner;

public class MainBoerse {
	//gloabe Variablen
	private static boolean isRunning = true;
	private static String auswahl;
	//neues Datenbankobjekt
	public static BoerseDatenbank db = new BoerseDatenbank();

	public static void main(String[] args) {
				
		hauptMenue();
		
	}//main
		
	
	//Methoden
		public static void hauptMenue() {
			while(isRunning) {
				System.out.println("While wurde aufgerufen");
				String userEingabe = anzeigeMenue();
			
				switch (userEingabe) {
				case"5":
					dummydaten();
					break;
				case "1":
					System.out.println("Anlegen");
					db.fzgAnlegen();
					break;
				case "2":
					System.out.println("Bearbeiten");
					db.alleDatenAusgeben();
					db.fzgBearbeiten();
					break;
				case "3":
					System.out.println("Suchen");
					db.fzgSuchen();
					break;
				case "4":
					System.out.println("Löschen");
					db.alleDatenAusgeben();
					db.fzgLoeschen();
					break;
				case "0":
					boerseBeenden();
					System.out.println("Programm wird beendet");
					break;
				default:
					System.out.println("Falsche Eingabe, zurück ins Hauptmenü.");
					anzeigeMenue(); //(null)
					break;
				}//switch
			} //while 
		}
		
		public static String anzeigeMenue() {
			System.out.println("MainMenü wurde aufgerufen");
			// String auswahl;
			Scanner sc= new Scanner(System.in);
			
			System.out.println("\n-----------------------------------------------------");
			System.out.println("Fahrzeugbörse\tHauptmenü\tvon: [Andreas Köhler]");
			System.out.println("-----------------------------------------------------");
			System.out.println("1) Fahrzeug anlegen");
			System.out.println("2) Fahrzeug bearbeiten");
			System.out.println("3) Fahrzeug suchen");
			System.out.println("4) Fahrzeug löschen");
			System.out.println("0) Börse beenden");
			System.out.println("5) Dummydaten hinzufügen");
			System.out.println("-----------------------------------------------------");
			System.out.println("Bitte wählen");
			auswahl = sc.next();
			
			return auswahl;		
		}//MethodeMenü
		
		public static void boerseBeenden() {
			System.out.println("Soll wirklich beendet werden? J/N ");//Sicherheitsabfrage
			Scanner sa = new Scanner(System.in);
			String sicherheitsabfrage = sa.next();
			if(sicherheitsabfrage.contains("J")||sicherheitsabfrage.contains("j")) {
				isRunning=false;
				//System.out.println("Isrunning wurde gesetzt");
				hauptMenue();		
    			
			}else {
				System.out.println("Zurück zum Hauptmenü");
				hauptMenue();
			}
			
		}//boerseBeenden
		
		private static void dummydaten() {
			db.dummyAnlegen("Mercedes","Seville","blau",1995,12000);
	        db.dummyAnlegen("Opel","Puma","gelb",2005,10000);
	        db.dummyAnlegen("VW","9-5 3.0","grün",1995,15000);
	        db.dummyAnlegen("Skoda","Variant 75","blau",1995,13000);
	        db.dummyAnlegen("Trabant","A160","grün",1995,15000);
	        db.dummyAnlegen("BMW","Smart","rot",2005,12000);
	        db.dummyAnlegen("Porsche","Roadster Z3","blau",1980,1000);
	        db.dummyAnlegen("VW","Xsara","silber",2013,1000);
	        db.dummyAnlegen("Opel","Prowler","silber",1995,15000);
	        db.dummyAnlegen("VW","Astra","blau",2005,1000);
	        System.out.println("Dummy-Datensätze hinzugefügt");
	        hauptMenue();
		}
		
	

}//MainBoerse
