public class ListeDEntiers 
{
    private Cellule premier;
    public Cellule getCell()
    {
        return(this.premier);
    }
    public ListeDEntiers(Cellule cell)
    {
        this.premier=cell;
    }
    public ListeDEntiers()
    {
        this(null);
    }
    public void add(Cellule cell)
    {
        this.premier=cell;
    }
    public String description()
    {
        if(this.premier==null)
        {
            return("la liste est vide");
        }
        else
        {
            return("["+this.premier.description());
        }
    } 
    public int taille()
    {
        if(this.premier==null)
        {
            return(0);
        }
        else
        {
            return(this.premier.taille());
        }
    }
    public int somme()
    {
        if(this.premier==null)
        {
            return(0);
        }
        else
        {
            return(this.premier.somme());
        }
    }
    public boolean equals(ListeDEntiers arg)
    {
        if(this.premier == null || arg.getCell() == null)
        {
            return(this.premier == arg.getCell());
        }
        else
        {
            return(this.premier.equals(arg.getCell()));
        }
    }
    public void ajouter_en_i(int x,int i)
    {
        if(this.premier == null)
        {
            this.add(new Cellule(x));
        }
        else
        {
            this.premier.ajouter_en_i(x,i);
        }
    }
    public boolean supprimer_en_i(int i)
    {
        
    }
}
