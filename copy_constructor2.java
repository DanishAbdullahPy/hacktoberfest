// here we copy parameterised constructor
class e
{
    int x,y;

    e(int u,int v)//parameterised
    {
        x=u;
        y=v;
        
    }
    e(e ref) // this is copy constructor by using this we can see that value of a constructor is copy by passing reference as parameter
    {
      u = ref.u;
      v = ref.v;
        System.out.println(u + " " + v);
    }
    void dip()
    {
        System.out.println(x+ " " +y);
    }
   
}
class copy_constructor2 {

public static void main(String[] args)
 {
    copy_constructor2 r=new copy_constructor2();  
    r.dip();
    
}
