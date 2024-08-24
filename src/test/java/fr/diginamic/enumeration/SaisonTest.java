package fr.diginamic.enumeration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.diginamic.enumerations.Saison;

class SaisonTest {
	
	@Test
	void testValueOfPrintemps() {
		assertEquals(Saison.valueOfLibelle("Printemps"), Saison.PRINTEMPS);
	}

	@Test
	void testValueOfEte() {
		assertEquals(Saison.valueOfLibelle("Eté"), Saison.ETE);
	}
	
	@Test
	void testValueOfAutomne() {
		assertEquals(Saison.valueOfLibelle("Automne"), Saison.AUTOMNE);
	}
	
	@Test
	void testValueOfHiver() {
		assertEquals(Saison.valueOfLibelle("Hiver"), Saison.HIVER);
	}
	
	@Test
	void testValueOfNull() {
		assertNull(Saison.valueOfLibelle("Autre"));
	}

}
