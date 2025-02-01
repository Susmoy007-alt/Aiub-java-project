package aiub;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form9 extends JFrame implements ActionListener {
    JButton closeButton;
    JPanel panel;
    JLayeredPane layeredPane;
    JLabel imageLabel;

    public Form9() {
        super("Cooking Skill Upgrade");

        this.setSize(650, 420); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 

       
        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(650, 400));

        
        ImageIcon imageIcon = new ImageIcon("D:\\java project\\WhatsApp Image 2025-01-24 at 17.45.07_6c3da043.jpg");
        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0, 0, 650, 400);  

        
        layeredPane.add(imageLabel, JLayeredPane.DEFAULT_LAYER);

        
        panel = new JPanel();
        panel.setOpaque(false); 
        panel.setLayout(null); 
        panel.setBounds(0, 0, 650, 400); 

        
        JLabel infoLabel = new JLabel("<html><h3 style='color:white;'>Your writing Skill Has Been Upgraded!</h3></html>");
        infoLabel.setBounds(20, -10, 600, 100);
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center the text
        panel.add(infoLabel);

       
        JTextArea relaxationTechniques = new JTextArea();
        relaxationTechniques.setText("Writing Special Techniques:\n\n"
            + "1.Grammar and Syntax: Mastery of rules for proper sentence structure and punctuation.\n"
            + "2.Clarity and Conciseness: Ability to express ideas clearly and succinctly.\n"
            + "3.Organization: Structuring content logically with clear flow and transitions.\n"
            + "4.Audience Awareness: Understanding the target audience to tailor tone and style.\n"
            + "5.Research: Skills in gathering and incorporating relevant information.\n"
            + "6.Editing and Revising: Ability to refine drafts for clarity, coherence, and correctness.\n"
            + "7.Creativity: Incorporating unique ideas and perspectives to engage readers.\n"
            + "8.Voice and Style: Developing a personal writing voice that resonates with readers.\n"
            + "9.Persuasion: Techniques for crafting compelling arguments or narratives.\n"
            + "10.Adaptability: Flexibility to write across different formats (e.g., essays, articles, reports).");
        relaxationTechniques.setBounds(20, 110, 600, 230);
        relaxationTechniques.setLineWrap(true);
        relaxationTechniques.setWrapStyleWord(true);
        relaxationTechniques.setBackground(new Color(0, 0, 0, 0)); 
        relaxationTechniques.setForeground(Color.WHITE); 
        relaxationTechniques.setEditable(false); 
        panel.add(relaxationTechniques);

        
        closeButton = new JButton("Close");
        closeButton.setBounds(250, 340, 150, 30); 
        closeButton.setForeground(Color.BLACK); 
        closeButton.setBackground(Color.WHITE); 
        closeButton.addActionListener(this);
        panel.add(closeButton);

        
        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER); 

       
        this.add(layeredPane);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        this.dispose(); 
    }

    public static void main(String[] args) {
        new Form9(); 
    }
}