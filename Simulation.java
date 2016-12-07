import java.util.ArrayList;
import java.util.Random;

/**
 * @brief Classe gérant la simulation de conquête galactique
 */
public class Simulation {

	/**
	 * 
	 * @return Vrai ssi la partie est terminée
	 */
	public static Boolean victoire() {
		// TODO : à modifier
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// création du panneau d'affichage
		Affichage panneau = new Affichage();

		// création de la fenêtre principale contenant le panneau
		Fenetre fenetre = new Fenetre(panneau);

		// boucle de simulation
		int tour = 0;
		while (!victoire() && tour<Constantes.TourMax) {
			// décompte des tours
			tour += 1;

			// Exécution des étapes du tour courant
			// TODO : à compléter
			
			
			// Affichage d'un bref rapport textuel
			System.out.println("Tour " + tour + " :");
			// TODO : à compléter
			
			// raffraîchissement de la grille
			// TODO : à modifier 
			/////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////
			// CODE FACTICE POUR ILLUSTRER UNE UTILISATION POSSIBLE DE L'AFFICHAGE.
			// PLANETES ET VAISSEAUX SONT ICI REPRESENTÉS PAR DES TABLEAUX
			// D'ENTIERS INDIQUANT LES DONNÉES PERTINENTES POUR LEUR AFFICHAGE.
			// NOTE : AUCUNE VÉRIFICATION DE SUPERPOSITION N'EST FAITE
			Random rand = new Random();
			ArrayList<int[]> listePlanetes = new ArrayList<int[]>();
			ArrayList<int[]> listeVaisseaux = new ArrayList<int[]>();
			for (int i=0; i<tour; i++) {
				int[] p = new int[6];
				p[0] = Math.abs(rand.nextInt())%Constantes.Largeur; // abscisse
				p[1] = Math.abs(rand.nextInt())%Constantes.Hauteur; // ordonnée
				p[2] = Math.abs(rand.nextInt())%(Constantes.PlaneteTailleMax-Constantes.PlaneteTailleMin+1) + Constantes.PlaneteTailleMin; // taille
				p[3] = Math.abs(rand.nextInt())%256; // composante rouge
				p[4] = Math.abs(rand.nextInt())%256; // composante vert
				p[5] = Math.abs(rand.nextInt())%256; // composante bleu
				listePlanetes.add(p);
			}
			for (int i=0; i<tour; i++) {
				int[] p = new int[6];
				p[0] = Math.abs(rand.nextInt())%Constantes.Largeur; // abscisse
				p[1] = Math.abs(rand.nextInt())%Constantes.Hauteur; // ordonnée
				p[2] = Math.abs(rand.nextInt())%(Constantes.VaisseauResistanceMax-Constantes.VaisseauResistanceMin+1) + Constantes.VaisseauResistanceMin; // résistance
				p[3] = Math.abs(rand.nextInt())%256; // composante rouge
				p[4] = Math.abs(rand.nextInt())%256; // composante vert
				p[5] = Math.abs(rand.nextInt())%256; // composante bleu
				listeVaisseaux.add(p);
			}

			panneau.rafraichir(listePlanetes,listeVaisseaux);
			/////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////
			
			// temporisation avant prochain tour
			try {
				Thread.sleep(Constantes.TourMs);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// fermeture de la fenêtre
		fenetre.dispose();
	}

}
