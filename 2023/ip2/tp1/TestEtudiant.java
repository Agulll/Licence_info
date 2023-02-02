public class TestEtudiant
{	
	public static void main(String[] args)
	{	
		Etudiant Jhon = new Etudiant("Lenon","Jhon",2220123,15);
		Etudiant.afficher(Jhon);
		System.out.println(Etudiant.estAdmis(Jhon));
		System.out.println(Etudiant.mention(Jhon));
	}
}
