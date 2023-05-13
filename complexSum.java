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

class complexSum{
    public static void main(String[] args) {
        complex obj=new complex();
        obj.setData(5,2);//2+4i
        obj.display();
        complex obj2=new complex();
        obj2.setData(2, 3);
        obj2.display();
        complex ans=new complex();
       // ans=obj.sum(obj2);
       //ans=obj.subs(obj2);
       ans=obj.multiply(obj2);
        ans.display();
        
    }
}