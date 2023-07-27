import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User 1
 */
public class Joker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cards[]=new int[n];
        for(int i=0;i<n;i++)
        {
            cards[i]=sc.nextInt();
        }
        Arrays.sort(cards);
        if(cards[0]==0)
        {
            for(int i=0;i<n-1;i++)
            {
                cards[i]=cards[i+1];
                if(i==n-2)
                {
                    cards[i+1]=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(cards[i]);
        }
    }
    
}
