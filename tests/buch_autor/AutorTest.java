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
		assertTrue(buch.istGleich(autor.schreiben("David Copperfield", 640)));
	}

	@Test
	void testNameAendern() {
		Autor autor = new Autor("Charles", "Dickens", 210);
		autor.nameAendern()
	}
}