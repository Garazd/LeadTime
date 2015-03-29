package server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameAuthorization {

    static JPanel panelAuthor;

    FrameAuthorization() {

        panelAuthor = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel serverLabel = new JLabel("Сервер:");
        GridBagContrainCustom(gbc, 0, 0, 1, 2, 2, 2, 2, serverLabel);
        JTextField serverField = new JTextField(15);
        GridBagContrainCustom(gbc, 1, 0, 2, 2, 2, 2, 2, serverField);

        JLabel loginLabel = new JLabel("Пользователь:");
        GridBagContrainCustom(gbc, 0, 1, 1, 2, 2, 2, 2, loginLabel);
        JTextField loginField = new JTextField(15);
        GridBagContrainCustom(gbc, 1, 1, 2, 2, 2, 2, 2, loginField);

        JLabel passwordLabel = new JLabel("Пароль:");
        GridBagContrainCustom(gbc, 0, 2, 1, 2, 2, 2, 2, passwordLabel);
        JPasswordField passwordField = new JPasswordField(15);
        GridBagContrainCustom(gbc, 1, 2, 1, 2, 2, 2, 2, passwordField);

        JButton inButton = new JButton("Вход");
        GridBagContrainCustom(gbc, 0, 3, 2, 2, 100, 2, 2, inButton);


        JFrame frameAuthor = new JFrame("Авторизация");
        frameAuthor.add(panelAuthor);
        frameAuthor.setResizable(false);
        frameAuthor.setLocationRelativeTo(null);
        frameAuthor.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameAuthor.pack();
        frameAuthor.setVisible(true);


        inButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK!");
            }
        });

    }

    private static void GridBagContrainCustom(GridBagConstraints gbc, int gridx, int gridy, int gridwidth,
                                              int top, int left, int bottom, int right, Component component) {
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridwidth;
        gbc.insets = new Insets(top, left, bottom, right);
        panelAuthor.add(component, gbc);
    }
}