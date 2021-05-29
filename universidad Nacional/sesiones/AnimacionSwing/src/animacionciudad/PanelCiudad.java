/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionciudad;

import ciudad.ParametrosDibujo;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Juan
 */
public class PanelCiudad extends JPanel{
    
    JTextArea jTextArea;
    
    public PanelCiudad(){
    
        jTextArea = new JTextArea(ParametrosDibujo.ALTO , ParametrosDibujo.ANCHO);
        
        // Creamos una instancia de la clase Font
        Font font = new Font("Monospaced", Font.BOLD, 10);    
        jTextArea.setFont(font);
        
        
        add(jTextArea);
    }

    public JTextArea getjTextArea() {
        return jTextArea;
    }

    public void setjTextArea(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }
    
    
}
