
package arreglos;
import javax.swing.*;
public class arreglo4 {
    public static void main(String[] args) {  
       int  valor = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));
        String[] frutas=new String[valor];
        for (int i = 0; i < valor; i++) {
            frutas[i]=JOptionPane.showInputDialog(null,"digite la fruta N° "+(i+1));
                    
            
        }//imprimiendo los valores
        System.out.println("los caracteres del arreglo son:");
        for (int i = 0; i < frutas.length; i++) {
            //System.out.println("en la posicion "+i+" es: "+frutas[i]);
            JOptionPane.showMessageDialog(null, frutas[i]);
            
            
        }
    }
}
