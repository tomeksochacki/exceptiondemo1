package mypackageexampleexception;

public class DemoException7 {
    public static void main(String[] args) {
        int[]tab1 = {4, 8, 16, 32, 64, 128, 256, 512};
        int[]tab2 = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < tab1.length; i++){
            try {
                System.out.println(tab1[i] + " / " + tab2[i] + " = " + tab1[i] / tab2[i]);
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Index out of bound.");
            }catch (Throwable ex){
                System.out.println("Come out exception.");
            }
        }
    }
}
