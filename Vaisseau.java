
import java.util.Random;


public class Vaisseau extends Entite
{
	/**
	 * @param Integr L'intégrité du vaisseau 
	 * @param Res La valeur maximum que peut avoir Integr
	 * @param Prop La propulsion que posséde le vaisseau
	 * @param Equip L'equipement que posséde le vaisseau
	 */
	private int Integr ; 
	private int Res;
	private Propulsion Prop; 
	private Equipement Equip ;
	
	public Vaisseau(int id)
	{
		super(id);
		Random rand = new Random();
		this.Res = Math.abs(rand.nextInt())%10+1;
		this.Integr = 0;
		this.Prop = new Propulsion();
		this.Equip = new Equipement();
		//TODO ajouter propusion et equipement 
	}
	public void construction(Planete p, Espece A )
	{
		int truc = (int)(p.getPopu()*A.getTxnat());
		Integr = Math.min(Res,Integr + truc);
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
