import java.util.ArrayList;
import java.util.Random;

public class espece 
{
	private int id;
	private int txnat;
	private int txprod;
	private ArrayList<entite> truc;
	
	public espece ()
	{
		Random rand = new Random();
		this.id = Math.abs(rand.nextInt())%3;
		this.txnat = Math.abs(rand.nextInt())%10+5;
		this.txprod = Math.abs(rand.nextInt())%5+1;
		// TODO ajouter affectation a une planete 
		
		
	}

	public int getid()
	{
		return this.id;
	}
	public int getxnat()
	{
		return this.getxnat();
	}
	public int gettxnat()
	{
		return this.txnat;
	}
	public int gettxprod()
	{
		return this.txprod;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
