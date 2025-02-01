package aiub;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form5 extends JFrame implements ActionListener {
    JRadioButton cookingRadioButton, writingRadioButton, codingRadioButton;
    JButton saveButton, cancelButton, tradeButton;
    JLayeredPane layeredPane;
    JPanel panel;
    ButtonGroup skillGroup;
    JLabel imageLabel;

    private String firstName, lastName, phone, address;

    public Form5(String firstName, String lastName, String phone, String address) {
        super("Select Skills");

        
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;

        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(600, 400));

        ImageIcon imageIcon = new ImageIcon("D:\\java project\\WhatsApp Image 2025-01-24 at 17.45.07_515c39bc.jpg");
        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0, 0, 600, 400);
        layeredPane.add(imageLabel, JLayeredPane.DEFAULT_LAYER);

        panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 400);

        cookingRadioButton = new JRadioButton("Cooking");
        cookingRadioButton.setBounds(20, 70, 100, 25);
        panel.add(cookingRadioButton);

        writingRadioButton = new JRadioButton("Writing");
        writingRadioButton.setBounds(20, 100, 100, 25);
        panel.add(writingRadioButton);

        codingRadioButton = new JRadioButton("Coding");
        codingRadioButton.setBounds(20, 130, 100, 25);
        panel.add(codingRadioButton);

        skillGroup = new ButtonGroup();
        skillGroup.add(cookingRadioButton);
        skillGroup.add(writingRadioButton);
        skillGroup.add(codingRadioButton);

        saveButton = new JButton("Upgrade Skill");
        saveButton.setBounds(40, 170, 150, 25);
        saveButton.addActionListener(this);
        panel.add(saveButton);

        tradeButton = new JButton("Trade Skill");
        tradeButton.setBounds(200, 170, 150, 25);
        tradeButton.addActionListener(this);
        panel.add(tradeButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(160, 220, 100, 25);
        cancelButton.addActionListener(this);
        panel.add(cancelButton);

        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);
        this.add(layeredPane);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == saveButton || ae.getSource() == tradeButton) {
            
            if (!cookingRadioButton.isSelected() && !writingRadioButton.isSelected() && !codingRadioButton.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please select at least one skill option.", "Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
        }

        if (ae.getSource() == saveButton) {
            if (cookingRadioButton.isSelected()) {
                new Form7(); 
            } else if (codingRadioButton.isSelected()) {
                new Form8(); 
            } else if (writingRadioButton.isSelected()) {
                new Form9();
            }
        } else if (ae.getSource() == tradeButton) {
            new Form10(firstName, lastName, phone, address); 
            this.dispose(); 
        } else if (ae.getSource() == cancelButton) {
            this.dispose();
        }
    }

    public static void main(String[] args) {
        
        new Form5("John", "Doe", "1234567890", "123 Main St");
    }
}