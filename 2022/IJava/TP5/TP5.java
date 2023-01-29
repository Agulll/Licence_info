import java.util.Random;
import java.util.Arrays;

public class TP5 {

    static Random rand = new Random () ;
    public static int randRange ( int a , int b ) {
    return (rand.nextInt(b-a)+a) ;
    }
    public static void printArrayOfArrays(int[][] arrarr)
    {
        for (int i = 0; i < arrarr.length; i++) {
            for (int j = 0; j < arrarr[i].length; j++) {
                System.out.print(Integer.toString(arrarr[i][j])+' ');
            }
            System.out.print('\n');
        }
    }


    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
                System.out.print(Integer.toString(arr[i])+' ');
        }
        System.out.print('\n');
    }


    public static void printArrayString (String[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
                System.out.print((arr[i])+' ');
        }
        System.out.print('\n');
    }


    public static int[][] pascal(int n)
    {
        int[][] triarr = new int[n][];
        for (int i = 0; i < n; i++) {
            triarr[i] = new int[i+1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0 || i == j)
                {
                    triarr[i][j] = 1;
                } else {
                    triarr[i][j]=triarr[i-1][j-1] + triarr[i-1][j];
                }
            }
        }
        return triarr;
    }

    public static int[] rowSums(int[][] arrarr)
    {
        int[] sum = new int[arrarr.length];
        for (int i = 0; i < arrarr.length; i++) {
            for (int j = 0; j < arrarr[i].length; j++) {
                sum[i]+=arrarr[i][j];
            }
        }
        return sum;
    }

    public static int[][] CreateGraph (int n)
    {
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && randRange(0,101) > 65)
                {
                    res[i][j] = 1;
                    res[j][i] = 1;
                }
            }
        }
        return res;
    }

    public static int friends_nbr (int[][] R, int a)
    {
        return rowSums(R)[a];
    }

    public static int[] friends  (int[][] R, int a)
    {
        if(friends_nbr(R,a) != 0) {
          int j = 0;
          int[] tab = new int[friends_nbr(R,a)];
          for (int i = 0; i < R[a].length; i++)
          {
              if(R[a][i] == 1)
              {
                tab[j] = i;
                j++;
              }
          }
          return (tab);
        }
        int[] empty = new int[0];
        return (empty);
    }

    public static int[] popular (int[][] R) {
        int[] tabval = new int [R.length];
        for (int i = 0; i < R.length; i++) {
            tabval[i] = friends_nbr(R,i);
        }
        int[] tabpos = new int [R.length];
        for (int i = 0; i < tabval.length; i++) {
            int max = 0;
            for (int j = 0; j < tabval.length; j++) {
                    if (tabval[j] > tabval[max]) {
                        max = j;
                }
            }
            tabpos[i] = max;
            tabval[max] = -1;
        }

        return tabpos;
    }

    public static int[] common_friends(int[][] R,int a,int b) {
        int[] af = friends(R,a);
        int[] bf = friends(R,b);
        int n = 0;
        for(int i = 0; i <af.length; i++)
        {
          for(int j = 0; j < bf.length; j++)
          {
              if(af[i] == bf[j])
              {
                n++;
                break;
              }
          }
        }
        int[] common_friend = new int [n];
        n = 0;
        for(int i = 0; i <af.length; i++)
        {
          for(int j = 0; j < bf.length; j++)
          {
              if(af[i] == bf[j])
              {
                common_friend[n] = af[i];
                n++;
                break;
              }
          }
        }
        return common_friend;
      }

    public static int[][] add_user(int[][] R,int[] t) {
        int n = R.length;
        int[][] R2 = new int[n+1][n+1];
        for (int i = 0; i < t.length; i++) {
            R2[n][i] = 1;
            R2[i][n] = 1;
        }
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                R2[i][j] = R[i][j];
            }

        }
        return R2;
      }

        public static String[] popular2 (int[][] R, String[] t) {
            int[] tab = popular(R);
            String[] tabsrt = new String[tab.length];
            for (int i = 0; i < tab.length; i++)
            {
              tabsrt[i] = t[tab[i]];
            }
            return  tabsrt;
        }

        public static int[] invite(int[][] R, int a)
        {
          int[] frnd  = friends(R,a);
          int n = 0;
          for (int i = 0; i < frnd.length; i++)
          {
            n += friends(R,frnd[i]).length;
          }
          int[] alfrnd = new int[n];
          n = 0;
          for (int i = 0; i < frnd.length; i++)
          {
            int[] frndoffrnd = friends(R,frnd[i]);
            for (int j = 0; j < frndoffrnd.length; j++)
            {
              alfrnd[n] = frndoffrnd[j];
              n++;
            }
          }
          for (int i = 0; i < alfrnd.length;i++)
          {
            if (alfrnd[i] == a)
            {
              alfrnd[i] = -1;
            } else if (alfrnd[i] != -1)
            {
              for (int j = i+1; j < alfrnd.length ; j++ ) {
                if (alfrnd[j] == alfrnd[i])
                  {
                    alfrnd[j] = -1;
                  }
                }
              }
            }
            n = 0;
            for (int i = 0; i < alfrnd.length ; i++) {
              if (alfrnd[i] != -1){
                n++;
              }
            }
            int[] finaltab = new int[n];
            n = 0;
            for (int i = 0; i < alfrnd.length ; i++) {
              if (alfrnd[i] != -1){
                finaltab[n] = alfrnd[i];
                n++;
              }
            }
            return finaltab;
          }

          public static int[] strict_invite(int[][] R, int a)
          {
            int len = R.length;
            int[][] P = new int[len][len];
            int sum = 0;
            for (int i = 0 ; i < len ; i++ ) {
              for (int j = 0 ; j < len ; j++) {
                for (int k = 0; k < len ; k++) {
                  sum+= R[i][k] * R[k][j];
                }
                P[i][j] = sum;
                sum = 0;
              }
            }
            int n = 0;
            printArrayOfArrays(P);
            System.out.print('\n');
            int[] frndoffrnd = invite(R,a);
            for (int i = 0 ; i < frndoffrnd.length ; i++) {
              if (P[a][frndoffrnd[i]] >= 2)
              {
                n++;
              }
            }
            int[] finaltab = new int[n];
            n = 0;
            for (int i = 0 ; i < frndoffrnd.length ; i++) {
              if (P[a][frndoffrnd[i]] >= 2)
              {
                finaltab[n] = frndoffrnd[i];
                n++;
              }
            }
           return finaltab;
          }

          public static String[] invite_but_with_names(int[][] R,int a,String[] Names)
          {
            int[] res = invite(R,a);
            String[] buffer = new String[res.length];
            for (int i = 0; i < res.length ; i++ ) {
              buffer[i] = Names[res[i]];
            }
            return buffer;
          }

          public static String[] strict_invite_but_with_names(int[][] R,int a,String[] Names)
          {
            int[] res = strict_invite(R,a);
            String[] buffer = new String[res.length];
            for (int i = 0; i < res.length ; i++ ) {
              buffer[i] = Names[res[i]];
            }
            return buffer;
          }

    public static void main(String[] args) {
        //int[][] arar = {{1, 2, 3}, {4, 5}, {6}};
        //printArrayOfArrays(arar);
        //printArray(rowSums(arar));
        // printArrayOfArrays(pascal(7));
        int[][] g = CreateGraph(6);
        printArrayOfArrays(g);
        //printArray(friends(g,1));
        // printArray(popular(g));
        //printArray(common_friends(g,1,2));
        // int[] newusr = {1,2,4,5};
        // g = add_user(g,newusr);
        // System.out.print('\n');
        // printArrayOfArrays(g);
        // String[] t = {"Evan Spiegel", "Mark Zuckerberg", "Jack Dorsey","Name4","Name5","Name6","Name7"};
        // printArray(popular(g));
        // printArrayString(popular2(g,t));
        // printArray(invite(g,2));
        // System.out.print('\n');
        // printArray(strict_invite(g,2));
        // System.out.print('\n');
        // String[] Names = {"Orrin", "Orson", "Oryn", "Oscar", "Osesenagha", "Oskar"};
        // printArrayString(invite_but_with_names(g,2,Names));
        // System.out.print('\n');
        // printArrayString(strict_invite_but_with_names(g,2,Names));

      }
}
