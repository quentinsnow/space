
import java.util.ArrayList;
import java.util.Random;

public class Espece 
{
	private int Id;
	private int Txnat;
	private int Txprod;
	private ArrayList<Entite> truc;
	
	public Espece ()
	{
		Random rand = new Random();
		this.Id = Math.abs(rand.nextInt())%3;
		this.Txnat = Math.abs(rand.nextInt())%10+5;
		this.Txprod = Math.abs(rand.nextInt())%5+1;
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