package br.diegogouveia.Model;

// Essa classe armazena os dados do destinatario e assunto...

public class EmailData {

    private static final EmailData instance = new EmailData();
    private String recipicent;
    private String subject;
    private String emailContent;

    private EmailData(){

    }

    public static EmailData getInstance(){
        return instance;
    }

    public String getRecipicent() {
        return recipicent;
    }

    public void setRecipicent(String recipicent) {
        this.recipicent = recipicent;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }
}
