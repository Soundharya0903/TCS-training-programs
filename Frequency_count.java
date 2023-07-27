import java.util.Scanner;

/**
 *
 * @author User 1
 */
public class Frequency_count {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.charAt(i);
        }
        int count=0;
        for(int i=0;i<s.length()-1;i+=2)
        {
            if(arr[i]==arr[i+1])
            {
                count+=2;
                
            }
            
        }
        System.out.println(count);
    }
    
}
