package functions;

import client.FrameViewClient;

import javax.swing.*;
import java.awt.*;

import static java.awt.GridBagConstraints.WEST;

public class Functions {

    public static void GridBagConstraints (GridBagConstraints gridBagConstraints, int gridx, int gridy,
                                     int top, int left, int bottom, int right, Component component) {
        gridBagConstraints.anchor = WEST;
        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.insets = new Insets(top, left, bottom, right);
        FrameViewClient.panelClient.add(component, gridBagConstraints);
    }

    public static JFrame getFrame(int a, int b, boolean resizable) {
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