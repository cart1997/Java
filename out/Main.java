public class Main {
    public static void main(String[] args) {
        try{
            String a = JOptionPane.showInputDialog(
                    "Enter the first number.");
            int i = Integer.parseInt(a);
            String b = JOptionPane.showInputDialog(
                    "Enter the second number.");
            int j = Integer.parseInt(b);
            JOptionPane.showMessageDialog (null,
                    "The sum of " + i + " and " + j +
                            "is: " + (i + j));
        }catch(Exception e){
            JOptionPane.showMessageDialog (null,
                    "Error: Operands must be integers.");
            System.exit(0);
        }
    }
}