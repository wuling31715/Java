public class Test3{
    int z;
    public static void main(String[] args) {
        Test3 t = new Test3();
        int z = 6;
        System.out.println(z);
        System.out.println(t.z);
        t.method1();
        System.out.println(z);
        System.out.println(t.z);
    }
    void method1() {
        z = 5;
        method2();
        System.out.println(z);
    }
    void method2() {
        z = 4;
        System.out.println(z);
    }
}