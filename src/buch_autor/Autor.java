package buch_autor;

public class Autor {
//  Ein Autor hat folgende Eigenschaften:
//	vorname (String) 	default: "Joanne K."
//	nachname (String) 	default: "Rowling"
//	alter (int) 		default: 57

	private String vorname;
	private String nachname;
	private int alter;

//	4 Konstruktor: parameterlos, Nachname, Vor- & Nachname, alle

	public Autor(String vorname, String nachname, int alter) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}

	public Autor(String vorname, String nachname) {
		this(vorname, nachname, 57);
	}

	public Autor(String nachname) {
		this("Joanne K.", nachname);
	}

	public Autor() {
		this("Rowling");
	}

	//	Sinnvolle Zugriffsmethoden (keine Setter)

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getAlter() {
		return alter;
	}


//	Methode altern, macht die Person um ein Jahr älter und gibt das neue Alter zurück.
	public int altern() {
		return ++alter;
	}

//	Methode nameAendern(String vorname, String nachname), ändert den Namen der Person.

	public void nameAendern(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

//	Methode schreiben(String titel, int seiten), erstellt ein neues Buch mit Titel und Seiten und gibt es zurück

	public Buch schreiben(String titel, int seiten) {
		return new Buch(titel, this, seiten);
	}

//	toString - Test selber schreiben


	@Override
	public String toString() {
		return vorname + ' ' + nachname;
	}
}
