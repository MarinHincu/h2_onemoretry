import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

import static javax.swing.JOptionPane.showMessageDialog;

public class LoginDialog {
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JPasswordField passwordInput;
    private JButton loginButton;
    private JButton cancelButton;
    private JTextField usernameInput;
    private JPanel panel;
    private JLabel registerLabel;
    private final JFrame frame = new JFrame("LoginScene");

    public LoginDialog() {


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameInput.getText();
                String password = new String(passwordInput.getPassword());
                if(DBController.validLoginData(username,password)){
                    closeLoginDialog();
                    if(username.equals("admin")){
                        AdminWindow.createAdminWindow();
                    }else{
                        MainWindow.createMainWindow();
                    }
                }else{
                    System.out.println(username + password);
                    showMessageDialog(null,"Wrong Login Data");
                }
            }
        });


        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                RegisterWindow rw = new RegisterWindow();
                rw.createRegisterWindow();
            }
        });
    }


    public void createLoginDialog() {

        frame.setContentPane(new LoginDialog().panel);
        frame.setLocationRelativeTo(null);
        frame.getRootPane().setDefaultButton(loginButton);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(400,250);
        frame.setVisible(true);

    }

    // not properly working
    public void closeLoginDialog(){
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSED));
        panel.setVisible(false);
        frame.setVisible(false);
        frame.dispose();
    }
}
