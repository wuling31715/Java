public class Test{
    static int i = 6;
    public static void main(String[] args) {
        Test test = new Test();
        test.i++;
        Test.i++;
        test.i++;
        System.out.println(Test.i);
        System.out.println(test.i);
    }
}