package mypackageexampleexception;

public class DemoException10 {
    public static void genException() {
        int[] number = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i =0; i<number.length; i++){
            try {
                System.out.println(number[i] + " / " + denom[i] + " = " + number[i]/denom[i]);
            }catch (ArithmeticException ex){
                System.out.println("Not divide by zero.");
            }catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("Array index out of bounds.");
            throw exc;
            }
        }
    }
}

class DemoException10B{
    public static void main(String[] args) {
        try {
            DemoException10.genException();
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Array index out of bounds.");
            System.out.println("Fatal error the program is exit.");
        }
    }
}