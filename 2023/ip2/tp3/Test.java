public class Test
{
	public static void main(String[] args)
	{
		Utilisateur ut = new Utilisateur("Zoe","AAA","mail@mail.mail");
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
}
