public class Test{
    public static void main(String[] args)
    {
        Automate t0 = new Automate(new Cellule(true));
        boolean[] booltab = {true,true,false,false,false,true,false,false,false,false};
        for(boolean b : booltab)
        {
            t0.addDer(new Cellule(b));
        }
        t0.affichage();
    }
}
