class Super{
    Super(){
        System.out.println("super!");
    }
    private int i;
    int j;
}

class Sub extends Super{
    Sub(){
        System.out.println("sub!");
    }
}

public class Test{
    public static void main(String[] args){
        Sub s = new Sub();
        System.out.println(s.j);
        // System.out.println(s.i);
    }
}