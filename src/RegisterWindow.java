import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class RegisterWindow {
    private JTextField usernameTextField;
    private JTextField lastNameTextField;
    private JTextField firstNameTextField;
    private JTextField healthInformationTextField;
    private JTextField insuranceTypeTextField;
    private JTextField textField7;
    private JTextField passwordTextField;
    private JButton registerButton;
    private JPanel panel;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField dateOfBirthTextField;
    private JLabel label7;
    private JLabel label8;
    private JTextField addressTextField;
    private JLabel label5;
    private JLabel label1;
    private JLabel label6;
    private JLabel label9;


    public RegisterWindow() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String password = passwordTextField.getText();
                String firstName = firstNameTextField.getText();
                String lastName = lastNameTextField.getText();
                String dateOfBirth = dateOfBirthTextField.getText();
                String healthInformation = healthInformationTextField.getText();
                String insuranceType = insuranceTypeTextField.getText();
                String address = addressTextField.getText();

                if(DBController.insertUserIntoDB(username,password,firstName,lastName,address,dateOfBirth,healthInformation,insuranceType)){
                    showMessageDialog(null,"Registration finished\nYou can login now");
                }else {
                    showMessageDialog(null,"Registration failed, try again");
                }

                usernameTextField.setText("");
                passwordTextField.setText("");
                firstNameTextField.setText("");
                lastNameTextField.setText("");
                dateOfBirthTextField.setText("");
                healthInformationTextField.setText("");
                insuranceTypeTextField.setText("");
                addressTextField.setText("");
            }
        });
    }

    public void createRegisterWindow() {
        JFrame frame = new JFrame("LoginScene");
        frame.setContentPane(new RegisterWindow().panel);
        frame.getRootPane().setDefaultButton(registerButton);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(600,650);
        frame.setVisible(true);

    }
}
