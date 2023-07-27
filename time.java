import java.util.*; 
public class time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner(System.in);
       int hrs=sc.nextInt();
       int mins=sc.nextInt();
       int m=(hrs*60)+mins;
       int res=1440-m;
       int h1=res/60;
       int m1=res%60;
       System.out.println(h1+"hrs ::"+m1+"mins");
    }
    
}