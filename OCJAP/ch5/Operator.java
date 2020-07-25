public class Operator{
    public static void main(String[] args){
        int count = 20;
        int a, b, c, d;
        a = count++;
        b = count;
        c = ++ count;
        d = count + 1;
        System.out.println(a + b + c + d);
        System.out.println("a + b + c + d = " + a + b + c + d);
        System.out.println(a + b + "a + b" + c + d);
        System.out.println("a + b" + a + (b + c) + d);
        System.out.println('a' + a + 'b' + b + 'c' + c + 'd' + d);        
    }
}