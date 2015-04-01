package server.frame;

import server.function.Functions;

import javax.swing.*;
import java.awt.*;

public class FrameAuthorization
{
    public FrameAuthorization()
    {
        JPanel panelAuthor = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel serverLabel = new JLabel("Сервер:");
        Functions.GridBagConstrainCustom(gbc, 0, 0, 1, 2, 2, 2, 2, serverLabel, panelAuthor);
        JTextField serverField = new JTextField(15);
        Functions.GridBagConstrainCustom(gbc, 1, 0, 2, 2, 2, 2, 2, serverField, panelAuthor);

        JLabel loginLabel = new JLabel("Пользователь:");
        Functions.GridBagConstrainCustom(gbc, 0, 1, 1, 2, 2, 2, 2, loginLabel, panelAuthor);
        JTextField loginField = new JTextField(15);
        Functions.GridBagConstrainCustom(gbc, 1, 1, 2, 2, 2, 2, 2, loginField, panelAuthor);

        JLabel passwordLabel = new JLabel("Пароль:");
        Functions.GridBagConstrainCustom(gbc, 0, 2, 1, 2, 2, 2, 2, passwordLabel, panelAuthor);
        JPasswordField passwordField = new JPasswordField(15);
        Functions.GridBagConstrainCustom(gbc, 1, 2, 1, 2, 2, 2, 2, passwordField, panelAuthor);

        JButton inButton = new JButton("Вход");
        Functions.GridBagConstrainCustom(gbc, 0, 3, 2, 2, 100, 2, 2, inButton, panelAuthor);

        JFrame frameAuthor = new JFrame();
        Functions.createFrame(frameAuthor, panelAuthor, false);

        inButton.addActionListener(e -> System.out.println("OK!"));
    }
}