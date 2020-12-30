import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminWindow {
    private JPanel panel;
    private JButton editAUserProfileButton;
    private JButton deletaAUserButton;
    private JButton showUsersButton;


    public AdminWindow() {
        deletaAUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteUserWindow.createDeleteUserWindow();
            }
        });
        editAUserProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditUserWindow userEditor = new EditUserWindow();
                userEditor.createRegisterWindow();
            }
        });
    }

    public static void createAdminWindow(){
        JFrame frame = new JFrame("Admin Window");
        frame.setContentPane(new AdminWindow().panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.pack();
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);

    };
}
