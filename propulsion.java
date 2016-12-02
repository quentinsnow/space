import java.util.Random;


public class propulsion 
{
	private int Portee; 
	private int Reservoir;
	
	public int getPortee()
	{
		return this.Portee;
	}
	public int getReservoir()
	{
		return this.Reservoir;
	}
	public propulsion()
	{
		Random rand = new Random();
		this.Portee = Math.abs(rand.nextInt())%(Constantes.PropulsionPorteeMax-Constantes.PropulsionPorteeMin) + Constantes.PropulsionPorteeMin ;
		this.Reservoir = Math.abs(rand.nextInt())%20 +10;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
