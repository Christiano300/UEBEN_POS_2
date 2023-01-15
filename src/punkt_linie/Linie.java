package punkt_linie;

public class Linie {
//	Eine Linie hat einen Anfangspunkt (anfang: Punkt) und einen Endpunkt (ende: punkt)
	private Punkt anfang;
	private Punkt ende;
//	Zwei Konstruktoren: einer nimmt zwei Punkte, der andere vier Koordinaten (x1, y1, x2, y2) (Konstruktorverkettung)

	public Linie(Punkt anfang, Punkt ende) {
		this.anfang = anfang;
		this.ende = ende;
	}

	public Linie(int x1, int y1, int x2, int y2) {
		this(new Punkt(x1, y1), new Punkt(x2, y2));
	}

	//	getter und setter für Anfangs- und Endpunkt, x- und y-Koordinaten der Punkte, und für x und y der Punkte gleichzeitig (siehe Punkt.getXY())

	public Punkt getAnfang() {
		return anfang;
	}

	public void setAnfang(Punkt anfang) {
		this.anfang = anfang;
	}

	public Punkt getEnde() {
		return ende;
	}

	public void setEnde(Punkt ende) {
		this.ende = ende;
	}

//	--------------------------------------------

	public int getAnfangX() {
		return anfang.getX();
	}

	public void setAnfangX(int x) {
		anfang.setX(x);
	}

	public int getAnfangY() {
		return anfang.getY();
	}

	public void setAnfangY(int y) {
		anfang.setY(y);
	}

	public void setAnfangXY(int x, int y) {
		anfang.setXY(x, y);
	}

	public int[] getAnfangXY() {
		return anfang.getXY();
	}

	public int getEndeX() {
		return ende.getX();
	}

	public void setEndeX(int x) {
		ende.setX(x);
	}

	public int getEndeY() {
		return ende.getY();
	}

	public void setEndeY(int y) {
		ende.setY(y);
	}

	public void setEndeXY(int x, int y) {
		ende.setXY(x, y);
	}

	public int[] getEndeXY() {
		return ende.getXY();
	}

//	getLength: gibt die Länge der Linie zurück
public double getLength() {
	return anfang.distance(ende);
}

//	equals: nimmt eine andere Linie und gibt zurück, ob sie gleich sind (Strg + O)

	public boolean equals(Linie linie) {
		return anfang.equals(linie.anfang) && ende.equals(linie.ende);
	}

//	toString: eigenes Format, test selber schreiben
	@Override
	public String toString() {
		return "Linie[" +
				"anfang=" + anfang +
				", ende=" + ende +
				']';
	}
}
