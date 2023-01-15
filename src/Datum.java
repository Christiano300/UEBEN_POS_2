public class Datum {
	//	Ein Datum hat Tag, Monat & Jahr
	private int tag;
	private int monat;
	private int jahr;
//	2 Konstruktoren, einer parameterlos (1.1.2000) und einer mit Tag, Monat & Jahr. Überprüfung der Werte!
//	Ansonsten IllegalArgumentException werfen

	public static boolean istDatumGueltig(int tag, int monat, int jahr) {
		if (monat < 1 || monat > 12 || tag < 1)
			return false;
		int monatstage = monatstage(monat, jahr);
		return tag <= monatstage;
	}

	private static int monatstage(int monat, int jahr) {
		boolean istSchaltjahr = jahr % 400 == 0 || (jahr % 4 == 0 && jahr % 100 != 0);
		int monatstage = (istSchaltjahr && monat == 2) ? 2 : switch (monat) {
			case 1, 3, 5, 7, 8, 10, 12 -> 31;
			case 4, 6, 9, 11 -> 30;
			case 2 -> 28;
			default -> 0;
		};
		return monatstage;
	}

	public Datum(int tag, int monat, int jahr) {
		if (!istDatumGueltig(tag, monat, jahr))
			throw new IllegalArgumentException();
		this.tag = tag;
		this.monat = monat;
		this.jahr = jahr;
	}

	public Datum() {
		this(1, 1, 2000);
	}

	//	Zugriffsmethoden für Tag, Monat & Jahr (Überprüfung)

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		if (istDatumGueltig(tag, monat, jahr))
			this.tag = tag;
	}

	public int getMonat() {
		return monat;
	}

	public void setMonat(int monat) {
		if (istDatumGueltig(tag, monat, jahr))
			this.monat = monat;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		if (istDatumGueltig(tag, monat, jahr))
			this.jahr = jahr;
	}


//	toString: dd.mm.yyyy

	@Override
	public String toString() {
		return String.format("%02d.%02d.%04d", tag, monat, jahr);
	}

//	statische Methode gleichesDatum, nimmt zwei Daten und gibt zurück, ob sie gleich sind

	public static boolean gleichesDatum(Datum datum1, Datum datum2) {
		return datum1.istGleich(datum2);
	}

//	Instanzmethode istGleich, nimmt ein Datum und gibt zurück, ob es und das aktuelle Objekt gleich sind.

	public boolean istGleich(Datum datum) {
		return datum.tag == tag && datum.monat == monat && datum.jahr == jahr;
	}

//	methode naechsterTag, die den darauffolgenden Tag zurückgibt

	public Datum naechsterTag() {
		int neuTag = tag + 1;
		int neuMonat = monat;
		int neuJahr = jahr;
		if (neuTag > monatstage(monat, jahr)) {
			neuTag = 1;
			neuMonat++;
		}
		if (neuMonat > 12) {
			neuMonat = 1;
			neuJahr++;
		}
		return new Datum(neuTag, neuMonat, neuJahr);
	}
}
