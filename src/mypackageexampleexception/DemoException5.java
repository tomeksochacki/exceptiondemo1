package mypackageexampleexception;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

public class DemoException5 {
    public static void main(String[] args) {
        int[] tab1 = {4, 8, 16, 32, 64, 128};
        int[] tab2 = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i<tab1.length; i++){
            try {
                System.out.println(tab1[i] + " / " + tab2[i] + " = " + tab1[i]/tab2[i]);
            }catch (ArithmeticException ex){
                System.out.println("Can not divide by zero.");
            }
        }

    }
}
