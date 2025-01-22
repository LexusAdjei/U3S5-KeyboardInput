import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "There's no input here, just a message",
                "Title",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Best NASCAR Driver?",
                "Dialog Title",
                2,
                null,
                null,
                "Type something here.");
        
        
        String[] acceptableValues = {"Michael Schummacer", "Lewis Hamliton", "AJ Foyt"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Best Formula Driver?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        System.out.println(input1);
        System.out.println(input2);
    }
}
