import java.util.*;
public class vowel {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String newstr="";
        int c=0;
        System.out.println("Enter a string");
        String st=in.nextLine();
        int len=st.length();
        for(int i=0;i<len;i++)
        {
            char ch=st.charAt(i);
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
            {
                newstr=newstr+ch;
                c++;
            }
        }
        System.out.println(c+"  "+newstr);

    }
    
}
