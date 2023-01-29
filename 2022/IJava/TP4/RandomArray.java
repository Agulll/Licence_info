// MARTIN DOMINIQUE
import java.util.Random;
public class RandomArray {
 static Random rand = new Random();

/* ************************************************************************** */

//EXO5
    //  QUESTION 1
    public static int[] createRandomArray(int n)
    {
      int[] arr = new int[n];
      for (int i = 0; i<n ;i++ )
      {
        arr[i] = rand.nextInt(n);
      }
      return(arr);
    }


    // QUESTION 2
    public static int[] minMaxAverage(int[] a)
    {
      int[] arr = new int[3];
      arr[0] = a[0];
      arr[1] = a[0];
      for (int i = 0; i< a.length;i++)
      {
        if (a[i]<arr[0]) {
          arr[0] = a[i];
        }
        if (a[i]>arr[1]) {
          arr[1] = a[i];
        }
        arr[2] += a[i];
      }
      arr[2] = arr[2]/a.length;
      return (arr);
    }


    // QUESTION 3
    public static int[] occurrences(int[] a)
    {
      int[] arr = new int[1+(minMaxAverage(a))[1]];
      for (int i = 0; i < a.length; i++ ) {
            arr[a[i]]+=1;
        }
      return arr;
    }

    // QUESTION 4a
    public static int[] countingSort(int[] a)
    {
      int[] b = occurrences(a);
      int[] arr = new int[a.length];
      int k = 0;
      for (int i = 0; i< b.length ;i++) {
        for (int j = 0; j < b[i]; j++) {
          arr[k] = i;
          k++;
        }
      }
      return arr;
    }

    // QUESTION 4b
    public static void countingSort2(int[] a)
    {
      int[] b = countingSort(a);
      for (int i = 0; i < b.length ; i++) {
        a[i] = b[i];
      }
    }




      /******************************************/
      /*     Fonctions auxiliaires              */
      /******************************************/

    public static boolean  intArrayEquals (int[] a, int[] b){
    	if (a.length!=b.length) {
	        return false;
		}
	    for (int i=0; i<a.length; i++){
	        if (a[i]!=b[i]){
	        	return false;
	        }
	    }
	    return true;
    }

    public static void printIntArray (int[] a){
	    for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
    }

    public static void printCharArray (char[] a){
      for (int i = 0; i<a.length ; i++){
          System.out.print(a[i] + " ");
      }
      System.out.println();
    }

    /* ********************************************************** */
    /*      Fonction Principale                                   */
    /* ********************************************************** */

//EXO1
    public static boolean search(int[] tab, int x)
    {
      for (int i = 0; i < tab.length;i++)
      {
        if (tab[i] == x)
        {
          return true;
        }
      }
      return false;
    }

    public static boolean countChar(char[] tab, char x)
    {
      for (int i = 0; i < tab.length;i++)
      {
        if (tab[i] == x)
        {
          return true;
        }
      }
      return false;
    }

    public static int[] union(int[] tab1, int[] tab2)
    {
      int n1 = tab1.length;
      for (int i = 0; i<tab2.length; i++)
      {
        if (!(search(tab1,tab2[i])))
        {
          n1++;
        }
      }
      int[] tab3 = new int[n1];
      for (int i = 0; i<tab1.length; i++)
      {
        tab3[i] = tab1[i];
      }
      int n2 = 0;
      for (int i = 0; i<tab2.length; i++)
      {
        if (!(search(tab1,tab2[i])))
        {
          tab3[tab1.length+n2] = tab2[i];
          n2++;
        }
      }

      return tab3;
    }
//EXO2
    public static int[] shift(int[] tab1,int n)
    {
      int n2 = n % tab1.length;
      if (n2 < 0)
      {
        n2 = tab1.length + n2;
      }
      int[] tab2 = new int[tab1.length];
      for (int i = 0; i < tab1.length ; i++ ) {
        int offset = i + n2;
        if (offset >= tab1.length)
        {
          offset = offset - tab1.length;
        }
        tab2[offset] = tab1[i];
      }
      return tab2;
    }

