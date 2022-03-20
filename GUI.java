package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    static OptionMenu optionMenu;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordField;
    private static JButton button;
    private static JLabel success;

        public static void main(String[] args) {

            JPanel panel = new JPanel();
            JFrame  frame = new JFrame();
            frame.setSize(350,200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.add(panel);

            panel.setLayout(null);

            userLabel = new JLabel("User");
            userLabel.setBounds(10,20,80,25);
            panel.add(userLabel);

            userText = new JTextField();
            userText.setBounds(100,20,165,25);
            panel.add(userText);

            passwordLabel = new JLabel("Password");
            passwordLabel.setBounds(10,50,80,25);
            panel.add(passwordLabel);

            passwordField = new JPasswordField();
            passwordField.setBounds(100,50,165,25);
            panel.add(passwordField);

            button = new JButton("Login");
            button.setBounds(140,80,80,25);
            button.addActionListener((ActionListener) new GUI());
            panel.add(button);

            success = new JLabel("");
            success.setBounds(140,110,300,25);
            panel.add(success);


            frame.setVisible(true);

        }

    public GUI() {
        super();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String user = userText.getText();
        String password = passwordField.getText();


        if(user.equals("99662255") && password.equals("Espionage123")) {
            success.setText("Login Successful");



        }
    }
}
