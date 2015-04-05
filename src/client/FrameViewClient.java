package client;

import database.ConnectionDataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.GridBagConstraints.WEST;

public class FrameViewClient {

    static JPanel panelClient;

    FrameViewClient() {

        panelClient = new JPanel(new GridBagLayout());
        GridBagConstraints gridBagConstraintsClient = new GridBagConstraints();

        JButton buttonClientOk = new JButton("Ok");

        JLabel labelServer = new JLabel("Server");
        JLabel labelLogin = new JLabel("Login");
        JLabel labelPassword = new JLabel("Password");

        JTextField textFieldServer = new JTextField(15);
        JTextField textFieldLogin = new JTextField(15);
        JPasswordField textFieldPassword = new JPasswordField(15);

        GridBagConstraints(gridBagConstraintsClient, 0,0, 1,1,1,1, labelServer);
        GridBagConstraints(gridBagConstraintsClient, 0,1, 1,1,1,1, labelLogin);
        GridBagConstraints(gridBagConstraintsClient, 0,2, 1,1,1,1, labelPassword);

        GridBagConstraints(gridBagConstraintsClient, 1,0, 1,1,1,1, textFieldServer);
        GridBagConstraints(gridBagConstraintsClient, 1,1, 1,1,1,1, textFieldLogin);
        GridBagConstraints(gridBagConstraintsClient, 1,2, 1,1,1,1, textFieldPassword);

        GridBagConstraints(gridBagConstraintsClient, 1,3, 1,119,1,1, buttonClientOk);

        buttonClientOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConnectionDataBase();
            }
        });

        JFrame frameViewClient = getFrame(250, 140, false);
        frameViewClient.add(panelClient);
    }

    private void GridBagConstraints (GridBagConstraints gridBagConstraints, int gridx, int gridy,
                                     int top, int left, int bottom, int right, Component component) {
        gridBagConstraints.anchor = WEST;
        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.insets = new Insets(top, left, bottom, right);
        panelClient.add(component, gridBagConstraints);
    }

    private JFrame getFrame(int a, int b, boolean resizable) {
        JFrame frameViewClient = new JFrame();
        frameViewClient.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameViewClient.setPreferredSize(new Dimension(a, b));
        frameViewClient.setResizable(resizable);
        frameViewClient.pack();
        frameViewClient.setVisible(true);
        frameViewClient.setLocationRelativeTo(null);
        return frameViewClient;
    }
}