package fr.diginamic.utils;

public class DemoStringUtils {

	public static void main(String[] args) {
	
		//TODO La classe semble fonctionne mais fonctionne t'elle si bien que �a ??
		//TODO Que se passe t'il si on lui passe des param�tres inattendus.
		//TODO Mettre en place des tests unitaires permettant de v�rifier que la classe fonctionne
		//     dans tous les cas
		System.out.println(StringUtils.levenshteinDistance("Chine", "Chien"));
		System.out.println(StringUtils.levenshteinDistance("Vienne", "Sienne"));
		
		
	}

}
