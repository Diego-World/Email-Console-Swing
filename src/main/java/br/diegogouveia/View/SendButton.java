package br.diegogouveia.View;

import br.diegogouveia.Model.EmailData;
import br.diegogouveia.Service.SendEmailService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        if(SendEmailService.sendEmail(emailData.getRecipicent(),
                emailData.getSubject(), emailData.getEmailContent())){
            JOptionPane.showMessageDialog(writeEmailDisplay,"O e-mail foi enviado");
            writeEmailDisplay.setText("");
        }else{
            JOptionPane.showMessageDialog(writeEmailDisplay,"O e-mail não foi enviado");
        }
    }
}