import java.util.*;
public class removeDuplicate {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String arr[]=new String[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++)
        arr[i]=in.nextLine();
        for(int i=0;i<5-1;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    arr[j]="";
                
                }
            }
        }
        System.out.println("The new Array is");
        for(int i=0;i<5;i++)
        {
            if(arr[i]!=""){
        
        System.out.println(arr[i]);
            }
        }

    }
    
}
