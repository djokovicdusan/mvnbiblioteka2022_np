package rs.ac.fon.nprog.mvnbiblioteka2022.biblioteka;
import rs.ac.fon.nprog.mvnbiblioteka2022.bibliotekaintefejs.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;



public class BibliotekaTest extends BibliotekaInterfejsTest {

	@BeforeEach
	void setUp() throws Exception {
		biblioteka = new Biblioteka();
	}

	@AfterEach
	void tearDown() throws Exception {
		biblioteka = null;
	}

}
