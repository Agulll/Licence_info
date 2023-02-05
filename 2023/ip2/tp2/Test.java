public class Test
{	
	public static void main(String[] args)
	{	
		Etudiant e1 = new Etudiant ("Luke" ,"Skywalker" , 8.25);
		Etudiant e2 = new Etudiant ("Leia" ,"Organa" , 11.75);
		Etudiant z = new Etudiant ("Zoe" ,"Dominique" ,11.75); // Je prefere Zoe a Martin.
		System.out.println("nb d’etudiants : " + Etudiant.GetNbEtudiant());
		System.out.println("somme des notes : " + Etudiant.SumNotes);
		System.out.println("[Print non-static]");
		e1.afficher();
		System.out.println("[Print static]");
		Etudiant.afficher2(e2);
		System.out.println("[Test estAdmis]");
		System.out.println(e1.estAdmis());
		System.out.println("[Test Moyenne]");
		System.out.println(Etudiant.moyenne());
		System.out.println("[Test MeilleurQueLaMoyenne]");
		System.out.println(z.meilleurQueLaMoyenne());
		z.modifierNote(16.);
		System.out.println("[Test modifierNote]");
		z.afficher();
		Trio tr = new Trio(e1,e2,z);
		System.out.println("[Test Trio premier]");
		tr.premier().afficher();
		System.out.println("[Test Trio classement]");
		System.out.println(tr.classement("Leia","Organa"));
		System.out.println("[Test Trio moyenne]");
		System.out.println(tr.moyenne());
		Etudiant e3 = new Etudiant ("Jhon" ,"Doe" , 11.);
		Etudiant e4 = new Etudiant ("Jane" ,"Doe" , 10.);
		System.out.println("[Test Trio meilleurQueLaMoyenne]");
		System.out.println(tr.meilleurQueLaMoyenne());
		System.out.println(Etudiant.moyenne());
	}
}
/* REPONSES
 * Exo1.
 * 2-> 	Static rends l'attribu commun a toutes les instances de la classe qu'elle soit initialisee ou non.
 * 	Final rends l'attribu "Fixe", il ne pourras pas etre modifiee apres son initalisation.
 * Exo2.
 * 5->  Classement renvoie les ex-aequo a la meme place arondie inferieurement (i.e 14,16,16 donnera 3,2,2).
 *
 */
