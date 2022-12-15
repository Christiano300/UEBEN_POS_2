package buch_autor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuchTest {
	static Autor jkrowling = new Autor("Joanne K.", "Rowling", 57);

	@Test
	void testLesen1() {
		Buch buch = new Buch("Harry Potter und der Orden des Phönix", jkrowling, 960);
		buch.lesen(450);
		assertEquals(405, buch.getGelesen());
	}

	@Test
	void testLesen2() {
		Buch buch = new Buch("Harry Potter und der Orden des Phönix", jkrowling, 960);
		buch.lesen(69420187);
		assertEquals(960, buch.getGelesen(960));
	}

	@Test
	void testSchonGelesen() {
		Buch buch = new Buch("Harry Potter und der Orden des Phönix", jkrowling, 960);
		buch.lesen(960);
		assertTrue(buch.schonGelesen());
	}

	@Test
	void testVerkettung() {
		Buch buch = new Buch("Harry Potter und der Orden des Phönix", jkrowling, 960);
		assertEquals("Rowling", buch.getAutor().getNachname());
	}
}