package aiub;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form7 extends JFrame implements ActionListener {
    JButton closeButton;
    JPanel panel;
    JLayeredPane layeredPane;
    JLabel imageLabel;

    public Form7() {
        super("Cooking Skill Upgrade");

        this.setSize(650, 420); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 

        
        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(650, 400));

        
        ImageIcon imageIcon = new ImageIcon("D:\\java project\\WhatsApp Image 2025-01-24 at 17.45.07_6c3da043.jpg");
        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0, 0, 650, 400); // Set the image dimensions

        
        layeredPane.add(imageLabel, JLayeredPane.DEFAULT_LAYER);

        
        panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(null); 
        panel.setBounds(0, 0, 650, 400); 
		
        
        JLabel infoLabel = new JLabel("<html><h3 style='color:white;'>Your Cooking Skill Has Been Upgraded!</h3></html>");
        infoLabel.setBounds(20, -10, 600, 100);
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER); 
        panel.add(infoLabel);

        
        JTextArea relaxationTechniques = new JTextArea();
        relaxationTechniques.setText("Cooking Special Techniques:\n\n"
            + "1. Searing: Quickly brown meat at high heat to lock in flavor.\n"
            + "2. Deglazing: Add liquid to a hot pan to release flavorful bits.\n"
            + "3. Blanching: Boil vegetables briefly, then immerse in ice water.\n"
            + "4. Braising: Slow-cook meat or vegetables in liquid for tenderness.\n"
            + "5. Poaching: Gently cook food in simmering liquid to retain moisture.\n"
            + "6. Reduction: Simmer liquids to concentrate flavor.\n"
            + "7. Sous Vide: Cook food in a vacuum-sealed bag in low-temperature water.\n"
            + "8. Fermenting: Use natural fermentation to preserve and flavor food.\n"
            + "9. Caramelization: Heat sugars to create a rich, sweet flavor.\n"
            + "10. Emulsifying: Mix liquids that usually separate, like oil and vinegar.");
        relaxationTechniques.setBounds(20, 130, 600, 200);
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
        new Form7(); 
    }
}