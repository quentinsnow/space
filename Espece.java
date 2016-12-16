
import java.util.ArrayList;
import java.util.Random;
/**
 * @Brief 
 */
public class Espece 
{
	/**
	 * @param Id identifiant espece
	 * @param Txnat taux de natalité
	 * @param Txprod Taux de productivite
	 * @param Tableau des planete et des vaisseau que possede l'espece
	 * 
	 */
	private int Id;
	private int Txnat;
	private int Txprod;
	private ArrayList<Entite> truc;
	
	public Espece (int id )
	{
		Random rand = new Random();
		this.Id = id;
		this.Txnat = (Math.abs(rand.nextInt())%10+5)/100;
		this.Txprod = (Math.abs(rand.nextInt())%5+1)/100;
		// TODO ajouter affectation a une planete 	
	}

	public int getd()
	{
		return this.Id;
	}
	public int getTxnat()
	{
		return this.Txnat;
	}
	public int getTxprod()
	{
		return this.Txprod;
	}
	public void AjouterEntite(Entite t)
	{
		this.truc.add(t);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
