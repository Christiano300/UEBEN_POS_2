package buch_autor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AutorTest {
	@Test
	void testKonstr() {
		Autor autor = new Autor("Dickens");
		assertEquals("Dickens", autor.getNachname());
	}

	@Test
	void testSchreiben() {
		Autor autor = new Autor("Charles", "Dickens", 210);
		Buch buch = new Buch("David Copperfield", autor, 640);
		Buch buch1 = autor.schreiben("David Copperfield", 640);
		assertTrue(buch.istGleich(buch1));
	}

	@Test
	void testAltern() {
		Autor autor = new Autor("Charles", "Dickens", 210);
		assertEquals(211, autor.altern());
		assertEquals(211, autor.getAlter());
	}

	@Test
	void testNameAendern() {
		Autor autor = new Autor("Charles", "Dickens", 210);
		autor.nameAendern("Mark", "Twain");
		assertEquals("Mark", autor.getVorname());
		assertEquals("Twain", autor.getNachname());
	}

	@Test
	void testNameAendern2() {
		Autor autor = new Autor("Charles Dickens");
		Buch buch = autor.schreiben("David Copperfield", 640);
		autor.nameAendern("Mark", "Twain");
		assertEquals("Mark", buch.getAutor().getVorname());
	}
}