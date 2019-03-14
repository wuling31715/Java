import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("what's your name?");
        name = scanner.nextLine();
        System.out.println("hi! " + name);
        
    }
}