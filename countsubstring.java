import java.util.*;
public class countsubstring {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int count=0;
        System.out.println("Enter a string");
        String st=in.nextLine();
        System.out.println("Enter the Substring to be counted");
        String sub=in.nextLine();
        int len=st.length();
        int sublen=sub.length();
        char c=sub.charAt(0);
        for(int i=0;i<len-sublen;i++)
        {
            //String str="";
            char ch=st.charAt(i);
            if(ch==c)
            {
            String sub2="";
            int x=i+(sublen-1);
           for(int k=i;k<=x;k++)
           {
            sub2=sub2+st.charAt(k);
           }

            System.out.println(sub2);
            if(sub2.equals(sub))
            {
                count++;
               // str="";
            }
        }
        }
        System.out.println("the number of sub string present is: "+count);
    }
}
