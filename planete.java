import java.util.Random;


public class planete extends entite
{
	private int Taille; 
	private int Popu;
	private boolean Constr;
	
	public planete ()
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
	public void augmpopu(espece alien)
	{
		Popu = Popu*(1+alien.gettxnat()/100);
	}
	public vaisseau construction()
	{
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
