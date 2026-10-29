public class SimpleExceptionDemo {
    public static void main(String[] args){
        safeDivide(15, 5);
        safeDivide(30, 0);
        safeDivide(-27, 9);
    }
    public static void safeDivide(int numerator, int denominator){
        try{
            System.out.println("Attempting to divide " + numerator + " by " + denominator);
            int value = numerator / denominator;
            System.out.println("Result: " + value);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide a number by 0.");
        }
        finally{
            System.out.println("Divison operation is complete.");
            System.out.println("");
        }
    }
}
