package br.diegogouveia.View;

import javax.swing.*;
import java.awt.*;

public class WriteEmailDisplay extends JTextArea{

    public WriteEmailDisplay(){
        setBackground(new Color(46,49,50));
        setFont(new Font("Arial",Font.PLAIN,12));
        setForeground(Color.WHITE);
    }

    public String getEmailContent() {
        return WriteEmailDisplay.this.getText();
    }
}
