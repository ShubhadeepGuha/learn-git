import java.util.*;
class queue{
    int f;
    int r;
    int a[]=new int[5];

    public queue(){
        f=-1;
        r=-1;
    }
    void enqueue(int x){
       
        if(f==-1&&r==-1){
            f=r=0;
            a[r]=x;
        }else if(r!=4){
            r++;
            a[r]=x;
        }else{
            System.out.println("queue is full");
        }
       
    }

    void display(){
        for(int i=f;i<=r;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }

    void dequeue(){
        if(f==-1&&r==-1){
            System.out.println("queue is empty");
           
        }else{
            int x=a[f];
            if(f==r){
                f=-1;
                r=-1;
            }else{
                f++;

            }
           System.out.println("deleted item " + x);
        }
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        queue obj= new queue();
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