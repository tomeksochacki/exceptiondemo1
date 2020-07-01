package mypackageexampleexception;


public class DemoException2 {

    static void  genExceptionTwo(){
        System.out.println(5/0);
    }

    static void genException() {
        int[] num = new int[4];
        System.out.println("Before generate exception");

        num[10] = 10;
        System.out.println("This statement is not print.");
    }

}

class ExceptionTest{
    public static void main(String[] args) {
    try {
    DemoException2.genException();
    }catch (ArrayIndexOutOfBoundsException ex){
        System.out.println("Index out of bounds.");
    }
        System.out.println("After catch");

    try {
        DemoException2.genExceptionTwo();
    }catch (ArithmeticException excep){
        System.out.println("1" + excep.getMessage());
    }


    }
}
