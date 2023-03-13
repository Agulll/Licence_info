public class Robot{
	private final char nom;//a-z
	private int energie;
	private final String texte;
	public Robot(char nom, String paroles){
	this.nom = nom;
	this.energie = 10 + (int)(Math.random() * 11); //10-20
	this.texte = paroles;
	}
	public String desctription()
	{
		return("Robot "+this.nom+" dit "+this.texte+" quand il parle et a "+this.energie+" points d'énergie.");
	}
	public boolean nomCorrect()
	{
		return((int)this.nom > 96 && (int)this.nom < 123);
	}
	public int getEnergie()
	{
		return this.energie;
	}
	public String getTexte()
	{
		return this.texte;
	}
	public char getNom()
	{
		return this.nom;
	}
	public void chante()
	{
		if(this.energie-10>0)
		{
			String str = "";
			for(int i = 0; i < (this.nom - 96);i++)
			{
				str+=this.texte;
			}
			this.energie-=10;
			System.out.println(str);
		}
	}
}
