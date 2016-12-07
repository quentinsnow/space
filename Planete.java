
import java.util.Random;


public class Planete extends Entite
{
	private int Taille; 
	private int Popu;
	private boolean Constr;
	
	public Planete ()
	{
		super();
		Random rand = new Random();
		this.Taille = Math.abs(rand.nextInt())%(Constantes.PlaneteTailleMax-Constantes.PlaneteTailleMin+1) + Constantes.PlaneteTailleMin;
		this.Popu = 0;
		this.Constr = false;
	}
	
	public int getTaille()
	{
		return this.Taille;
	}
	public int getPopu()
	{
		return this.Popu; 
	}
	public boolean getConstr()
	{
		return this.Constr;
	}
	public void augmpopu(Espece alien)
	{
		Popu = Popu*(1+alien.getTxnat()/100);
	}
	public void construction() //TODO a implementer
	{
		Vaisseau Xwings = new Vaisseau(); 
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
