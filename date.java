import java.util.*;
public class date {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a date ae dd-mm-yyyy");
        String da=in.nextLine();
        String dd=da.substring(0,2);
        String mm=da.substring(3,5);
        String yy=da.substring(7,9);
        String st=yy+mm+dd;
        System.out.println(dd);

    }
    
}
