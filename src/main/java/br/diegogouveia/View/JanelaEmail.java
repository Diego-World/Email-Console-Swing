package br.diegogouveia.View;

import javax.swing.*;
import java.awt.*;

public class JanelaEmail extends JFrame {

    public JanelaEmail(){
        organizarLayout();

        setVisible(true);
        setSize(400,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Envie Emails");
        setLocationRelativeTo(null);
    }

    private void organizarLayout(){
        setLayout(new BorderLayout());

        WriteEmailDisplay writeEmailDisplay = new WriteEmailDisplay();
        writeEmailDisplay.setPreferredSize(new Dimension(400,200));


        SubjectRecipientDisplay subjectRecipientDisplay = new SubjectRecipientDisplay();
        subjectRecipientDisplay.setPreferredSize(new Dimension(400,111));

        SendButton sendButton = new SendButton();


        add(sendButton, BorderLayout.SOUTH);
        add(subjectRecipientDisplay,BorderLayout.NORTH);
        add(writeEmailDisplay,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new JanelaEmail();
    }
}
