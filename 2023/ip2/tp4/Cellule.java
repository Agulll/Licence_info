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
	public void affiche()
	{
		this.rob.desctription();
		if(this.suivant != null)
		{
			this.suivant.affiche();
		}
	}
	public void ajouteNouveau(Robot r)
	{
		if(r.nomCorrect())
		{
			if(this.suivant == null)
			{
				this.suivant = new Cellule(r);
			}
			else
			{
				this.suivant.ajouteNouveau(r);
			}
		}
		else
		{
			System.out.println("Bad Name !");
		}
	}
	public String bandName()
	{
		if(this.suivant == null)
		{
			return(this.rob.getNom()+"");
		}
		else
		{
			return(this.rob.getNom()+this.suivant.bandName());
		}
	}
	public void chantez()
	{
		this.rob.chante();
		if(this.suivant != null)
		{
			this.suivant.chantez();
		}
	}
	public Cellule couperAPartirDe(char nom)
	{
		if(this.rob.getNom()==nom)
		{
			return(this.suivant);
		}
		else if(this.suivant != null)
		{
			return(this.suivant.couperAPartirDe(nom));
		}
		else
		{
			return(null);
		}
	}
}
