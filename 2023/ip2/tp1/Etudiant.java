public class Etudiant
{
String nom , prenom ; // les nom et prenom de l ’ etudiant
int num ; // le numero d ’ etudiant
int note ; // la note de l ’ etudiant ( sur 20)
public Etudiant(String nm,String pn,int nu,int no)
{
	num = nu;
	nom = nm;
	prenom = pn;
	note = no;
}
	public static void afficher(Etudiant etu)
	{
		System.out.println("Non "+etu.nom+" Prenom "+etu.prenom+" (Numero d'etudiant "+etu.num+" ) note : "+etu.note+"!");  
	}
	public static boolean estAdmis(Etudiant etu)
	{
		return(etu.note>=10);
	}
	public static String mention(Etudiant etu)
	{
		if (etu.note>0 && etu.note<=10)
		{
			return("Ajournee");
		}
		if (etu.note>10 && etu.note<=12)
		{
			return("Passable");
		}
		if (etu.note>12 && etu.note<=14)
		{
			return("Assez Bien");
		}
		if (etu.note>14 && etu.note<=16)
		{
			return("Bien");
		}
		if (etu.note>16 && etu.note<=20)
		{
			return("Tres Bien");
		}
		return("Note invalide");
	}
}
