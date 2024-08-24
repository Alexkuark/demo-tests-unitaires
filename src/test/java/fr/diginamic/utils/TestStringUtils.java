package fr.diginamic.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStringUtils {

	@Test
	void testlevenshteinDistanceChatChats() {
		assertEquals(StringUtils.levenshteinDistance("chat", "chats"), 1);
	}
	
	@Test
	void testlevenshteinDistanceMachinsMachine() {
		assertEquals(StringUtils.levenshteinDistance("machins", "machine"), 1);
	}
	
	@Test
	void testlevenshteinDistanceAvironAvion() {
		assertEquals(StringUtils.levenshteinDistance("aviron", "avion"), 1);
	}
	
	@Test
	void testlevenshteinDistanceReflexif() {
		assertEquals(StringUtils.levenshteinDistance("distance", "instance"), StringUtils.levenshteinDistance("instance", "distance"));
	}
	
	@Test
	void testlevenshteinDistanceChaineVide() {
		assertEquals(StringUtils.levenshteinDistance("chaine vide", ""), 11);
	}
	
	@Test
	void testlevenshteinDistanceNull() {
		assertEquals(StringUtils.levenshteinDistance("null", null), 4);
	}

}
