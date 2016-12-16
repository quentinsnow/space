public  class Entite 
{
	/**
	 * @param IdE L'identifiant de l'entite (Planete ou Vaisseau)
	 * @param Posx Position en ordonnée 
	 * @param Posy Position en abscisse
	 * @param EstOccupe  Booléen qui retourne vrai si l'entité est occupe par une espece
	 * 
	 */
	private int IdE ;
	private int Posx;
	private int Posy; 
	private boolean EstOccupe; 
	//TODO ajouter qui possède l'Entite
	public Entite (int id)
	{
		
		
		this.IdE = id;
		this.Posx = 1;
		this.Posy = 1; 
		this.EstOccupe = false;
	}
	public int getIdE()
	{
		return this.IdE;
	}
	public int getPosx()
	{
		return this.Posx;
	}
	public int getPosy()
	{
		return this.Posy;
	}
	public boolean getEstOccupe ()
	{
		return this.EstOccupe; 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
