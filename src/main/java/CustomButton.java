import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CustomButton extends JButton {
    private JButton btn;

    CustomButton(ImageIcon image, int x, int y, int width, int height) {
        this.btn = new JButton(image);
        this.btn.setBorderPainted(false);
        this.btn.setFocusPainted(false);
        this.btn.setBounds(x, y, width, height);
    }

    // Set background color for button
    public void setColor(Color color) {
        this.btn.setBackground(color);
    }

    // Return instance of JButton
    public JButton getInstance() {
        return this.btn;
    }
}
