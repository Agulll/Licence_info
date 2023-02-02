public class Trio {
	private Etudiant[] membres;

	Trio(Etudiant e1,Etudiant e2,Etudiant e3){
		this.membres = new Etudiant[3];
		this.membres[0] = e1;
		this.membres[1] = e2;
		this.membres[2] = e3;
	}

	public Etudiant premier(){
		Etudiant e = new Etudiant("","",Double.MIN_VALUE);
		for (Etudiant x : this.membres){
			if (e.note < x.note){ e = x ;}
		}
		return(e);
	}

	public Etudiant match(String Prenom,String Nom)
	{
		for (Etudiant x : this.membres){
			if (x.nom.equals(Nom) && x.prenom.equals(Prenom))
					{
						return  x;
					}

		}
		return (new Etudiant("","",-1));
	}

	public int Classement(String Prenom,String Nom)
	{
		int pos = 3; 
		Etudiant x = match(Prenom,Nom);
		if(x.note == -1){return 0;}
		for (Etudiant y : this.membres){
			if(y.note < x.note){
				pos--;
			}
		}
		return(pos);
	}
}
