package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SaisonTest {

	@Test
	void testValueOfLibelle() {
		Saison s1 = Saison.valueOfLibelle("Automne");
		assertEquals(Saison.AUTOMNE, s1);
		
	}
	
	@Test
	void testValueOfLibelleInexistant() {
		Saison s1 = Saison.valueOfLibelle("Auto");
		assertNull(s1);
		
	}
	
	@Test
	void testValueOfLibelleNull() {
		Saison s1 = Saison.valueOfLibelle(null);
		assertNull(s1);
		
	}

}
