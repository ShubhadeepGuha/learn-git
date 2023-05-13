import java.util.*;
public class ceaser {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=in.nextLine();
        String newstr="";
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            int c=(int)ch;
            if((c>67)&&(ch<91))
            {
                int a=c-3;
                newstr=newstr+(char)a;
            }
            else if((c>99)&&(ch<123))
            {
                int a=c-3;
                newstr=newstr+(char)a;
            }
            else if((c>=65)&&(c<=67))
            {
                int a=c+23;
                newstr=newstr+(char)a;
            }
            else if((c>=97)&&(c<=99))
            {
                int a=c+23;
               // System.out.println(a);
                newstr=newstr+(char)a;
            }
            else{
                newstr=newstr+ch;
            }
        }
        System.out.println("The new string is:- "+newstr);
    }    
}
