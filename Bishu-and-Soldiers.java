
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner sc = new Scanner(System.in);
         int numsoliders = sc.nextInt();
         int[] soliders = new int[numsoliders];
         for(int i=0;i<numsoliders;i++)
         {
             soliders[i]=sc.nextInt();
         }
         int rounds = sc.nextInt();
         int[] powerbishu = new int[rounds];
         for(int i=0;i<rounds;i++)
         {
             powerbishu[i] = sc.nextInt();
         }
         for(int i=0;i<rounds;i++)
         {
             int count = 0;
             int sum = 0;
             for(int j=0;j<numsoliders;j++)
             {
                 if(powerbishu[i]>=soliders[j])
                 { 
                 count++;
                 sum = sum + soliders[j];
                 }
             }
             System.out.println(count + " " + sum);
         }


    }
}
