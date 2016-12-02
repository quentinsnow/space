import java.util.Random;
public  class entite 
{
	private int idE ;
	private int posx;
	private int posy; 
	private boolean estoccupe; 
	
	public entite ()
	{
		Random rand = new Random();
		this.idE = Math.abs(rand.nextInt())%10;
		this.posx =Math.abs(rand.nextInt())%Constantes.Largeur;
		this.posy = Math.abs(rand.nextInt())%Constantes.Hauteur; 
		this.estoccupe = false;
	}
	public int getidE()
	{
		return this.idE;
	}
	public int getposx()
	{
		return this.posx;
	}
	public int getposy()
	{
		return this.posy;
	}
	public boolean getestoccupe ()
	{
		return this.estoccupe; 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
