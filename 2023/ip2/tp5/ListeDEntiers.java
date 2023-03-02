public class ListeDEntiers 
{
    private Cellule premier;
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
}
