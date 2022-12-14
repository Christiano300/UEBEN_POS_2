import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KreisTest {
	@Test
	void testGetAndConst() {
		Kreis kreis = new Kreis();
		assertEquals(1.0, kreis.getRadius());
		assertEquals("rot", kreis.getFarbe());
	}

	@Test
	void testUmfang() {
		Kreis kreis = new Kreis(3.5);
		assertEquals(21.9911, kreis.getUmfang(), 0.01);
	}

	@Test
	void testFlaeche() {
		Kreis kreis = new Kreis(3.5);
		assertEquals(38.4845, kreis.getFlaeche(), 0.01);
	}

	@Test
	void testToString() {
		Kreis kreis = new Kreis(56.1, "türkis");
		assertEquals("türkiser Kreis mit Radius 56.1", kreis.toString());
	}
}