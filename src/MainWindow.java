import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class MainWindow {
    private JTextArea mainWindowTextArea;
    private JPanel panel;


    public static void createMainWindow(){
        JFrame frame = new JFrame("MainWindow");
        frame.setContentPane(new MainWindow().panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.pack();
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);

    };
}

