public class Salon
{
	private int indexLibreMessage;
	private int indexLibreUtilisateur;
	private Message[] tabMessage;
	private Utilisateur[] tabUtilisateur;
	Salon(int n)
	{
		tabUtilisateur = new Utilisateur[n];
		tabMessage = new Message[n];
		indexLibreMessage = 0;
		indexLibreUtilisateur = 0;
	}

	public boolean estPresent(Utilisateur x)
	{
		for (int i = 0; i < indexLibreUtilisateur; i++)
		{
			if(tabUtilisateur[i]==x)
			{
				return(true);
			}
		}
		return(false);
	}

	public boolean ajouterUtilisateur(Utilisateur ut)
	{
		if (indexLibreUtilisateur >= tabUtilisateur.length)
		{
			return (false);
		}
		else
		{
			tabUtilisateur[indexLibreUtilisateur++]=ut;
			return(true);
		}
	}
	public boolean ajouterMessage(Message ms)
	{
		if(indexLibreMessage >= tabMessage.length
				||!estPresent(ms.getAuth()))
		{
			System.out.println("Message is not from a user in the room or there's no space left!");
			return (false);
		}
		else
		{
			tabMessage[indexLibreMessage++]=ms;
			return(true);
		}
	}

	public void afficher()
	{
		for (int i = 0;i < indexLibreMessage; i++)
		{
			System.out.println(tabMessage[i].getAuth().getPseudonyme()+": "+tabMessage[i].getMsg());
		}
	}

}
