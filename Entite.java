
import java.util.Random;
public  class Entite 
{
	private int IdE ;
	private int Posx;
	private int Posy; 
	private boolean EstOccupe; 
	
	public Entite ()
	{
		Random rand = new Random();
		this.IdE = ;//trouver une methode pour avoir des id différents pour toute les entites
		this.Posx =Math.abs(rand.nextInt())%Constantes.Largeur;
		this.Posy = Math.abs(rand.nextInt())%Constantes.Hauteur; 
		this.EstOccupe = false;
	}
	public int getIdE()
	{
		return this.IdE;
	}
	public int getPosx()
	{
		return this.Posx;
	}
	public int getPosy()
	{
		return this.Posy;
	}
	public boolean getEstOccupe ()
	{
		return this.EstOccupe; 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
