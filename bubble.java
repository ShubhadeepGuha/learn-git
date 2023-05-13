import java.util.*;
public class bubble {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ar[]=new int[5];
        System.out.println("Enetr 5 numbers");
        for(int i=0;i<5;i++)
        ar[i]=in.nextInt();
        int len=5;
        for(int i=0;i<len;i++)
        {
            for(int j=1;j<len-i;j++)
            {
                if(ar[j-1]>ar[j])
                {
                    int temp=ar[j-1];
                    ar[j-1]=ar[j];
                    ar[j]=temp;               
                 }
            }
        }
        for(int i=0;i<len;i++)
        System.out.println(ar[i]);
    }
    
}
