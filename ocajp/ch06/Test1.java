public class Test1{
    int z;
    public static void main(String[] args) {
        Test1 t = new Test1();
        int z = 6;
        System.out.println(z);
        System.out.println(t.z);
        t.method1();
        System.out.println(z);
        System.out.println(t.z);
    }
    void method1() {
        int z = 5;
        method2();
        System.out.println(z);
    }
    void method2() {
        int z = 4;
        System.out.println(z);
    }
}