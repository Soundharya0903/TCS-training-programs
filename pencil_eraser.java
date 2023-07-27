import java.util.Scanner;

/**
 *
 * @author User 1
 */
public class Pencil_eraser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int p1=sc.nextInt();
        int e1=sc.nextInt();
        int p2=sc.nextInt();
        int e2=sc.nextInt();
        int pencils=fact(p1)/(fact(p2)*fact(p1-p2));
        int erasers=fact(e1)/(fact(e2)*fact(e1-e2));
        int total=pencils+erasers;
        System.out.println(total);
        
    }
    public static int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    
}