    public static int[] fibonacci(int n)
    {
      int[] tab = new int[n];
      tab[0] = 0;
      tab[1] = 1;
      for (int i = 2; i < tab.length;i++)
      {
        tab[i] = tab[i-2] + tab[i-1];
      }
      return tab;
    }
//EXO4
    public static void letters2word(char[] tab){
    String str = "";
    for (int i = 0; i < tab.length ; i++ ) {
      str += tab[i];
    }
    System.out.println(str);
    }

    public static void stutterword(char[] tab1,int[] tab2)
    {
      if (tab1.length != tab2.length)
      {
        System.out.println("Erreur");
        return;
      } else {
        String str = "";
        for (int i = 0 ; i < tab2.length ; i++)
        {
          for (int j = 0; j < tab2[i];j++) {
            str += tab1[i];
          }
        }
        System.out.println(str);
        return;
      }
    }

    public static char[] word2letters(String str)
    {
        char[] tab = new char[str.length()];
        for (int i = 0 ; i < str.length() ; i++)
        {
            tab[i] = str.charAt(i);
        }
        return tab;
    }

//EXO6
    public static int position(int[] tab,int x)
    {
      for (int i = 0; i < tab.length; i++ ) {
        if (tab[i] > x) {
          return i;
        }
      }
      return (tab.length);
    }

    public static int[] insert(int[] tab,int pos, int x)
    {
      if (pos > tab.length)
      {
        return tab;
      } else {
        int[] newtab = new int[tab.length+1];
        for (int i = 0; i < pos; i++) {
          newtab[i] = tab[i];
        }
        newtab[pos] = x;
        for (int i = pos+1; i < tab.length+1; i++) {
          newtab[i] = tab[i-1];
        }
        return newtab;
      }
    }

    public static int[] sort(int[] tab){
      int[] newtab = new int[1];
      newtab[0] = tab[0];
      for (int i = 1; i < tab.length-1; i++) {
        int p = position(newtab,tab[i]);
        newtab = insert(newtab,p,tab[i]);
      }
      return newtab;
    }



    public static void main(String[] args){
    // System.out.println("Entrez un entier positif (la taille du tableau):");
    // int n = Integer.parseInt(System.console().readLine());
    // int[] a = createRandomArray(n);
    // printIntArray(a);
    // printIntArray(minMaxAverage(a));
    // printIntArray(occurrences(a));
    // int[] b = {1,3,0,0,0,1};
    // printIntArray(b);
    // printIntArray(occurrences(b));
    // printIntArray(countingSort(b));
    // int[] a = createRandomArray(100);
    // int[] b = countingSort(a);
    // countingSort2(a);
    // System.out.println(intArrayEquals(a,b));
    //System.out.println(search(tab,5));
    //int[] notatab = {45,456,897,32,16,1,2,4,5,3,7,9,10,98};
    //printIntArray(union(tab,notatab));
    //printIntArray(shift(tab,0));
    // printIntArray(fibonacci(15));
    // char[] useless1 = {'B','o','n','j','o','u','r'};
    // letters2word(useless);
    // int[] useless2 = {2,2,2,2,2,2,2};
    // stutterword(useless1,useless2);
    // printCharArray(word2letters("Bonjour"));
    //int[] tab={0,2,4,6,7,8};
    // System.out.println(position(tab,1));
    // System.out.println(position(tab,-5));
    // System.out.println(position(tab, 10));
    // int[] tab={2,5,4,3};
    // printIntArray(tab);
    // printIntArray(insert(tab, 0, 1));
    // printIntArray(insert(tab, 2, 100));
    // int[] tab = {40,1,20,3,8,6};
    // printIntArray(sort(tab));

    }
}
