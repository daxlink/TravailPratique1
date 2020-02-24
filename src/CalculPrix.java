import java.io.BufferedReader;
import java.util.ArrayList;

public class CalculPrix {

	public static void main(String[] args) throws Exception {
		ArrayList<Client> tabClient = new ArrayList<Client>();
		ArrayList<Plats> tabPlat = new ArrayList<Plats>();
		ArrayList<Commandes> tabCommande = new ArrayList<Commandes>();

		BufferedReader allo = LectureFichier.lireNomFichier();

		String ligne = "";

		while ((ligne = allo.readLine()) != null) {
			if (ligne.equals("Clients : ")) {
				while (!(ligne = allo.readLine()).equals("Plats : ")) {
					Client client = new Client(ligne);
					tabClient.add(client);
					Commandes commande = new Commandes(client);
					tabCommande.add(commande);
				}
			}
			if (ligne.equals("Plats : ")) {
				while (!(ligne = allo.readLine()).equals("Commandes : ")) {
					String[] tab = ligne.split(" ");
					Plats plat = new Plats(tab[0], Double.parseDouble(tab[1]));
					tabPlat.add(plat);

				}
			}
			if (ligne.equals("Commandes : ")) {
				while (!(ligne = allo.readLine()).equals("Fin")) {
					String[] tab = ligne.split(" ");
					int index = chercherCommande(tabCommande, tab[0]);
					if (index != -1) {
						if (tabCommande.contains(tabCommande.get(index))) {
							tabCommande.get(index).ajouterPlats(chercherPlat(tabPlat, tab[1]),
									Integer.parseInt(tab[2]));
						}
					} else {
						Commandes commande = new Commandes(chercherClient(tabClient, tab[0]),
								chercherPlat(tabPlat, tab[1]), Integer.parseInt(tab[2]));
						tabCommande.add(commande);
					}
				}
			}

		}
		System.out.println("Bienvenue chez Barette!\nFactures:");

		for (Commandes commandes : tabCommande) {
			System.out.println(commandes.getClient().getNom() + " " + commandes.getTotal() + "$");
		}

	}

	public static Plats chercherPlat(ArrayList<Plats> tab, String nom) {
		Plats temp = null;

		for (Plats plat : tab) {
			if (plat.getNom().equals(nom)) {
				temp = plat;
			}
		}
		return temp;
	}

	public static Client chercherClient(ArrayList<Client> tab, String nom) {
		Client temp = null;

		for (Client client : tab) {
			if (client.getNom().equals(nom)) {
				temp = client;
			}
		}
		return temp;
	}

	public static int chercherCommande(ArrayList<Commandes> tab, String nom) {
		int index = -1;

		for (Commandes commande : tab) {
			if (commande.getClient().getNom().equals(nom)) {
				index = tab.indexOf(commande);
			}
		}
		return index;
	}
}
