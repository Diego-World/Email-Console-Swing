package br.diegogouveia.View;

import javax.swing.*;
import java.awt.*;

public class SubjectRecipientDisplay extends JPanel {

    private final Color PRETO = new Color(20,20,20);
    private final Color WHITE = new Color(247,247,247);

    public SubjectRecipientDisplay(){
        setBackground(PRETO);

        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(adicionarLabel("Destinatário: ", WHITE), gbc);

        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(adicionarCampoTexto(), gbc);
        gbc.weightx = 0;

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        add(adicionarLabel("Assunto: ", WHITE), gbc);

        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        add(adicionarCampoTexto(), gbc);
        gbc.weightx = 0;

    }

    private Component adicionarLabel(String texto, Color color) {
        JLabel label = new JLabel();
        label.setText(texto);
        label.setForeground(color);
        return label;
    }

    private Component adicionarCampoTexto() {
        JTextField jTextField = new JTextField();
        return jTextField;
    }
}
