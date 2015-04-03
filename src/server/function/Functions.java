package server.function;

import javax.swing.*;
import java.awt.*;

public class Functions
{
    public static void GridBagConstrainCustom(GridBagConstraints gbc, int gridx, int gridy, int gridwidth,
                                              int gridheight, double weightx, double weighty, int anchor, int fill,
                                              int top, int left, int bottom, int right, int ipadx, int ipady,
                                              Component component, JPanel panel)
    {
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridwidth;
        gbc.gridheight = gridheight;
        gbc.weightx = weightx;
        gbc.weighty = weighty;
        gbc.anchor = anchor;
        gbc.fill = fill;
        gbc.insets = new Insets(top, left, bottom, right);
        gbc.ipadx = ipadx;
        gbc.ipady = ipady;
        panel.add(component, gbc);
    }

    public static void createFrame(JFrame frame, JPanel panel, boolean resizable)
    {
        frame.setTitle(getAppName());
        frame.add(panel);
        frame.setResizable(resizable);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static String getAppName()
    {
        return "Lead Time";
    }
}