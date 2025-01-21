import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.

        String input = JOptionPane.showInputDialog("Type Something");
        System.out.println(input);

        //Parse the input as an int.
        int oldNum = Integer.parseInt(input);
        //Print its value +1
        System.out.println(oldNum + 1 );

        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter random Number")) +1;
        System.out.println(num);


        
    }
}
