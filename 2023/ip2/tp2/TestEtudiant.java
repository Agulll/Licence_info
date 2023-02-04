public class TestEtudiant
{	
	public static void main(String[] args)
	{	
		Etudiant e1 = new Etudiant ("Luke" ,"Skywalker" , 8.25);
		Etudiant e2 = new Etudiant ("Leia" ,"Organa" , 11.75);
		Etudiant z = new Etudiant ("Zoe" ,"Dominique" , Double.MAX_VALUE-Etudiant.SumNotes); // Je prefere Zoe a Martin.
		System.out.println("nb d’etudiants : " + Etudiant.GetNbEtudiant());
		System.out.println("somme des notes : " + Etudiant.SumNotes);
	//	e1.afficher();
	//	Etudiant.afficher2(e2);
	//	System.out.println(e1.estAdmis());
	//	System.out.println(e2.estAdmis());
	//	System.out.println(Etudiant.moyenne());
	//	System.out.println(z.meilleurQueLaMoyenne());
		z.modifierNote(16.);
		z.afficher();
		Trio tr = new Trio(e1,e2,z);
		tr.premier().afficher();
		Etudiant x = tr.match("Luke","Skywalker");
		x.afficher();
		System.out.println(tr.classement("Luke","Skywalker"));
		System.out.println(tr.classement("Lk","kwale"));
		System.out.println(tr.moyenne());
		System.out.println(tr.meilleurQueLaMoyenne());
		System.out.println(Etudiant.moyenne());
	}
}
/* REPONSES
 * Exo1.
 * 2-> 	Static rends l'attribu commun a toutes les instances de la classe qu'elle soit initialisee ou non.
 * 	Final rends l'attribu "Fixe", il ne pourras pas etre modifiee apres son initalisation.
 * 
 *
 *
 *
 *
 *
 *
 */
