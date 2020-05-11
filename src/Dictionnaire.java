import java.io.*;
import java.util.*;

public class Dictionnaire extends HashMap<String, Integer> {
	/* === Param�tres de classe === */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private static HashMap<String, Integer> dictionary = new HashMap<String,
	// Integer>();

	/* === Constructeur === */

	public Dictionnaire(String fichier) throws IOException {
		// Lire tout les mots de le fichier attach� et ins�rer dans le dictionnaire de
		// la classe
		super();
		BufferedReader bufReader = new BufferedReader(new FileReader((java.lang.String) fichier));

		String ligne = (String) bufReader.readLine();
		while (ligne != null) { // Si la ligne c'est null, �a signifique qu'il n'y a plus a lire
			// Insere une ligne
			this.put(ligne, 0);
			// Aller a la ligne suivante
			ligne = (String) bufReader.readLine();
		}
		// La lecture du fichier est fini , nous fermons le fichier ^^
		bufReader.close();
	}

	/* === Observateurs === */

	public boolean contains(String value) {
		return this.get(value) != null;
	}

	/* Fonction main pour debugging */

	public static void main(String[] args) throws IOException {
		Dictionnaire dico = new Dictionnaire("dico.txt");
		System.out.println(dico.contains("abaissait"));
		System.out.println(dico.contains("boi"));
	}

} // Termin� Class Dictionnaire