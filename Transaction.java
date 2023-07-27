import java.util.*;
public class Transcation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==30 ||arr[i]==60 ||arr[i]==120)
            {
                flag++;
            }
          }
        if(flag==n)
        {
            System.out.println("Successful");
        }
        else{
            System.out.println("Not successful");
        }
    }
    
}