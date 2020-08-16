public class Test2{
    public static void main(String[] args) {
        Test2 s1 = new Test2();
        Test2 s2 = new Test2();
        Test2 s3 = new Test2();
        s1 = s3;
        s3 = s2;
        s2 = null;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}