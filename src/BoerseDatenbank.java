import java.util.ArrayList;
import java.util.Scanner;

public class BoerseDatenbank {
	
	private ArrayList<Fzg> datenbankArray = new ArrayList<>(); 
	
	
	
	//Methoden
	public void alleDatenAusgeben() {
		for (int i = 0; i < datenbankArray.size(); i++) {
			System.out.println(datenbankArray.get(i).getFzgId()+"\t"+ datenbankArray.get(i).getMarke()
					+ " | " +datenbankArray.get(i).getModell()+ " | " +datenbankArray.get(i).getFarbe() 
					+ " | " +datenbankArray.get(i).getBaujahr()+ " | " +datenbankArray.get(i).getPreis());
		}
	}//alleDatenAusgeben
	
	public void fzgAnlegen() {
		//buchliste.add(new Buch(2,"2002",20,a2,200));
			//String Marke, String Modell, String Farbe, int Baujahr, double Preis
			Scanner sc=new Scanner(System.in);
			
			
	        System.out.println("Die Marke eingeben");
	        String marke=sc.nextLine();
	        if (marke.length()!=0) {System.out.println("Eintrag angenommen.");}else {System.out.println("Fehlender Eintrag. Fahrzeug konnte nicht gespeichert werden. Zurück ins Hauptmenü.");MainBoerse.hauptMenue();}
	        System.out.println("Das Modell eingeben");
	        String modell= sc.nextLine();
	        if (modell.length()!=0) {System.out.println("Eintrag angenommen.");}else {System.out.println("Fehlender Eintrag. Fahrzeug konnte nicht gespeichert werden. Zurück ins Hauptmenü.");MainBoerse.hauptMenue();}
	        System.out.println("Die Farbe eingeben");
	        String farbe= sc.nextLine();
	        if (farbe.length()!=0) {System.out.println("Eintrag angenommen.");}else {System.out.println("Fehlender Eintrag. Fahrzeug konnte nicht gespeichert werden. Zurück ins Hauptmenü.");MainBoerse.hauptMenue();}
	        System.out.println("Das Baujahr eingeben");
	        int baujahr= sc.nextInt();
	        if (baujahr!=0) {System.out.println("Eintrag angenommen.");}else {System.out.println("Fehlender Eintrag. Fahrzeug konnte nicht gespeichert werden. Zurück ins Hauptmenü.");MainBoerse.hauptMenue();}
	        System.out.println("Den Preis eingeben");
	        double preis= sc.nextDouble();
	        if (preis!=0) {System.out.println("Eintrag angenommen.");}else {System.out.println("Fehlender Eintrag. Fahrzeug konnte nicht gespeichert werden. Zurück ins Hauptmenü.");MainBoerse.hauptMenue();}
	        
	        System.out.println("Was soll angelet werden? 1)Fahrzeug 2)Pkw 3)Lkw 4)Motorrad 5)Boot");
			int eingabehzf = sc.nextInt();
			
	        switch (eingabehzf) {
			case 1:
				Fzg fzg = new Fzg(marke, modell, farbe, baujahr, preis);
				this.datenbankArray.add(fzg);
				System.out.println("Fahrzeug hinzugefügt");
				break;
			case 2:
				Pkw pkw = new Pkw(marke, modell, farbe, baujahr, preis);
				this.datenbankArray.add(pkw);
				System.out.println("Pkw hinzugefügt");
				break;
			case 3:
				Lkw lkw = new Lkw(marke, modell, farbe, baujahr, preis);
				this.datenbankArray.add(lkw);
				System.out.println("Lkw hinzugefügt");
				break;
			case 4:
				Motorrad mr = new Motorrad(marke, modell, farbe, baujahr, preis);
				this.datenbankArray.add(mr);
				System.out.println("Lkw hinzugefügt");
				break;
			case 5:
				Boot bt = new Boot(marke, modell, farbe, baujahr, preis);
				this.datenbankArray.add(bt);
				System.out.println("Lkw hinzugefügt");
				break;

			default:
				System.out.println("Fehlerhafte Eingabe.");
				break;
			}//switch
		
	        System.out.println("Zurück ins Hauptmenü(1) oder neuen Eintrag(2)?");
	        Scanner mc= new Scanner(System.in);
	        int eingabe = mc.nextInt();
	        switch (eingabe) {
	    	case 1:		
	    		break;
	    	case 2:
	    		fzgAnlegen();;
	    		break;

	    	default:
	    		break;
	        }//switch    
		
	}//fzgAnlegen
	
	public void dummyAnlegen(String Marke, String Modell, String Farbe, int Baujahr, double Preis) {
	Fzg fzg = new Fzg(Marke, Modell, Farbe, Baujahr, Preis);
	this.datenbankArray.add(fzg);
	//fzgliste.add(m1);
}//fzgAnlegen
	
