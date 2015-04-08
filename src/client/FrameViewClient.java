package client;

import client.database.ConnectionDataBase;
import functions.Functions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameViewClient {

    public static JPanel panelClient;

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

        Functions.GridBagConstraints(gridBagConstraintsClient, 0, 0, 1, 1, 1, 1, labelServer);
        Functions.GridBagConstraints(gridBagConstraintsClient, 0, 1, 1, 1, 1, 1, labelLogin);
        Functions.GridBagConstraints(gridBagConstraintsClient, 0, 2, 1, 1, 1, 1, labelPassword);

        Functions.GridBagConstraints(gridBagConstraintsClient, 1, 0, 1, 1, 1, 1, textFieldServer);
        Functions.GridBagConstraints(gridBagConstraintsClient, 1, 1, 1, 1, 1, 1, textFieldLogin);
        Functions.GridBagConstraints(gridBagConstraintsClient, 1, 2, 1, 1, 1, 1, textFieldPassword);

        Functions.GridBagConstraints(gridBagConstraintsClient, 1, 3, 1, 119, 1, 1, buttonClientOk);

        buttonClientOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConnectionDataBase();
            }
        });

        JFrame frameViewClient = Functions.getFrame(250, 140, false);
        frameViewClient.add(panelClient);
    }
}