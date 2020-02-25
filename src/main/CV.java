package main;

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
		
		System.out.println("Bienvenue chez Barette!\n");
		
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
		System.out.print("Nom :\t\t\t\t\t" + personneCV.nomCV + "\nPr\u00E9nom :\t\t\t\t" + personneCV.prenomCV +
				"\nFormation :\t\t\t\t" + personneCV.formationCV + "\nExp\u00E9rience :\t\t\t\t" + personneCV.experienceCV +
				"\nComp\u00E9tences :");
		
		for (int i = 0; i < personneCV.competencesCV.length; i++) {
			if(i == 0) {
				System.out.println("\t\t\t\t"  + personneCV.competencesCV[i]);
			}else {
				System.out.println("\t\t\t\t\t"  + personneCV.competencesCV[i]);
			}
		}
		System.out.println("Attentes vis à vis le cours 4B4 :\t" + personneCV.attenteCV + "\n");
		
		
	}

}
