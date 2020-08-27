class Base{
    void show(){
        System.out.println("super");
    }
}

class Test6 extends Base{
    void show(){
        System.out.println("sub");
    }
    public static void main(String[] args){
        Test6 t6 = new Test6();
        t6.show(); // sub
        Base b = new Base();
        b.show(); // super
        Base b2 = new Test6();
        b2.show(); // sub
        Base b3 = (Base) new Test6();
        b3.show(); // sub
        // Test6 tb = (Test6) new Base(); compile success, run time error
        // tb.show();
    }
}