import java.util.Scanner;

class Calculator {

    float x, y;

    float add(){
        return this.x + this.y;
    }

    float sub(){
        return this.x - this.y;
    }

    float mul(){
        return this.x * this.y;
    }

    float div(){
        return this.x / this.y;
    }

}

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Boolean repeat = true;
        String option;

        while (repeat) {

            System.out.print("x = ");
            calculator.x = scanner.nextFloat();
            System.out.print("option = ");
            option = scanner.next();
            System.out.print("y = ");
            calculator.y = scanner.nextFloat();

            switch (option) {
                case "+":
                    System.out.println(calculator.add());                
                    repeat = false;
                    break;                
                case "-":
                    System.out.println(calculator.sub());
                    repeat = false;
                    break;
                case "*":
                    System.out.println(calculator.mul());
                    repeat = false;
                    break;
                case "/":
                    System.out.println(calculator.div());
                    repeat = false;
                    break;
                default:
                    System.out.println("try again.");
                    repeat = true;
                    break;
            }
        }
    }
}