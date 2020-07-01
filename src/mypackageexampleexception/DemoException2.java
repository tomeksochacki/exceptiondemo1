package mypackageexampleexception;

import jdk.nashorn.internal.parser.JSONParser;

public class DemoException2 {
    static void genException() {
        int[] nums = new int[4];
        System.out.println("Before generate exception");

        nums[7] = 10;
        System.out.println("This statement is not print.");
    };

}

class ExceptionTest{
    public static void main(String[] args) {
    try {
    DemoException2.genException();
    }catch (ArrayIndexOutOfBoundsException ex){
        System.out.println("Index out of bounds.");
    }
        System.out.println("After catch");
    }
}
