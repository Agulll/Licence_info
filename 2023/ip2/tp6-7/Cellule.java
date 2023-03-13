public class Cellule{
    private Cellule precedante;
    private Cellule suivante;
    private boolean noire;

    public Cellule(boolean noire)
    {
        this.precedante = null;
        this.suivante = null;
        this.noire = noire;
    }

    public Cellule GetPre()
    {
        return this.precedante;
    }

    public Cellule GetSui()
    {
        return this.suivante;
    }

    public boolean GetN()
    {
        return this.noire;
    }
}
