import java.io.*;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import outilsjava.*;

public class LectureFichier {

	public static void main(String[] args) {
		boolean peutContinuer = true;

		String nomFicTest;
		String texteFic = null;
		
		BufferedReader fic = new BufferedReader( new InputStreamReader( System.in ) );
		
		nomFicTest = OutilsFichier.lireNomFichier( "\nEntrez le nom du fichier qui contient les commandes : " );

		fic = OutilsFichier.ouvrirFicTexteLecture( nomFicTest );
		
		if ( fic == null ) {
			peutContinuer = false;
		} else {
			texteFic = fic.toString();
			
			if (!bonFormat(texteFic)) {
				peutContinuer = false;
			}
		}
		
		if ( peutContinuer ) {

			OutilsLecture.fic = fic;

			System.out.print(texteFic);

		} else {
			System.out.println( "\nImpossible de tester le programme." );
		}

	}
	
	public static boolean bonFormat( String texteFic ) {
		
		Regex format = new Regex("Clients ?: ?[a-zA-ZÀ-ÿ]* ?Plats ?: ?([a-zA-ZÀ-ÿ]*[0-9. _]*)*Commandes ? : ?([a-zA-ZÀ-ÿ]*[0-9. _]*)*Fin");
		
		if (texteFic.matches(format.toString())) {
			System.out.println("REUSSI");
		}
		
		return true;
	}
	
}
