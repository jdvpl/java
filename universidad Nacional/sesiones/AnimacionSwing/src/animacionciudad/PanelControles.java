/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionciudad;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Juan
 */
public class PanelControles extends JPanel {
    
    JButton jButton;
    JLabel jLabelFurgon;
    JTextField jTextField;
    JLabel jLabelDormir;
    JSpinner jSpinner;
    JCheckBox jCheckBox;
    JRadioButton jRadioButton;
    
    
    public PanelControles(){
        setLayout(new GridLayout(10,1));
        
        jButton = new JButton("Iniciar animación");
        add(jButton);
        
        jLabelFurgon = new JLabel("Carga del Furgon:");
        add(jLabelFurgon);
        
        jTextField = new JTextField("UNAL");
        add(jTextField);
        
        jLabelDormir = new JLabel("Lapso de dormir:");
        add(jLabelDormir);
        
        jSpinner = new JSpinner();
        jSpinner.setValue(50);
        add(jSpinner);
        
        jCheckBox = new JCheckBox("Carga");
        jCheckBox.setSelected(true);
        add(jCheckBox);
        
        jRadioButton = new JRadioButton("Adelante");
        jRadioButton.setSelected(true);
        add(jRadioButton);
        
        
        
    }
    
}
