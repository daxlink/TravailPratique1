package main;
import java.util.ArrayList;

public class Commandes {
	Client client;
	ArrayList<Plats> tabPlat = new ArrayList<Plats>();
	ArrayList<Integer> tabQuantite = new ArrayList<Integer>();

	public Commandes(Client client) {
		this.client = client;
		
	}

	public Commandes(Client client, Plats plat, int nombresPlats) {
		this.client = client;
		this.tabPlat.add(plat);
		this.tabQuantite.add(nombresPlats);
		
	}

	public Client getClient() {
		return client;
	}

	public double getTotal() {
		double prixTotal = 0;

		for (Plats plats : tabPlat) {
			prixTotal += (plats.getPrix() * tabQuantite.get(tabPlat.indexOf(plats)));
			
		}
		
		return prixTotal;
	}

	public void ajouterPlats(Plats plat, int quantite) {
		tabPlat.add(plat);
		tabQuantite.add(quantite);
		
	}
	
}
