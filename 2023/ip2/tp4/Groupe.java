public class Groupe{
	private Cellule chefDeFile;
	public Groupe()
	{
		this.chefDeFile = null;
	}
	public Groupe(Cellule c)
	{
		this.chefDeFile = c;
	}
	public void prendreTete(Robot r)
	{
		if(r.nomCorrect())
		{
			this.chefDeFile.prendreTete(r);
		}
	}
	public void affiche()
	{
		if(this.chefDeFile != null)
		{
			this.chefDeFile.affiche();
		}else
		{
			System.out.println("Nothing in Group !");
		}
	}
	public void ajouteNouveau(Robot r)
	{
		if(r.nomCorrect())
		{
			if(this.chefDeFile == null)
			{
				this.chefDeFile = new Cellule(r);
			}else
			{
				this.chefDeFile.ajouteNouveau(r);
			}
		}
		else
		{
			System.out.println("Bad Name !");
		}
	}
	public String bandName()
	{
		if(this.chefDeFile != null)
		{
			return(this.chefDeFile.bandName());
		}else
		{
			return("Nothing in Group !");
		}
	}
	public int numérologie()
	{
		if(this.chefDeFile != null)
		{
			int sum = 0;
			String str = this.bandName();
			for(char c : str.toCharArray())
			{
				sum+= c-96;
			}	
			return(sum % 9);
		}else
		{
			return(-1);
		}
	}
	public void chantez()
	{
		if(this.chefDeFile != null)
		{
			this.chefDeFile.chantez();
		}
		else
		{
			System.out.println("Nothing in Band");
		}
	}
	public Groupe couperAPartirDe(char nom)
	{
		if(this.chefDeFile != null)
		{
			Cellule c = this.chefDeFile.couperAPartirDe(nom);
			Groupe g = new Groupe(c);
			return(g);
		}
		else 
		{
			return null;
		}
	}
}
