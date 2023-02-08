public class Utilisateur
{
	private String pseudo;
	private String motDePasse;
	private final String adresseMail;

	Utilisateur(String ps, String mdp, String mail)
	{
		this.pseudo = ps;
		this.motDePasse = mdp; 
		this.adresseMail = mail;
	}

	public boolean testMotDePasse(String mdp)
	{
		return(this.motDePasse.equals(mdp));
	}

	public void changerMotDePasse(String mdp,String newmdp)
	{
		if(testMotDePasse(mdp))
		{
			this.motDePasse = newmdp;
		}
	}

	public String getPseudonyme()
	{
		return(this.pseudo);
	}

	public void setPseudonyme(String ps, String mdp)
	{
		if(testMotDePasse(mdp))
		{
			this.pseudo = ps;
		}
	}
}
