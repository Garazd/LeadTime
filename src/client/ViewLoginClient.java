package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewLoginClient {
    public static void main(String[] args) {
        GridBagLayout gridBagLayoutClient = new GridBagLayout();
        GridBagConstraints gridBagConstraintsClient = new GridBagConstraints();

        JPanel panelClient = new JPanel();
        panelClient.setLayout(gridBagLayoutClient);

        final JButton buttonClientOk = new JButton("Ok");

        JTextField textFieldLogin = new JTextField(20);
        JTextField textFieldPassword = new JTextField(20);

        gridBagConstraintsClient.gridx = 0;
        gridBagConstraintsClient.gridy = 0;
        panelClient.add(textFieldLogin, gridBagConstraintsClient);

        gridBagConstraintsClient.gridx = 0;
        gridBagConstraintsClient.gridy = 1;
        panelClient.add(textFieldPassword, gridBagConstraintsClient);

        gridBagConstraintsClient.gridx = 0;
        gridBagConstraintsClient.gridy = 2;
        panelClient.add(buttonClientOk, gridBagConstraintsClient);

        buttonClientOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameViewClientPrimary = getFrame(800, 600);
                frameViewClientPrimary.add(buttonClientOk);
            }
        });

        JFrame frameViewClient = getFrame(500, 200);
        frameViewClient.add(panelClient);
    }

    //private static void GridBagConstraints(GridBagConstraints gridBagConstraintsClient) {
    //    gridBagConstraintsClient.gridx = 0;
    //    gridBagConstraintsClient.gridy = 0;
    //}

    private static JFrame getFrame(int a, int b) {
        JFrame frameViewClient = new JFrame();
        frameViewClient.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameViewClient.setResizable(true);
        frameViewClient.setPreferredSize(new Dimension(a, b));
        frameViewClient.pack();
        frameViewClient.setVisible(true);
        frameViewClient.setLocationRelativeTo(null);
        return frameViewClient;
    }
}