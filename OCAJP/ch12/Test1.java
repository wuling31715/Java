class Test0{
    int age;
    Test0(int age){
        this.age = age + 20;
        System.out.println("father is " + this.age);
        System.out.println("father constructor");
    }
    public static void main(String[] args){
        System.out.println("father main function");
    }
}

class Test1 extends Test0{
    int age;
    Test1(int age){
        super(age);
        this.age = age;
        System.out.println("son is " + this.age);
    }
    public static void main(String[] args){
        Test1 t1 = new Test1(30);
        System.out.println("son");
        // Test1 t0 = new Test0(30); False
    }
}