
import java.util.Random;


public class Propulsion 
{
	/**
	 * @param Portee La distance maximum que le vaisseau peut parcourir en un seul tour 
	 * @param Reservoir Le nombre de case que le vaisseau peut parcourir si le reservoir est vide le vaisseau ne peut plus se deplacer
	 * @param LimiteReserv La valeur maximum que peut avoir le Reservoir 
	*/
	private int Portee; 
	private int Reservoir;
	private int LimiteReserv;
	//Retourne une liste des positions que peut atteindre le vaisseau 
	public int getPortee()
	{
		return this.Portee;
	}
	public int getReservoir()
	{
		return this.Reservoir;
	}
	public Propulsion()
	{
		Random rand = new Random();
		this.Portee = Math.abs(rand.nextInt())%(Constantes.PropulsionPorteeMax-Constantes.PropulsionPorteeMin) + Constantes.PropulsionPorteeMin ;
		this.LimiteReserv = Math.abs(rand.nextInt())%20 +10;
		this.Reservoir = this.LimiteReserv;
	}
	public void Recharge()
	{
		if (this.Reservoir + 5 > this.LimiteReserv)
		{
			this.Reservoir = this.LimiteReserv ; 
		}
		else
		{
			this.Reservoir = this.Reservoir + 5 ; 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
