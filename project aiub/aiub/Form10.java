package aiub;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form10 extends JFrame implements ActionListener {
    JButton messiButton, ronaldoButton, mbappeButton, backButton; 
    JPanel panel;
    JLabel imageLabel, dayLabel;
    JTextField dayField;
    JLayeredPane layeredPane;
    String firstName, lastName, phone, address;

    public Form10(String firstName, String lastName, String phone, String address) {
        super("Trade Skill Options");

        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;

        this.setSize(559, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(559, 400));

        ImageIcon imageIcon = new ImageIcon("D:\\java project\\WhatsApp Image 2025-01-24 at 17.45.06_ea9e9e1f.jpg");
        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0, 0, 559, 400);
        layeredPane.add(imageLabel, JLayeredPane.DEFAULT_LAYER);

        panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(null);
        panel.setBounds(0, 0, 559, 400);

        JLabel tradeLabel = new JLabel("<html>Select a Skill to Trade:</html>");
        tradeLabel.setBounds(200, 60, 600, 30);
        tradeLabel.setForeground(Color.WHITE);
        panel.add(tradeLabel);

        messiButton = new JButton("Messi - Guitarist - 3000tk");
        messiButton.setBounds(80, 120, 400, 30);
        messiButton.addActionListener(this);
        panel.add(messiButton);

        ronaldoButton = new JButton("Ronaldo - Swimmer - 2000tk");
        ronaldoButton.setBounds(80, 170, 400, 30);
        ronaldoButton.addActionListener(this);
        panel.add(ronaldoButton);

        mbappeButton = new JButton("Mbappe - IT Expert - 4000tk");
        mbappeButton.setBounds(80, 220, 400, 30);
        mbappeButton.addActionListener(this);
        panel.add(mbappeButton);

        
        dayLabel = new JLabel("Enter number of days:");
        dayLabel.setBounds(80, 270, 200, 30);
        dayLabel.setForeground(Color.WHITE);
        panel.add(dayLabel);

        dayField = new JTextField();
        dayField.setBounds(250, 270, 100, 30);
        panel.add(dayField);

        
        backButton = new JButton("Back");
        backButton.setBounds(179, 310, 200, 30);
        backButton.addActionListener(this); 
        panel.add(backButton);

        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);
        this.add(layeredPane);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String skillTrade = "";
        int costPerDay = 0;

        
        if (ae.getSource() == messiButton) {
            skillTrade = "Messi - Guitarist";
            costPerDay = 3000;
        } else if (ae.getSource() == ronaldoButton) {
            skillTrade = "Ronaldo - Swimmer";
            costPerDay = 2000;
        } else if (ae.getSource() == mbappeButton) {
            skillTrade = "Mbappe - IT Expert";
            costPerDay = 4000;
        } else if (ae.getSource() == backButton) {
            
            new Form5(firstName, lastName, phone, address);
            this.dispose();
            return; 
        }

        try {
            int days = Integer.parseInt(dayField.getText());
            int totalCost = costPerDay * days;

            
            new Form13(firstName, lastName, phone, address, skillTrade, totalCost);
            this.dispose(); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number of days.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        
        String firstName = "John";  
        String lastName = "Doe";     
        String phone = "1234567890"; 
        String address = "123 Street"; 
        
        new Form10(firstName, lastName, phone, address); 
    }
}