public class power {
    static int powerfact(int x,int n)
    {
        if(n!=0)
        return (x*powerfact(x,n-1));
        else
        return 1;
    }
    public static void main(String args[])
    {
      
        int x2=2;
        int n2=4;
        int ans=powerfact(x2,n2);
        System.out.println(ans);
    }
    
}