	public void fzgBearbeiten() {
		
		System.out.println("\nWählen Sie die Nummer des zu bearbeitende Fahrzeuges.");
		Scanner bc= new Scanner(System.in);
        int zubearbeitendeID = bc.nextInt();
        
        
        for (int i = 0; i<datenbankArray.size();i++){//Abfrage der ArrayList
        	System.out.println("Suche nach "+ zubearbeitendeID);
            if(datenbankArray.get(i).getFzgId()==zubearbeitendeID){
            	System.out.println("Bearbeitung der Nummer "+zubearbeitendeID+" startet.");
            	Scanner sc=new Scanner(System.in);	//neue Eintragsangaben
                System.out.println("Die Marke eingeben");
                String marke=sc.nextLine();
                System.out.println("Das Modell eingeben");
                String modell= sc.nextLine();
                System.out.println("Die Farbe eingeben");
                String farbe= sc.nextLine();
                System.out.println("Das Baujahr eingeben");
                int baujahr= sc.nextInt();
                System.out.println("Den Preis eingeben");
                double preis= sc.nextDouble();
                
                System.out.println("Was soll angelet werden? 1)Fahrzeug 2)Pkw 3)Lkw 4)Motorrad 5)Boot");
    			int eingabehzf = sc.nextInt();
    			
    	        switch (eingabehzf) {
    			case 1:
    				Fzg fzg = new Fzg(marke, modell, farbe, baujahr, preis);
    				this.datenbankArray.set(zubearbeitendeID,fzg);
    				System.out.println("Fahrzeug bearbeitet");
    				break;
    			case 2:
    				Pkw pkw = new Pkw(marke, modell, farbe, baujahr, preis);
    				this.datenbankArray.set(zubearbeitendeID,pkw);
    				System.out.println("Pkw bearbeitet");
    				break;
    			case 3:
    				Lkw lkw = new Lkw(marke, modell, farbe, baujahr, preis);
    				this.datenbankArray.set(zubearbeitendeID,lkw);
    				System.out.println("Lkw bearbeitet");
    				break;
    			case 4:
    				Motorrad mr = new Motorrad(marke, modell, farbe, baujahr, preis);
    				this.datenbankArray.set(zubearbeitendeID,mr);    			
    				System.out.println("Lkw bearbeitet");
    				break;
    			case 5:
    				Boot bt = new Boot(marke, modell, farbe, baujahr, preis);
    				this.datenbankArray.set(zubearbeitendeID,bt);
    				System.out.println("Lkw bearbeitet");
    				break;

    			default:
    				System.out.println("Fehlerhafte Eingabe.");
    				break;
    			}//switch    
        	
        	System.out.println("Fahrzeug wurde bearbeitet. Zurück ins Hauptmenü(1)oder erneute Bearbeiten(2)?");
            Scanner mc= new Scanner(System.in);
            int eingabebrt = mc.nextInt();
            switch (eingabebrt) {
        	case 1:		
        		break;
        	case 2:
        		fzgBearbeiten();
        		break;

        	default:
        		break;
            }//switch
               
            }else {System.out.println("Falsche Eingabe. Zurück ins Hauptmenü(1)oder erneute Bearbeiten(2)?");
            Scanner mc= new Scanner(System.in);
            int eingabebrtel = mc.nextInt();
            switch (eingabebrtel) {
        	case 1:	
        		MainBoerse.hauptMenue();
        		break;
        	case 2:
        		fzgBearbeiten();
        		break;

        	default:
        		break;
            }//switch}
            }//else
        }//for
        
		
	}//fzgBearbeiten
	
	public void fzgSuchen() {
		int counter=0;
		Scanner sa= new Scanner(System.in);	//Nutzereingabe
		System.out.println("Den zu suchende Begriff eingeben");
        String suchen = sa.nextLine();
        System.out.println("Suche nach \""+suchen+"\"");
        
        for (int i = 0; i<datenbankArray.size();i++){//Abfrage der ArrayList
            if(datenbankArray.get(i)!=null && (datenbankArray.get(i).getMarke().equals(suchen)
            		|| datenbankArray.get(i).getModell().equals(suchen))
            		|| datenbankArray.get(i).getFarbe().equals(suchen)
            		|| Integer.toString(datenbankArray.get(i).getBaujahr()).equals(suchen)
            		|| Double.toString(datenbankArray.get(i).getPreis()).equals(suchen)){
                System.out.println((counter+1)+".\t"+ datenbankArray.get(i).getMarke()+" | "+datenbankArray.get(i).getModell()
                		+" | "+datenbankArray.get(i).getFarbe()+" | "+datenbankArray.get(i).getBaujahr()
                		+" | "+datenbankArray.get(i).getPreis());
                counter++;
            }
        }//for
        System.out.println("Anzahl der Treffer "+ counter);
        System.out.println("Suche beendet. Zurück ins Hauptmenü(1)oder erneute Suche(2)?");
        Scanner sc= new Scanner(System.in);
        int eingabe = sc.nextInt();
        switch (eingabe) {
		case 1:					
			break;
		case 2:
			fzgSuchen();
			break;

		default:
			break;			
		}
       
	}//fzgSuchen
	
	public void fzgLoeschen() {
		System.out.println("Die zu löschende Nummer eingeben");
		Scanner sc= new Scanner(System.in);
        int zuloeschendeID = sc.nextInt();
        System.out.println("Suche nach Nummer "+zuloeschendeID+" startet.");
        	for (int i=0; i< datenbankArray.size();i++){//Durchsuche ArrayList nach Nummer
        		if(datenbankArray.get(i).getFzgId()==zuloeschendeID) {
        			System.out.println("Soll "+datenbankArray.get(i).getMarke()+" "+datenbankArray.get(i).getModell()+" wirklich gelöscht werden? J/N ");//Sicherheitsabfrage
        			Scanner la = new Scanner(System.in);
        			String loeschabfrage = la.next();
        			if(loeschabfrage.contains("J")||loeschabfrage.contains("j")) {
        				datenbankArray.remove(i);		//Löschvorgang
            			System.out.println("Eintrag wurde gelöscht");
        			}else {
        				System.out.println("Eintrag wurde nicht gelöscht");
        			}
        			
        		}//if
        	}System.out.println("Kein Eintrag gefunden");//forSchleife
        	        	
	}//fzgLoeschen

}//BoerseDatenbank
