package mypackageexampleexception;

public class DemoException11 {
    static void getException(){
        int[] nums = new int[4];
        System.out.println("Before exception.");
        nums[10] = 9;
        System.out.println("This statement isn't print.");
    }
}

class UseThrowableMethods{
    public static void main(String[] args) {
        try {
            DemoException11.getException();
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("This is standard statement with error.");
            System.out.println(ex);
            System.out.println("\nstack trace: ");
            ex.printStackTrace();
        }
        System.out.println("After catch.");
    }
}
