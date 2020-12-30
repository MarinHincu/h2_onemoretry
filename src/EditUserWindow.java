import javax.swing.*;

public class EditUserWindow {
    private JPanel panel;
    private JButton confirmButton;
    private JTextField lnameTextField;
    private JTextField fnameTextField;
    private JTextField passwordTextField;
    private JTextField usernameTextField;
    private JTextField dOBTextField;
    private JTextField addressTextField;
    private JTextField healthInfoTextField;
    private JTextField insuranceTypeTextField;
    private JTextField insuranceNameTextField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel fnameLabel;
    private JLabel llnameLabel;
    private JLabel dOBLabel;
    private JLabel addressLabel;
    private JLabel healthInfoLabel;
    private JLabel insuranceTypeLabel;
    private JLabel insuranceNameLabel;




    public void createRegisterWindow() {
        JFrame frame = new JFrame("EditUserWindow");
        frame.setContentPane(new EditUserWindow().panel);
        frame.getRootPane().setDefaultButton(confirmButton);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(600,650);
        frame.setVisible(true);

    }
}
