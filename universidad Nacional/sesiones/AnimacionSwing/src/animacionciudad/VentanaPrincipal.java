/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionciudad;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;


/**
 *
 * @author Juan
 */

// 1. Crear un proyecto vacio
// 2. Crear un paquete llamado animacionciudad
// 3. Crear clase AnimacionCiudad (Agregamos un Main)
// 4. Crear clase VentanaPrincipal

public class VentanaPrincipal extends JFrame{
    
    public VentanaPrincipal(){
        // Constructor JFrame: Toma como parametro el título de la ventana
        super("Animación de una ciudad!");
        // Termina la ejecución del programa cuando se cierra la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Funcion Para inicializar componentes
        initComponents();
        //Establece el tamaño de la ventana        
        //setSize(500, 300);
        // Ajusta el tamaño de la ventana según los componentes
        pack();
        // Hace que la ventana sea visible
        setVisible(true);
                
    }
    
    private void initComponents(){
       
        //setBackground(Color.YELLOW);
        //getContentPane().setBackground(Color.RED);
        
        PanelCiudad panelCiudad = new PanelCiudad();
        setContentPane(panelCiudad);
        
        PanelControles panelControles = new PanelControles();
        add(panelControles);
        
        
        
    }
    
    
}
