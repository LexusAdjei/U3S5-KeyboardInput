import java.util.Random;
import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user

      System.out.println("Enter Integers:");
      int sum1 = sc.nextInt();
      int sum2 = sc.nextInt();
      int sum3 = sc.nextInt();

      int sum = sum1 + sum2 + sum3;

       System.out.println("Total: " + sum );
        //Remember to close the Scanner
        sc.close();
    }
}
