import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;


public class App extends JFrame {
    private Color text_color = Color.BLACK;
    // Create main window
    App(String app_name){
        super(app_name);
        setResizable(false);
        setSize(350, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        SetGui();
    }
    // Resize the image
    private ImageIcon ReSize(String path, int width, int height){
        BufferedImage image = null;
        try { image = ImageIO.read(new File(path));
        } catch (IOException e) { throw new RuntimeException(e); }
        return new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }

    // Set all gui components
    private void SetGui() {
        // Menu button
        JButton menu_btn = new JButton(ReSize("src/main/resources/assets/menu.png", 40, 40));
        menu_btn.setContentAreaFilled(false);
        menu_btn.setBorderPainted(false);
        menu_btn.setBackground(null);
        menu_btn.setFocusPainted(false);
        menu_btn.setBounds(5,5,40,40);
        add(menu_btn);

        // Title label
        JLabel title = new JLabel("NOW PLAYING");
        title.setFont(new Font("Monospace", Font.PLAIN, 16));
        title.setForeground(text_color);
        title.setBounds(0, 3, getWidth()-10, 50);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        add(title);

        // Image
        JLabel image = new JLabel(ReSize("src/main/resources/assets/default.jpg", 200, 200));
        image.setBounds(67, 60, 200, 200);
        add(image);

        // Name
        JLabel music_name = new JLabel("Name");
        music_name.setFont(new Font("Monospace", Font.PLAIN, 20));
        music_name.setForeground(text_color);
        music_name.setBounds(0, getHeight()-345, getWidth()-10, 50);
        music_name.setHorizontalAlignment(SwingConstants.CENTER);
        add(music_name);

        // Artist
        JLabel artist = new JLabel("Artist");
        artist.setFont(new Font("Monospace", Font.PLAIN, 18));
        artist.setForeground(text_color);
        artist.setBounds(0, getHeight()-320, getWidth()-10, 50);
        artist.setHorizontalAlignment(SwingConstants.CENTER);
        add(artist);

        // Top panel button
        JPanel top_panel = new JPanel();
        top_panel.setBounds(0, getHeight()-260, getWidth(), 50);

        // Volume button
        JButton volume_btn = new JButton(ReSize("src/main/resources/assets/volume.png", 25, 25));
        volume_btn.setContentAreaFilled(false);
        volume_btn.setBorderPainted(false);
        volume_btn.setBackground(null);
        volume_btn.setFocusPainted(false);
        volume_btn.setBounds(0,0,25,25);
        top_panel.add(volume_btn);

        // Repeat button
        JButton repeat_btn = new JButton(ReSize("src/main/resources/assets/repeat.png", 27, 27));
        repeat_btn.setContentAreaFilled(false);
        repeat_btn.setBorderPainted(false);
        repeat_btn.setBackground(null);
        repeat_btn.setFocusPainted(false);
        repeat_btn.setBounds(0,0,27,27);
        top_panel.add(repeat_btn);

        add(top_panel);

        // Slider
       JSlider slider = new JSlider(JSlider.HORIZONTAL, 0 ,100, 0);
       slider.setBounds(43, getHeight()-200, getWidth()-100, 15);
       slider.setBackground(null);
       add(slider);

       // Bottom panel button
       JPanel bottom_panel = new JPanel();
       bottom_panel.setBounds(0, getHeight()-160, getWidth()-15, getHeight());

       // Prev button
       JButton prev_btn = new JButton(ReSize("src/main/resources/assets/prev.png", 40, 40));
       prev_btn.setContentAreaFilled(false);
       prev_btn.setBorderPainted(false);
       prev_btn.setBackground(null);
       prev_btn.setFocusPainted(false);
       prev_btn.setBounds(0,0,40,40);
       bottom_panel.add(prev_btn);

        // Start button
       JButton start_btn = new JButton(ReSize("src/main/resources/assets/start.png", 40, 40));
       start_btn.setContentAreaFilled(false);
       start_btn.setBorderPainted(false);
       start_btn.setBackground(null);
       start_btn.setFocusPainted(false);
       start_btn.setBounds(0,0,40,40);
       bottom_panel.add(start_btn);

        // Stop button
       JButton stop_btn = new JButton(ReSize("src/main/resources/assets/stop.png", 40, 40));
       stop_btn.setContentAreaFilled(false);
       stop_btn.setBorderPainted(false);
       stop_btn.setBackground(null);
       stop_btn.setFocusPainted(false);
       stop_btn.setBounds(0,0,40,40);
       bottom_panel.add(stop_btn);

       // Next button
       JButton next_btn = new JButton(ReSize("src/main/resources/assets/next.png", 40, 40));
       next_btn.setContentAreaFilled(false);
       next_btn.setBorderPainted(false);
       next_btn.setBackground(null);
       next_btn.setFocusPainted(false);
       next_btn.setBounds(0,0,40,40);
       bottom_panel.add(next_btn);
       add(bottom_panel);
    }
}

class Main{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { new App("AudioPlayer").setVisible(true); }
        });

    }
}
