import java.util.*;
public class duplicte {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string.");
        String st=in.nextLine();
        int len=in.nextInt();
        int count=0;
        for(int i=0;i<len-1;i++)
        {
            char c=st.charAt(i);
            for(int k=i+1;k<len;k++)
            {
                char ch=st.charAt(k);
                if(ch==c)
                {
                    count++;
                }
                
            }
            if(count>0)
                {
                    System.out.println("***"+c+"-"+count);
                }
                count=0;
        }
    }    
}
