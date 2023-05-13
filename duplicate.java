import java.util.*;
public class duplicate {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        char ch1,ch2;
        System.out.println("Enter a string");
        String st=in.nextLine();
        int len=st.length();
        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                ch1=st.charAt(i);
                ch2=st.charAt(j);
                if(ch1==ch2)
                {
                    System.out.println(ch1);
                }
            }
        }
    }
    
}
