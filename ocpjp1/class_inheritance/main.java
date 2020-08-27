class SuperClass {

    public int x = 0;
    private int y = 0;
    protected int z = 0;

    void show(){
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(this.z);
        System.out.println();
    }
}

class SubClass extends SuperClass {
    
}


public class main
{
    public static void main(String args[])
    {
        SubClass subclass = new SubClass();
        subclass.show();
        subclass.x = 1;
        // subclass.y = 1;    
        subclass.z = 1;
        subclass.show();        
    }
}