package mypackageexampleexception;

public class DemoException9 {
    public static void main(String[] args) {
        try {
            System.out.println("Before instruction 'throw'.");
            throw new ArithmeticException();
        }catch (ArithmeticException ex){
            System.out.println("Exception is catch.");
        }
        System.out.println("After block 'try catch'.");
    }
}
