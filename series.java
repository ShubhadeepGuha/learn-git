import java.util.*;
public class series
 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int y=1;
        int i=11;
        int a=1;
        while(y<=n)
        {
            System.out.print(i+",");
            i=i+(3*a);
            a++;
            y++;
        }
    }
    
}
