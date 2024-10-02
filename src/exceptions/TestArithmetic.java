package exceptions;

public class TestArithmetic {
    public static void main(String[] args) {
        try {
            int result = Arithmetic.division(10, 0);
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("error: " + e);
        } finally {
            System.out.println("This part will be executed always at the end");
        }
    }
}
