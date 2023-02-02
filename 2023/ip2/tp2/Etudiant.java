public class Etudiant
{
final String nom , prenom ; // les nom et prenom de l ’ etudiant
double note ; // la note de l ’ etudiant ( sur 20)
private static int nbEtudiant = 0;
static double SumNotes = 0;
public Etudiant(String nm,String pn,double no)
{
	this.nom = nm;
	this.prenom = pn;
	this.note = no;
	nbEtudiant+=1;
	SumNotes += no;
}

	public void afficher()
	{
		System.out.println("<"+this.nom+"> <"+this.prenom+"> : <"+this.note+">");  
	}

	public static int GetNbEtudiant(){return nbEtudiant;}

	public static void afficher2(Etudiant e)
	{
		System.out.println("<"+e.nom+"> <"+e.prenom+"> : <"+e.note+">");  
	}
	public boolean estAdmis(){return (this.note>=10);}

	public static double moyenne(){return ((nbEtudiant==0)?0:SumNotes/nbEtudiant);}

	public boolean meilleurQueLaMoyenne(){return (this.note>Etudiant.moyenne());}

	public void modifierNote(Double nouvelleNote)
	{
		SumNotes-=(this.note - nouvelleNote);
		this.note = nouvelleNote;
	}
}
