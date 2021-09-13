
public class Fzg {
	
	// KlassenVariablen
	protected static int nextId=0;
	//Instanzvariablen
	protected int fzgId;
	protected String Marke;
	protected String Modell;
	protected String Farbe;
	protected int Baujahr;
	protected double Preis;
	
	
	/**
	 * 
	 * @param fzgId Indexzähler als Integer
	 * @param Marke	Marke des Fahrzeuges als String
	 * @param Modell Modell des Fahrzeuges als String
	 * @param Farbe	Farbe des Fahrzeuges als String
	 * @param Baujahr Baujahr des Fahrzeuges als Integer
	 * @param Preis Preis des Fahrzeuges als Double
	 */
	//Konstruktor
	public Fzg(String Marke, String Modell, String Farbe, int Baujahr, double Preis ) {
		
		this.fzgId= nextId;
		nextId++;
		this.Marke=Marke;
		this.Modell=Modell;
		this.Farbe=Farbe;
		this.Baujahr=Baujahr;
		this.Preis=Preis;
		
	}

		
	//Setter und Getter
	public int getFzgId() {
		return fzgId;
	}
	public void setFzgId(int fzgId) {
		this.fzgId=fzgId;
	}
	
	public String getMarke() {
		return Marke;
	}

	public void setMarke(String marke) {
		Marke = marke;		
	}

	public String getModell() {
		return Modell;
	}

	public void setModell(String modell) {
		Modell = modell;
	}

	public String getFarbe() {
		return Farbe;
	}

	public void setFarbe(String farbe) {
		Farbe = farbe;
	}

	public int getBaujahr() {
		return Baujahr;
	}

	public void setBaujahr(int baujahr) {
			Baujahr = baujahr;
					
	}

	public double getPreis() {
		return Preis;
	}

	public void setPreis(double preis) {
		Preis = preis;
	}
	

}
