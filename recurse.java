public class recurse {
    static int factorial(int n)
    {
        if(n==0)
        return 1;
        else
        return(n*factorial(n-1));
    }
    public static void main(String args[])
    {
        int num=6;
        int fact=factorial(num);
        System.out.println(fact);
    }
    
}
