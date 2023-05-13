import java.util.*;
public class keprekars {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[4];
        int arr2[]=new int[4];
        int arr3[]=new int[4];
        int i=0,count=0,num2=0;
        System.out.println("Enter a number");
        int num=in.nextInt();
        int x=3;
        
        while(num!=6174)
        {
            System.out.println("Step= "+(count+1));
            System.out.println("num = "+num);
            num2=num;
            while(num2!=0)
            {
                int a=num2%10;
                arr[i]=a;
                num2=num2/10;
                i++;
            }
            Arrays.sort(arr);
            for(int j=0;j<4;j++)
            {
                arr2[j]=arr[x];
                x--;
            }
            int num3=arr2[0]*1000+arr2[1]*100+arr2[2]*10+arr2[3];
            int num4=arr[0]*1000+arr[1]*100+arr[2]*10+arr[3];
            System.out.println("Decending= "+num3);
            System.out.println("Reversed= "+num4);
            num=num3-num4;
            System.out.println("After substraction "+num);
            count++;
            x=3;
            i=0;
            System.out.println("______________________________________________________\n ");
            }
            System.out.println("Total number of steps = "+count);
            
        }

    }
    

