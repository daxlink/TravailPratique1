package main;

import java.util.ArrayList;

public class Commandes {
	Client client;
	Plats plat;
	ArrayList<Plats> tabPlat = new ArrayList<Plats>();
	ArrayList<Integer> tabQuantite = new ArrayList<Integer>();

	public Commandes(Client client, Plats plat, int nombresPlats) {
		this.client = client;
		this.plat = plat;
		this.tabPlat.add(plat);
		this.tabQuantite.add(nombresPlats);

	}

	public Client getClient() {
		return client;
	}

	public Plats getPlat() {
		return plat;
	}

	public void getAvantTaxe() {
		int nbrePlats;
		for (Plats plats : tabPlat) {
			nbrePlats = tabQuantite.get(tabPlat.indexOf(plats));
			
			System.out.println(nbrePlats + " " + plats.getNom() + " "
					+ (plats.getPrix() * tabQuantite.get(tabPlat.indexOf(plats))));

		}

	}

	public double getTps() {
		double avantTaxe = 0;
		double tps = 0.05;
		double montantTps = 0;

		for (Plats plats : tabPlat) {
			avantTaxe += (plats.getPrix() * tabQuantite.get(tabPlat.indexOf(plats)));
			montantTps = avantTaxe * tps;
		}

		return montantTps;
	}

	public double getTvq() {
		double avantTaxe = 0;
		double tvq = 0.09975;
		double montantTvq = 0;

		for (Plats plats : tabPlat) {
			avantTaxe += (plats.getPrix() * tabQuantite.get(tabPlat.indexOf(plats)));
			montantTvq = avantTaxe * tvq;
		}

		return montantTvq;
	}

	public double getTotal() {
		double prixTotal = 0;
		double avantTaxe = 0;
		double tps = 0.05;
		double tvq = 0.09975;
		double montantTps;
		double montantTvq;

		for (Plats plats : tabPlat) {
			avantTaxe += (plats.getPrix() * tabQuantite.get(tabPlat.indexOf(plats)));
			montantTps = avantTaxe * tps;
			montantTvq = avantTaxe * tvq;
			prixTotal = avantTaxe + montantTps + montantTvq;
		}

		return prixTotal;
	}

	public void ajouterPlats(Plats plat, int quantite) {

		tabPlat.add(plat);
		tabQuantite.add(quantite);

	}

}
