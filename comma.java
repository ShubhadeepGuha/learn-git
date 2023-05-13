import java.util.*;
public class comma {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("ENter a string");
        String st=in.nextLine();
        String arr[]=st.split(",");
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            char ch1=arr[i].charAt(0);
            for(int j=i+1;j<len;j++)
            {
                char ch2=arr[j].charAt(0);
                if(ch1>ch2)
                {
                    String x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    
}
