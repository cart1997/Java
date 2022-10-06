import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JTextField a;
    JTextField b;
    JTextField result;
    JRadioButton add;
    JRadioButton sub;
    JRadioButton mul;
    JRadioButton div;

    JLabel equal;

    public static void main(String[] args) {

        new Main().display();

    }
    private void display() {

        setSize(new DimensionUIResource(800,300));
        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);
        a = new JTextField();
        a.setBounds(170, 140, 100, 21);

        b = new JTextField();
        b.setBounds(320, 140, 100, 21);

        result = new JTextField();
        result.setBounds(480, 140, 100, 21);
        ButtonGroup group = new ButtonGroup();

        add = new JRadioButton("+");
        add.setBounds(270, 120, 50,20);
        add.addActionListener(this);
        group.add(add);

        sub = new JRadioButton("-");
        sub.setBounds(270, 137,50, 20);
        sub.addActionListener(this);
        group.add(sub);


        mul = new JRadioButton("*");
        mul.setBounds(270, 154,50, 20);
        mul.addActionListener(this);
        group.add(mul);

        div = new JRadioButton("/");
        div.setBounds(270, 171, 50, 20);
        div.addActionListener(this);
        group.add(div);


        equal = new JLabel("=");
        equal.setBounds(443, 140, 100, 21);


        c.add(a);
        c.add(b);
        c.add(add);
        c.add(sub);
        c.add(mul);
        c.add(div);
        c.add(result);
        c.add(equal);
        setVisible(true);

        }
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
                int num1 = Integer.parseInt(a.getText());
                int num2 = Integer.parseInt(b.getText());

                if (add.isSelected()){
                    result.setText(String.valueOf(num1 + num2));
                    JOptionPane.showMessageDialog (null,"You made Addition operation");
                } else if (sub.isSelected()){
                    result.setText(String.valueOf(num1 - num2));
                    JOptionPane.showMessageDialog (null,"You made Subtraction operation");

                }
                else if (mul.isSelected()){
                    result.setText(String.valueOf(num1 * num2));
                    JOptionPane.showMessageDialog (null,"You made Multiplication operation");

                }
                else if (div.isSelected()){
                    result.setText(String.valueOf(num1 / num2));
                    JOptionPane.showMessageDialog (null,"You made Division operation");

                }

        }
        catch (ArithmeticException ae1){
            JOptionPane.showMessageDialog (null,"Division by zero is not correct");
        }
        catch (NumberFormatException Ne){
            JOptionPane.showMessageDialog (null,"You must enter integers");
        }

    }
    }