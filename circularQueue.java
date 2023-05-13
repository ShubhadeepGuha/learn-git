import java.util.*;
class circularQueue{
    int f;
    int r;
    int q[]=new int[5];

    public circularQueue(){
        f=-1;
        r=-1;
    }
    void enqueue(int x){
        if(f==-1&&r==-1){
            f=0;r=0;
            q[r]=x;
        }else if(r==(f-1)%4){
            System.out.println("Queue is full");
        }else{
            r=(r+1)%5;
            q[r]=x;
        }
    }

    void display(){
            for(int i=f;i<=r;i=(i+1)%5){
                System.out.print(q[i]+" ");
            }
            System.out.println();
        }

   void dequeue(){
    int x=0;
            if(f==-1){
                System.out.println("Queue is empty");
            }
            else if(f==r)
            {
                x=q[f];
                f=-1;
                r=-1;
            }
            else{
                x=q[f];
                f=(f+1)%5;
            }
            System.out.println("deleted item "+x);
        }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        circularQueue obj= new circularQueue();
       while(true)
       {
        System.out.println("enter 1 to insert 2 to delete 3 to dispay 4 to end");
        int ch=in.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("enter to insert");
            int n=in.nextInt();
            obj.enqueue(n);
            break;
            case 2:
            obj.dequeue();
            break;
            case 3:
            obj.display();
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