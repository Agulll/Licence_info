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

}
