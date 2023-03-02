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

}
