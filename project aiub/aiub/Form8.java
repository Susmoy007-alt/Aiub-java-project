package aiub;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form8 extends JFrame implements ActionListener {
    JButton closeButton;
    JPanel panel;
    JLayeredPane layeredPane;
    JLabel imageLabel;

    public Form8() {
        super("Cooking Skill Upgrade");

        this.setSize(650, 420); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 

        
        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(650, 400));

        
        ImageIcon imageIcon = new ImageIcon("E:\\JAVA programing\\OOPProject\\c1179485-4734-486c-8e32-0da1752b2b73.jpg");
        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0, 0, 650, 400); 

        
        layeredPane.add(imageLabel, JLayeredPane.DEFAULT_LAYER);

        
        panel = new JPanel();
        panel.setOpaque(false); 
        panel.setLayout(null); 
        panel.setBounds(0, 0, 650, 400); 

        
        JLabel infoLabel = new JLabel("<html><h3 style='color:white;'>Your Coding Skill Has Been Upgraded!</h3></html>");
        infoLabel.setBounds(20, -10, 600, 100);
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER); 
        panel.add(infoLabel);

        
        JTextArea relaxationTechniques = new JTextArea();
        relaxationTechniques.setText("Coding Special Techniques:\n\n"
            + "1.Programming Languages: Proficiency in languages like Python, Java, or JavaScript.\n"
            + "2.Data Structures and Algorithms: Understanding common structures (arrays, lists, trees) and algorithms for problem-solving.\n"
            + "3.Version Control: Familiarity with tools like Git for tracking changes and collaborating on code.\n"
            + "4.Debugging: Ability to identify and fix errors in code efficiently.\n"
            + "5.APIs and Web Services: Knowledge of how to interact with APIs for data exchange.\n"
            + "6.Development Frameworks: Experience with frameworks like React, Django, or Flask to streamline development.\n"
            + "7.Database Management: Understanding of SQL and NoSQL databases for data storage and retrieval.\n"
            + "8.Testing: Skills in writing and executing tests to ensure code quality.\n"
            + "9.Responsive Design: Knowledge of creating applications that work well on various devices.\n"
            + "10.Problem-Solving: Strong analytical skills to approach and solve coding challenges.");
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
        new Form8(); 
    }
}