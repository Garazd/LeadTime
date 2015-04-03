package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FrameViewClient {

    static JPanel panelClient = new JPanel();

    FrameViewClient() {
        GridBagLayout gridBagLayoutClient = new GridBagLayout();
        panelClient.setLayout(gridBagLayoutClient);

        final JButton buttonClientOk = new JButton("Ok");
        final JButton buttonClientCancel = new JButton("Cancel");

        JTextField textFieldLogin = new JTextField(20);
        JTextField textFieldPassword = new JTextField(20);

        getGridBagConstraintsClient;
        panelClient.add(textFieldLogin);

        gridBagConstraintsClient.gridx = 0;
        gridBagConstraintsClient.gridy = 1;
        panelClient.add(textFieldPassword, gridBagConstraintsClient);

        gridBagConstraintsClient.gridx = 0;
        gridBagConstraintsClient.gridy = 2;
        panelClient.add(buttonClientOk, gridBagConstraintsClient);

        gridBagConstraintsClient.gridx = 1;
        gridBagConstraintsClient.gridy = 2;
        panelClient.add(buttonClientCancel, gridBagConstraintsClient);

        buttonClientOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameViewClientPrimary = getFrame(800, 600);
                frameViewClientPrimary.add(buttonClientOk);
            }
        });

        JFrame frameViewClient = getFrame(300, 200);
        frameViewClient.add(panelClient);
    }

    private static GridBagConstraints getGridBagConstraintsClient (int gridx, int gridy,
                                 int top, int left, int bottom, int right, Component component) {
        GridBagConstraints gridBagConstraintsClient = new GridBagConstraints();
        gridBagConstraintsClient.gridx = gridx;
        gridBagConstraintsClient.gridy = gridy;
        gridBagConstraintsClient.insets = new Insets(top, left, bottom, right);
        panelClient.add(component, gridBagConstraintsClient);
        return getGridBagConstraintsClient();
    }

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

public class MainClass {
    public static void main(String[] args){
        new FrameViewClient();
    }
}