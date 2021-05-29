//realizar un programa que simule el inicio de sesion en un programa, solicitando el nombre del usuario la contraseña, con el fin de comparan
//y mostrar un mensaje que diga "inicio de sesion correcto" o de lo contrario diga: "nombre de usuario o contraseña incorrecto"
package javaapplication14;
import javax.swing.*;
public class sesion {
    public static void main(String[] args) {
        String nom=JOptionPane.showInputDialog("digite el nombre de usuario");
        String con=JOptionPane.showInputDialog("digite la contraseña");
        if ((nom.equals("juanda5542"))&&(con.equals("12345"))) {
            JOptionPane.showMessageDialog(null, "has ingresado");
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de usuario  o contraseña equivocada");
        }
    }
    
}
