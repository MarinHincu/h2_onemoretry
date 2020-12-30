import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class DeleteUserWindow {
    private JTextField userToBeDeleted;
    private JLabel label1;
    private JButton deleteButton;
    private JPanel panel;


    public DeleteUserWindow() {
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userToBeDeleted.getText();
                if(DBController.findUsernameInDB(username)){
                    DBController.deleteUserFromDB(username);
                    showMessageDialog(null,"User " + username + " was deleted");
                }else{
                    showMessageDialog(null,"User " + username + " could not be deleted");
                }
            }
        });
    }

    public static void createDeleteUserWindow(){
        JFrame frame = new JFrame("Delete User Window");
        frame.setContentPane(new DeleteUserWindow().panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.pack();
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);

    };
}
