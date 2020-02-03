
public class CV {
	
	private String nomCV;
	private String prenomCV;
	private String formationCV;
	private int experienceCV;
	private String[] competencesCV;
	private String attenteCV;

	public static void main(String[] args) {
		String tabComptAlexisA[] = {"Bonne gestion du stresse", "Travaille rapidement", "Sens de l'organisation"};
		String tabComptSamiV[] = {"R\u00E9solution de probl\u00E8me", "Souple"};
		
		CV AlexisA = new CV("Archambault", "Alexis", "Emballeur Metro", 4, tabComptAlexisA, "Apprendre \u00E0 cr\u00E9er des logiciels complets, tout en s'assurant qu'il a la meilleur qualit\u00E9 possible.");
		CV SamiV  = new CV ("Vaugeois", "Sami", "Technique Info", 0 , tabComptSamiV, "Apprendre de nouvelles choses.");
		
		CV tabEmploye[] = {AlexisA, SamiV};
		
		System.out.println("Bienvenue chez Barette!");
		
		for (int i = 0; i < tabEmploye.length; i++) {
			affiche(tabEmploye[i]);
		}

	}
	
	public CV(String nom, String prenom, String formation, int experience, String[] competences, String attente) {
		this.nomCV = nom;
		this.prenomCV = prenom;
		this.formationCV = formation;
		this.experienceCV = experience;
		this.competencesCV = competences;
		this.attenteCV = attente;
	}
	
	public static void affiche(CV personneCV) {
		
	}

}
