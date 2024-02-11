package br.diegogouveia.Model;

public class EmailData {

    private static final EmailData instance = new EmailData();
    private String recipicent;
    private String subject;

    private EmailData(){

    }

    public static EmailData getInstance(){
        return instance;
    }

}
