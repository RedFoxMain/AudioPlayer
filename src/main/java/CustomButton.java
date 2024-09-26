import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CustomButton extends JButton {
    private JButton btn;
    CustomButton(ImageIcon image, int x, int y, int width, int height){
       btn = new JButton(image);
       btn.setBorderPainted(false);
       btn.setFocusPainted(false);
       btn.setBounds(x, y, width, height);
    }
    public void setColor(Color color){ btn.setBackground(color); } // Set background color for button
    public JButton getInstance(){ return btn; } // Return instance of JButton
}
