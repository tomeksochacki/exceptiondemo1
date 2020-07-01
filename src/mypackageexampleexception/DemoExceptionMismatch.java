package mypackageexampleexception;

public class DemoExceptionMismatch {
    public static void main(String[] args) {
        int[] nums = new int[4];
        try {
            System.out.println("Before generate exception.");
        nums[10] = 7;
            System.out.println("This statement is not print.");
        }catch (ArithmeticException ex){
            System.out.println("Index out of bounds.");
        }
        System.out.println("Next to catch.");
    }
}
