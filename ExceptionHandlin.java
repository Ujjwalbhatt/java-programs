//write a program to divide two numbers with proper exception handlers.

public class ExceptionHandlin {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }
    }
    
}
