import javax.swing.SwingUtilities;

class Main{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { new App("AudioPlayer").setVisible(true); }

        });
    }
}