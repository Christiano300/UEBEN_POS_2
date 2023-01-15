package punkt_linie;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinieTest {
	@Test
	void testGettersAndSetters1() {
//		Linie linie = new Linie(new Punkt(3, 5), new Punkt(4, 6));
		Linie linie = new Linie(new Punkt(0, 0), new Punkt(0, 0));

		linie.setAnfangX(3);
		linie.setAnfangY(5);
		linie.setEndeX(4);
		linie.setEndeY(6);
		assertEquals(3, linie.getAnfangX());
		assertEquals(5, linie.getAnfangY());
		assertEquals(4, linie.getEndeX());
		assertEquals(6, linie.getEndeY());
	}


	@Test
	void testGettersAndSetters2() {
		Linie linie = new Linie(new Punkt(0, 0), new Punkt(0, 0));

		linie.setAnfang(new Punkt(-4, 8));
		linie.setEnde(new Punkt(5, -7));
		assertArrayEquals(new int[]{-4, 8}, linie.getAnfangXY());
		assertArrayEquals(new int[]{5, -7}, linie.getEndeXY());
	}

	@Test
	void testLength() {
		Linie linie = new Linie(3, 5, -4, 8);
		assertEquals(7.61577310, linie.getLength(), 0.001);
	}

	@Test
	void testEquals() {
		Linie linie1 = new Linie(new Punkt(1, 8), new Punkt(-9, 3));
		Linie linie2 = new Linie(new Punkt(-3, -5), new Punkt(2, -2));
		Linie linie3 = new Linie(new Punkt(-3, -5), new Punkt(2, -2));
		assertFalse(linie1.equals(linie2));
		assertTrue(linie2.equals(linie3));
		assertTrue(linie3.equals(linie2));
		assertTrue(linie2.equals(linie2));
	}

	@Test
	void testToString() {
		Linie linie = new Linie(3, 4, 5, 6);
		assertEquals("Linie[anfang=(3|4), ende=(5|6)]", linie.toString());
	}
}