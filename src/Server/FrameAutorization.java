package Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class WindowInAdmin {
    
    WindowInAdmin() {

        JFrame frameAutoriz = new JFrame("Авторизация");
        frameAutoriz.setLayout(new GridBagLayout());
        frameAutoriz.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameAutoriz.setResizable(false);
        frameAutoriz.setLocationRelativeTo(null);

        JLabel serverLabel = new JLabel("Сервер:");
        JTextField serverTextField = new JTextField(15);
        frameAutoriz.add(serverLabel, new GridBagConstraints(0,0,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        frameAutoriz.add(serverTextField, new GridBagConstraints(1,0,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        JLabel loginLabel = new JLabel("Пользователь:");
        JTextField loginTextField = new JTextField(15);
        frameAutoriz.add(loginLabel, new GridBagConstraints(0,1,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        frameAutoriz.add(loginTextField, new GridBagConstraints(1,1,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        JLabel passwdLabel = new JLabel("Пароль:");
        JPasswordField passwordField = new JPasswordField(15);
        frameAutoriz.add(passwdLabel, new GridBagConstraints(0,2,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        frameAutoriz.add(passwordField, new GridBagConstraints(1,2,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        JButton inButton = new JButton("Вход");
        frameAutoriz.add(inButton, new GridBagConstraints(0,3,2,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        inButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK!");
            }
        });

        frameAutoriz.pack();
        frameAutoriz.setVisible(true);
    }
}

public class FrameAutorization {
    public static void main(String[] args) {
        new WindowInAdmin();
    }
}
