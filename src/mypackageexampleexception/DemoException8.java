package mypackageexampleexception;

public class DemoException8 {
    public static void main(String[] args) {
        int[]tab = {4, 8, 16, 32, 64, 128, 256, 512};
        int[]tab2 = {2, 0, 4, 4, 0, 8};

        try {
            for (int i = 0; i<tab.length; i++){
                try {
                    System.out.println(tab[i] + " / " + tab2[i] + " = " + tab[i]/tab2[i]);
                } catch (ArithmeticException ex){
                    System.out.println("Not divide by zero.");
                }
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index out of array bounds.");
            System.out.println("Fatal error the program is exit.");
        }
    }
}
