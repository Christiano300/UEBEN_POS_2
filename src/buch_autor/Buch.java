package buch_autor;

public class Buch {
// Ein Buch hat einen Titel (String) einen Autor (Autor) und die Anzahl an seiten (int), es merkt sich auch,
// wie viele Seiten schon gelesen wurden (int)
	private String titel;
	private Autor autor;
	private int seiten;
	private int gelesen;
// 1 Konstruktor mit allen sinnvollen(!) Eigenschaften

	public Buch(String titel, Autor autor, int seiten) {
		this.titel = titel;
		this.autor = autor;
		this.seiten = seiten;
	}


// Sinnvolle Zugriffsmethoden für alle Eigenschaften (keine Setter)

	public String getTitel() {
		return titel;
	}

	public Autor getAutor() {
		return autor;
	}

	public int getSeiten() {
		return seiten;
	}

	public int getGelesen() {
		return gelesen;
	}

//	Methode lesen(int seiten), diese Anzahl an Seiten wird gelesen, wenn es über die Anzahl der Seiten hinausgeht,
//	wird gelesen zu den Seiten. z.B.: 5 Seiten -> lesen(10) -> 5 Seiten gelesen
	public void lesen(int seiten) {
		gelesen = Math.min(this.seiten, gelesen + seiten); // Ist die Ideale Lösung. Auch völlig ok ist:

//		schonGelesen += seiten;
//		if (schonGelesen > this.seiten)
//			schonGelesen = this.seiten;

	}

//	Methode schonGelesen, gibt zurück, ob da Buch schon gelesen wurde.
	public boolean schonGelesen() {
		return gelesen >= seiten;
	}

//	Methode istGleich, nimmt ein Buch und gibt zurück, ob es gleich ist. (Autoren mit == vergleichen), schon gelesene Seiten ignorieren
	public boolean istGleich(Buch buch) {
		return buch.seiten == seiten && buch.titel.equals(titel) && buch.autor == autor;
	}

// toString (Test selber schreiben)
	@Override
	public String toString() {
		return "Buch[" +
				"titel=\"" + titel + '"' +
				", autor=" + autor +
				", seiten=" + seiten +
				']';
	}
}
