public class Test
{
	public static void main(String[] args)
	{	
		Utilisateur ut = new Utilisateur("Zoe","AAA","mail@mail.mail");
		TestUtilisateur(ut);
		Message ms = new Message("Welcome Machine !",ut);
		TestMessage(ms);
		Salon Saloon = new Salon(10);
		TestSalon(Saloon,ut,ms);
	}
	public static void TestUtilisateur(Utilisateur ut)
	{
		System.out.println("[Test testMotDePasse : aaa,AAA]");
		System.out.println(ut.testMotDePasse("aaa"));
		System.out.println(ut.testMotDePasse("AAA"));
		System.out.println("[Test changerMotDePasse aaa->BBB,AAA->BBB]");
		ut.changerMotDePasse("aaa","BBB");
		System.out.println(ut.testMotDePasse("BBB"));
		System.out.println(ut.testMotDePasse("AAA"));
		ut.changerMotDePasse("AAA","BBB");
		System.out.println(ut.testMotDePasse("BBB"));
		System.out.println(ut.testMotDePasse("AAA"));
		System.out.println("[Test getPseudonyme]");
		System.out.println(ut.getPseudonyme());
		System.out.println("[Test setPseudonyme AAA->Zowey,BBB->Zowey]");
		ut.setPseudonyme("Zowey","AAA");
		System.out.println(ut.getPseudonyme());
		ut.setPseudonyme("Zowey","BBB");
		System.out.println(ut.getPseudonyme());
	}
	public static void TestMessage(Message ms)
	{
		System.out.println("[Test getMsg]");
		System.out.println(ms.getMsg());
		System.out.println("[Test getAuth]");
		System.out.println(ms.getAuth().getPseudonyme());
	}

	public static void TestSalon(Salon sl,Utilisateur ut, Message ms)
	{
		System.out.println("[Test ajouterUtilisateur]");
		System.out.println(sl.ajouterUtilisateur(ut));
		System.out.println("[Test ajouterMessage]");
		System.out.println(sl.ajouterMessage(ms));
		System.out.println("[Test afficher]");
		sl.afficher();
	}
}
