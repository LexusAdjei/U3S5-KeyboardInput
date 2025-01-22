import java.util.Random;
import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
       int total = 0;

       for (int i = 0; i < 3; i++){
           System.out.println("input number " + (i + 1));
           int scannerInput = sc.nextInt();
           total += scannerInput;
       }
       System.out.println("Total: " + total);
        //Remember to close the Scanner
        sc.close();
    }
}
