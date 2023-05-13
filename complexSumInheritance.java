import java.util.*;
class complex{
    private int a,b;//x=4+6i (a+bi)
    public void setData(int x,int y){
        a=x;
        b=y;
    }
    public void  display(){

        if(this.b==0){
            System.out.println(this.a);
        }else if(this.a==0){
            System.out.println(this.b+"i");
        }else if(this.b<0){
            System.out.println(this.a+""+this.b+"i");
        }else{
            System.out.println(this.a+"+"+this.b+"i");
        }  
    }
    public complex sum(complex obj2){
        complex ans=new complex();
        ans.a =this.a+obj2.a;
        ans.b =this.b+obj2.b;
        return ans;
    }
    public complex subs(complex obj2){
        complex ans=new complex();
        ans.a=this.a-obj2.a;
        ans.b=this.b-obj2.b;
        return ans;
    }
    //x=(a*c)+(b*d)*-1
    //y=(a*d)+(b*c)
    public complex multiply(complex obj2){
        complex ans=new complex();
        ans.a=(this.a*obj2.a)+(this.b*obj2.b)*-1;
        ans.b=(this.a*obj2.b)+(this.b*obj2.a);
        return ans;
    }
}
class complexSumInheritance 
{
    public static void main(String args[])
    {
         Scanner in=new Scanner(System.in);
        complex obj=new complex();
        
       complex obj2=new complex();
       complex ans=new complex();
       while(true)
       {
        System.out.println("enter 1st no");
        int a=in.nextInt();
        int b=in.nextInt();
         System.out.println("enter 1st no");
        int a2=in.nextInt();
        int b2=in.nextInt();
        obj.setData(a,b);
        //obj.display();
        obj2.setData(a2,b2);
         System.out.println("Enter 1 to input 2 to add 3 to susbstract 4 to multiply 5 to end");
        int ch=in.nextInt();
        switch(ch)
        {
            case 1:
           
           ans=obj.sum(obj2);
           ans.display();
            break;
        case 2:
         
           ans=obj.subs(obj2);
           ans.display();
            break;
            case 3:
         // complex ans=new complex();
           ans=obj.multiply(obj2);
           ans.display();
            break;
            case 4:
            return;
            default:
            System.out.println("Wrong input");
            


        }
       }

    }
}