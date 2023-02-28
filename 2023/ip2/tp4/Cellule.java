public class Cellule{
	private Robot rob;
	private Cellule suivant;
	public Cellule(Robot r,Cellule c)
	{
		this.rob = r;
		this.suivant = c;
	}
	public Cellule(Robot r)
	{
		this(r,null);
	}
	public void prendreTete(Robot r)
	{
		if(r.nomCorrect())
		{
			this.suivant = this;
			this.rob = r;
		}
	}
}
