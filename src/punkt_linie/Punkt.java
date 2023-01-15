package punkt_linie;

public class Punkt {
//	Ein Punkt hat eine x-Koordinate (x: int, std. 0) und eine y-Koordinate (y: int, std. 0)
	private int x;
	private int y;
//	Zwei Konstruktoren, einer mit x und y und ein parameterloser (Konstruktorverkettung)

	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punkt() {
		this(0, 0);
	}

	//	getter und setter für x und y

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//	setXY: nimmt x und y und setzt beide

	public void setXY(int x, int y) {
		setX(x);
		setY(y);
	}

//	getXY: gibt x und y in einem array zurück

	public int[] getXY() {
		return new int[]{x, y};
	}

//	distance: double (vier methoden, Methodenverkettung (nur eine Methode soll extra geschrieben sein, die anderen rufen sie nur auf),
//	Wurzel mit Math.sqrt()):
// 1.	nimmt eine x- und eine y-Koordinate und gibt die Distanz von diesem Punkt zum gegebenen zurück
	public double distance(int x, int y) {
		return distance(new Punkt(x, y));
	}

// 2.	nimmt einen Punkt und gibt die Distanz zum gegebenen Punkt zurück
	public double distance(Punkt punkt) {
		return distance(this, punkt);
	}

// 3.	nimmt keine argumente und gibt die Distanz zu (0, 0) zurück
	public double distance() {
		return distance(0, 0);
	}

// 4.	(statische methode) nimmt zwei Punkte und gibt die Distanz zwischen ihnen zurück)
	public static double distance(Punkt a, Punkt b) {
		int dx = a.getX() - b.getX();
		int dy = a.getY() - b.getY();
		return Math.sqrt(dx * dx + dy * dy);
	}

//	toString im Format: (x|y) (Tests selber schreiben)
	@Override
	public String toString() {
		return "(" + x + '|' + y + ')';
	}

//	equals: nimmt einen Punkt und gibt zurück, ob er gleich ist
	public boolean equals(Punkt p) {
		return getX() == p.getX() && getY() == p.getY();
	}
}
