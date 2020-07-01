package mypackageexampleexception;

public class DemoException3 {
    public static void main(String[] args) {
        int[] tab = new int[4];
        System.out.println("Before generate exception.");

        tab[10] = 8;
    }
}
