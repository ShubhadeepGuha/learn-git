import java.util.*;

public class array2d {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int sum=0;
        int arr[][]=new int[3][3];
        System.out.println("Enter ");
        for(int i=0;i<3;i++)
        {
            for(int y=0;y<3;y++)
            {
                arr[i][y]=in.nextInt();

            }
        }
        for(int i=0;i<3;i++)
        {
            for(int y=0;y<3;y++)
            {
                sum=sum+arr[y][i];
                
            }
            System.out.print(sum);
            System.out.println();
            sum=0;
        }
        
        
    }
    
}
