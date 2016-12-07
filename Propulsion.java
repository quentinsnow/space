
import java.util.Random;


public class Propulsion 
{
	private int Portee; 
	private int Reservoir;
	private int LimiteReserv;
	
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
