public class Test1
{
    public static void main(String args[])
    {
        int c=0;
        int x=0;
        int sum=0;
        int arr3[]=new int[10];
        int arr[]={1,2,3,4,5};
        int arr2[]={6,2,1,9,1};
     /*  for(int i=0;i<5;i++)
       {
        System.out.println(arr[i]);
       }*/
       for(int i=0;i<5;i++)
       {
        for(int j=c+1;j<5;j++)
        {
            if(arr2[i]==arr2[j])
            x++;
        }
        if(x==0)
        System.out.println(arr2[i]);
        x=0;
        c++;
       }
    }
}