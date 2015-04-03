package server.frame;

import server.function.Functions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameAuthorization
{
    public FrameAuthorization()
    {
        JPanel panelAuthor = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel serverLabel = new JLabel("Сервер:");
        Functions.GridBagConstrainCustom(gbc, 0, 0, 1, 1, 0.0, 0.0, 17, 0, 6, 4, 3, 4, 0, 0, serverLabel, panelAuthor);
        JTextField serverField = new JTextField(15);
        Functions.GridBagConstrainCustom(gbc, 1, 0, 2, 1, 0.0, 0.0, 17, 0, 6, 4, 3, 6, 0, 0, serverField, panelAuthor);

        JLabel loginLabel = new JLabel("Пользователь:");
        Functions.GridBagConstrainCustom(gbc, 0, 1, 1, 1, 0.0, 0.0, 17, 0, 2, 4, 2, 4, 0, 0, loginLabel, panelAuthor);
        JTextField loginField = new JTextField(15);
        Functions.GridBagConstrainCustom(gbc, 1, 1, 2, 1, 0.0, 0.0, 17, 0, 2, 4, 2, 6, 0, 0, loginField, panelAuthor);

        JLabel passwordLabel = new JLabel("Пароль:");
        Functions.GridBagConstrainCustom(gbc, 0, 2, 1, 1, 0.0, 0.0, 17, 0, 2, 4, 2, 4, 0, 0, passwordLabel, panelAuthor);
        JPasswordField passwordField = new JPasswordField(15);
        Functions.GridBagConstrainCustom(gbc, 1, 2, 1, 1, 0.0, 0.0, 17, 0, 2, 4, 2, 6, 0, 0, passwordField, panelAuthor);

        JButton inButton = new JButton("ОК");
        Functions.GridBagConstrainCustom(gbc, 0, 3, 2, 1, 0.0, 0.0, 17, 0, 6, 110, 6, 2, 0, 0, inButton, panelAuthor);
        JButton outButton = new JButton("Отмена");
        Functions.GridBagConstrainCustom(gbc, 0, 3, 2, 1, 0.0, 0.0, 13, 0, 6, 2, 6, 15, 0, 0, outButton, panelAuthor);

        JFrame frameAuthor = new JFrame();
        Functions.createFrame(frameAuthor, panelAuthor, true);

        inButton.addActionListener(e -> System.out.println("ОК"));
        outButton.addActionListener(e -> System.exit(0));
    }
}