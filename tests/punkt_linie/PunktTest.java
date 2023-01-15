package punkt_linie;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PunktTest {
	@Test
	void testConstrAndGetters() {
		Punkt punkt = new Punkt();
		assertEquals(0, punkt.getX());
		assertEquals(0, punkt.getY());
	}

	@Test
	void testSetters() {
		Punkt punkt = new Punkt(3, 4);
		punkt.setX(17);
		punkt.setY(5);
		assertEquals(5, punkt.getY());
		assertEquals(17, punkt.getX());
	}

	@Test
	void testGetAndSetXY() {
		Punkt punkt = new Punkt();
		punkt.setXY(3, 5);
		assertArrayEquals(new int[]{3, 5}, punkt.getXY());
	}

	@Test
	void testDistance1() {
		Punkt punkt1 = new Punkt(3, 5);
		Punkt punkt2 = new Punkt(-4, 8);
		assertEquals(7.61577310, punkt1.distance(punkt2), 0.001);
		assertEquals(7.61577310, punkt2.distance(punkt1), 0.001);
		assertEquals(7.61577310, Punkt.distance(punkt1, punkt2), 0.001);
	}

	@Test
	void testDistance2() {
		Punkt punkt = new Punkt(3, -4);
		assertEquals(0, punkt.distance(3, -4), 0.001);
		assertEquals(5, punkt.distance(), 0.001);
	}

	@Test
	void testEquals() {
		Punkt punkt1 = new Punkt(3, 5);
		Punkt punkt2 = new Punkt(-4, 8);
		Punkt punkt3 = new Punkt(-4, 8);
		assertFalse(punkt1.equals(punkt2));
		assertTrue(punkt2.equals(punkt2));
		assertTrue(punkt2.equals(punkt3));
	}

	@Test
	void testToString() {
		Punkt punkt = new Punkt(7, -3);
		assertEquals("(7|-3)", punkt.toString());
	}
}