import java.io.*;
import outilsjava.*;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		boolean peutContinuer = true;

		String texteFic = "";
		String line;

		BufferedReader fic = lireNomFichier();

		if (fic == null) {
			peutContinuer = false;

		} else {
			while ((line = fic.readLine()) != null) {
				texteFic += line;

			}

			if (!bonFormat(texteFic)) {
				peutContinuer = false;

				System.out.println("\nLe fichier n'est pas de bon format.");

			}
		}

		if (peutContinuer) {
			OutilsLecture.fic = fic;

			// TODO ajouter la suite

		} else {
			System.out.println("\nImpossible de tester le programme.");

		}

	}

	public static BufferedReader lireNomFichier() {
		String nomFicTest;

		nomFicTest = OutilsFichier.lireNomFichier("\nEntrez le nom du fichier qui contient les commandes : ");

		return OutilsFichier.ouvrirFicTexteLecture(nomFicTest);

	}

	public static boolean bonFormat(String texteFic) {

		return texteFic.matches(
				"Clients\\ ?:\\ ?[a-zA-ZÀ-ÿ\\ ]*\\ ?"
				+ "Plats\\ ?:\\ ?([a-zA-ZÀ-ÿ]*[0-9\\.\\ \\_]*)*"
				+ "Commandes\\ ? :\\ ?([a-zA-ZÀ-ÿ]*[0-9\\.\\ \\_]*)*Fin");
	}

}
