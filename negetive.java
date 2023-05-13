import java.util.*;
public class negetive {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int c;
        int arr[]=new int[10];
        System.out.println("Enetr the array");
        for(int i=0;i<10;i++)
        arr[i]=in.nextInt();
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(arr[i]>arr[j])
                {
                    c=arr[i];
                    arr[i]=arr[j];
                    arr[j]=c;
                }
            }
        }
        System.out.println("rearranged Array");
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }


    }

}
