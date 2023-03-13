public class Automate{
    public Cellule premier;
    public Cellule dernier;
    public Automate(Cellule c)
    {
        this.premier = c;
        this.dernier = c;
    }
    public void addPer(Cellule c)
    {
        c.setSui(this.premier);
        this.premier.setPre(c);
        this.premier = c;
    }
    public void addDer(Cellule c)
    {
        c.setPre(this.dernier);
        this.dernier.setSui(c);
        this.dernier = c;
    }
    public void affichage()
    {
        Cellule current = this.premier;
        while(current!=this.dernier)
        {
            current.afficher();
            current = current.getSui();
        }
    }









}
