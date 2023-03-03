public class Cellule
{
    private int valeur;
    private Cellule suivante;

    public Cellule(int n,Cellule cell)
    {
        this.valeur = n;
        this.suivante = cell;
    }
    public Cellule(int n)
    {
        this(n,null);
    }

    public int GetVal()
    {
        return(this.valeur);
    }
    public Cellule GetSuiv()
    {
        return(this.suivante);
    }
    public String description()
    {
        if(this.suivante==null)
        {
            return(this.valeur+"]");
        }
        else
        {
            return(this.valeur+","+this.suivante.description());
        }
    } 
    public int taille()
    {
        if(this.suivante==null)
        {
            return(1);
        }
        else
        {
            return(1+this.suivante.taille());
        }
    }
    public int somme()
    {
        if(this.suivante==null)
        {
            return(this.valeur);
        }
        else
        {
            return(this.valeur+this.suivante.somme());
        }
    }
    public boolean equals(Cellule argcell)
    {
        if(this.suivante==null || argcell.suivante == null)
        {
            return(this.valeur == argcell.valeur && this.suivante == argcell.suivante);
        }
        else
        {
            return(this.valeur == argcell.valeur && this.suivante.equals(argcell.suivante));
        }
    }
    public void ajouter_en_i(int x,int i)
    {
        if(this.suivante==null)
        {
            if(i<=0)
            {
                this.suivante= new Cellule(i);
            }
            else
            {
                this.suivante= new Cellule(0);
                this.suivante.ajouter_en_i(x,--i);
            }
        }
        else if(i<=0)
        {
            this.suivante= new Cellule(i,this.suivante);
        }
        else
        {
            this.suivante.ajouter_en_i(x,--i);
        }
    }
}
