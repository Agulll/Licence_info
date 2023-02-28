import java.awt.Robot;

public class Groupe{
	private Cellule chefDeFile;
	public Groupe()
	{
		this.chefDeFile = null;
	}
	public void prendreTete(Robot r)
	{
		if(r.nomCorrect())
		{
			this.chefDeFile.prendreTete(r);
		}
	}
}
