
import java.util.Random;


public class Planete extends Entite
{
	/**
	 * @param Taille La taille représente le maximum de population et aussi la taille de sa représentation graphique
	 * @param Popu La piopulation de la planete
	 * @param Constr Un booléen qui retourne vrai si la planete construit un vaisseau 
	 */
	private int Taille; 
	private int Popu;
	private boolean Constr;
	public Planete (int id)
	{
		super(id);
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
	public void construction(int id) //TODO a implementer
	{
		if(Constr)
		{
			
		}
		else if(this.getEstOccupe())
		{
		Vaisseau Xwings = new Vaisseau(id); 
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
