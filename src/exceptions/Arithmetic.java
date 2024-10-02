package exceptions;

public class Arithmetic {

    // The 'throws Exception' in the method signature indicates that this method can throw an error
    // It requires the caller to handle it using a try-catch block
    public static int division(int numerator, int denominator) throws Exception {
        if (denominator == 0)
            // if I use here RunTimeException instead of Exception
            // I don't need to add throws Exception
            // and the caller doesn't need to use a try-catch block
            // it not prevent the error
            throw new Exception("Divided by Zero Exception");
        return numerator / denominator;
    }
}
