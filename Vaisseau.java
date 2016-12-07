
import java.util.Random;


public class Vaisseau extends Entite
{
	private int Integr ; 
	private int Res;
	private Propulsion Prop; 
	private Equipement Machin ;
	
	public Vaisseau()
	{
		Random rand = new Random();
		this.Res = Math.abs(rand.nextInt())%10+1;
		this.Integr = 0;
		this.Prop = new Propulsion();
		this.Machin = new Equipement();
		//TODO ajouter propusion et equipement 
	}
	public int getIntegr()
	{
		return this.Integr;
	}
	public int getRes()
	{
		return this.Res;
	}
	public void SubirDegats(int deg)
	{
		this.Integr = this.Integr - deg ; 
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
