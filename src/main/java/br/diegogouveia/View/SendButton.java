package br.diegogouveia.View;

import br.diegogouveia.Model.EmailData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// A ação principal é o clique no botão enviar!

// Quando o botão é clicado os campos JTextField serão acessados e o texto armazenados nas variáveis EmailData.

public class SendButton extends JButton implements ActionListener {
private SubjectRecipientDisplay subjectRecipientDisplay;
private WriteEmailDisplay writeEmailDisplay;
    public SendButton(SubjectRecipientDisplay subjectRecipientDisplay, WriteEmailDisplay writeEmailDisplay) {
        this.subjectRecipientDisplay = subjectRecipientDisplay;
        this.writeEmailDisplay = writeEmailDisplay;
        setVisible(true);
        setText("Enviar");
        addActionListener(this::actionPerformed);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        EmailData emailData = EmailData.getInstance();
        emailData.setRecipicent(subjectRecipientDisplay.getRecipientField());
        emailData.setEmailContent(writeEmailDisplay.getEmailContent());
        emailData.setSubject(subjectRecipientDisplay.getSubjectField());
    }
}