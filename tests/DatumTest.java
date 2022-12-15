import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class DatumTest {
	@Test
	void testDefaultKonstruktor() {
		Datum datum = new Datum();
		assertEquals(1, datum.getTag());
		assertEquals(1, datum.getTagMonat());
		assertEquals(2000, datum.getJahr());
	}

	@Test
	void testSettersAndEquals() {
		Datum datum = new Datum();
		datum.setTag(31);
		datum.setMonat(12);
		datum.setJahr(2022);
		assertTrue(Datum.gleichesDatum(datum, new Datum(31, 12, 2022)));
	}

	@Test
	void testGetters() {
		Datum datum = new Datum(31, 12, 2022);
		assertEquals(31, datum.getTag());
		assertEquals(12, datum.getMonat));
		assertEquals(2022, datum.getJahr());
	}

	@Test
	void testGueltig() {
		assertThrows(IllegalArgumentException.class, () -> { // Darüber keine Gedanken machen, überprüft, ob es einen Fehler gibt
			Datum datum = new Datum(29, 2, 2100); // Soll einen Fehler geben
		});
	}

	@Test
	void testGleich() {
		Datum datum1 = new Datum(21, 1, 2014);
		Datum datum2 = new Datum(21, 1, 2015);
		assertFalse(datum1.istGleich(datum2));
	}

	@Test
	void testGueltig() {
		assertDoesNotThrow(() -> {
			Datum datum = new Datum(31, 12, 2022); // Darf keinen Fehler geben
		});
	}

	@Test
	void testNaechsterTag() {
		Datum datum = new Datum(31, 12, 2021);
		assertTrue(datum.naechsterTag().istGleich(new Datum(31, 12, 2021)));
	}
}