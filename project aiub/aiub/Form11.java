package aiub;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form11 extends JFrame implements ActionListener {
    JLabel paymentLabel;
    JTextField phoneField;
    JButton confirmButton;
    String firstName, lastName, phone, address, skillTrade, totalCost, selectedPayment;
    JLayeredPane layeredPane;
    JPanel panel;
    JLabel imageLabel;

    public Form11(String firstName, String lastName, String phone, String address, String skillTrade, String selectedPayment, int totalCost) {
        super("Form 11");

        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone; 
        this.address = address;
        this.skillTrade = skillTrade; 
        this.selectedPayment = selectedPayment;
        this.totalCost = String.valueOf(totalCost); 

        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(600, 400));

        ImageIcon imageIcon = new ImageIcon("D:\\java project\\WhatsApp Image 2025-01-24 at 17.45.07_63c35219.jpg");
        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0, 0, 600, 400);
        layeredPane.add(imageLabel, JLayeredPane.DEFAULT_LAYER);

        panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 400);

        
        paymentLabel = new JLabel("You selected: " + skillTrade + " with " + selectedPayment + " (Total: " + totalCost + " tk)");
        paymentLabel.setBounds(20, 20, 400, 30);
        paymentLabel.setForeground(Color.white); 
        panel.add(paymentLabel);

        
        JLabel phoneLabel = new JLabel("Enter your phone number:");
        phoneLabel.setBounds(20, 70, 200, 30);
        phoneLabel.setForeground(Color.white); 
        panel.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(20, 110, 200, 30);
        panel.add(phoneField);

        confirmButton = new JButton("Confirm");
        confirmButton.setBounds(20, 160, 100, 30);
        confirmButton.addActionListener(this);
        panel.add(confirmButton);

        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);
        this.add(layeredPane); 
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        
        String enteredPhone = phoneField.getText();

        
        System.out.println("Form11 -> Form12");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Phone: " + enteredPhone);
        System.out.println("Address: " + address);
        System.out.println("Skill Trade: " + skillTrade);

        
        if (enteredPhone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your phone number", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
            new Form12(firstName, lastName, enteredPhone, address, skillTrade, totalCost, selectedPayment);
            this.dispose(); 
        }
    }

    public static void main(String[] args) {
        
        new Form11("John", "Doe", "1234567890", "123 Main St", "Guitar Lesson", "Mobile Banking", 1000);
    }
}