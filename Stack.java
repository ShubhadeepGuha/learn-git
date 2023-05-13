
import java.util.*;
class Stack
{
    public int s[]=new int[5];
    public int top;
    public Stack()
    {
        top=-1;
    }
    public void push(int x)
    {
      
        if(top<s.length-1)
        {
            top++;
            s[top]=x;
        }
        else
        System.out.println("Stack overflow");
    }
    public void pop()
    {
        if(top>=0)
        {
            System.out.println("Deleted item= "+s[top]);
            top--;
        }
    }
    public void display()
    {
        if(top==-1)
        System.out.println("no elment found");
        else
        {
            for(int i=top;i>=0;i--)
            System.out.println(s[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Stack ob = new Stack();
        while(true){
        System.out.println("enter 1 to push 2 to pop 3 to display 4 to exit");
        int ch=in.nextInt();
      
        
        switch(ch){
            case 1:
        System.out.println("enter to push");
        int n=in.nextInt();
        ob.push(n);
        break;
            case 2:
        ob.pop();
        break;
            case 3:
        ob.display();
        break;
            case 4:
        return;

       
            default:
            System.out.println("Wrong input");
            break;
        }
        }


    }
}