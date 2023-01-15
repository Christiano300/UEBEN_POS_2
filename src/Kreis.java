public class Kreis {
//	Ein Kreis hat einen Radius (double) mit default 1.0 und eine Farbe (String) mit default "rot"
	private double radius;
	private String farbe;

//	3 Konstruktoren - parameterlos; Radius; Radius & Farbe (Konstruktorverkettung!)

	public Kreis(double radius, String farbe) {
		this.radius = radius;
		this.farbe = farbe;
	}

	public Kreis(double radius) {
		this(radius, "rot");
	}

	public Kreis() {
		this(1.0);
	}

	//	Zugriffsmethoden für den Radius, einen Getter für die Farbe,

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getFarbe() {
		return farbe;
	}

	// toString, <farbe>er Kreis mit Radius <radius>

	@Override
	public String toString() {
		return farbe + "er Kreis mit Radius " + radius;
	}

//	getFlaeche und getUmfang, auf Pi mit Math.PI zugreifen
	public double getFlaeche() {
		return radius * radius * Math.PI;
	}

	public double getUmfang() {
		return 2 * radius * Math.PI;
	}
}
