package mypackageexampleexception;

public class DemoException1 {
    public static void main(String[] args) {
        int[] tab = new int[4];
        try {
            System.out.println("Before generate exception.");

            tab[0] = 7;
            System.out.println("This statement is not println.");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index out of array bounds.");
        }
        System.out.println("After catch.");
    }
}
