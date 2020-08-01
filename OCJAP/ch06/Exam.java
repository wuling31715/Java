public class Exam{
    char c;
    public static void main(String[] args) {
        char v1 = 'a';
        char v2 = v1;
        v2 = 'e';
        Exam obj1 = new Exam();
        Exam obj2 = obj1;
        obj1.c = 'i';
        obj2.c = 'o';
        System.out.println(v1 + ", " + v2);        
        System.out.println(obj1.c + ", " + obj2.c);
    }
}