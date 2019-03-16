import java.util.Scanner;

class Calculator {

    float x, y;
    // class variable
    static float z;    

    // constructor    
    public Calculator(float x, float y){ 
        this.x = x;
        this.y = y;
    }

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

    float sum(){
        this.z++;
        return this.z;
    }

    // class method
    static void class_method(){
        System.out.println("class method.");
    }

}

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float x, y;
        Boolean repeat = true;
        String option;
        Calculator calculator = new Calculator(0, 0);

        while (repeat) {

            System.out.print("x = ");
            calculator.x = scanner.nextFloat();
            System.out.print("option = ");
            option = scanner.next();
            System.out.print("y = ");
            calculator.y = scanner.nextFloat();
            
            switch (option) {
                case "0":
                    repeat = false;
                    break;
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
                case "s":
                    System.out.println(calculator.sum());
                    break;
                default:
                    System.out.println("try again.");
                    repeat = true;
                    break;
            }
        }
        Calculator calculator2 = new Calculator(0, 0);
        System.out.println(calculator2.sum());
        Calculator.class_method();
        // garbage collection
        calculator = null;
        System.out.println(calculator.sum());
        System.gc();
        System.out.println(calculator2.sum());
    }
}