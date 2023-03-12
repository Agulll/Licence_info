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
		System.out.println(">-------------------------------------------------------------------<");
	}

	public void ban(Utilisateur x)
	{
		for (int i = 0; i < indexLibreUtilisateur; i++)
		{
			if(tabUtilisateur[i]==x)
			{
				if(i==indexLibreUtilisateur-1)
				{
					tabUtilisateur[i]=null;
				}
				else
				{
					for (int j = i; j <= indexLibreUtilisateur; j++)
					{	
						tabUtilisateur[j]=tabUtilisateur[j+1];
					}
				tabUtilisateur[indexLibreUtilisateur-1] = null;
				}
			indexLibreUtilisateur--;
			break;
			}
		}
		for (int i = 0; i < indexLibreMessage;i++)
		{
			if(tabMessage[i].getAuth()==x)
			{
				if(i==indexLibreMessage-1)
				{
					tabMessage[i] = null;
				}else{
					tabMessage[i]=tabMessage[i+1];
					i--;
				}
				indexLibreMessage--;
			}
		}
	}
}
