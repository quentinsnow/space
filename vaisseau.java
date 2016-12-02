import java.util.Random;


public class vaisseau extends entite
{
	private int Integr ; 
	private int Res;
	private propulsion Prop; 
	private equipement Machin ;
	
	public vaisseau()
	{
		Random rand = new Random();
		this.Res = Math.abs(rand.nextInt())%10+1;
		this.Integr = this.Res;
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
