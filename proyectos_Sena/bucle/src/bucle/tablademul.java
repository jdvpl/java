
package bucle;
import java.util.*;
import javax.swing.*;
public class tablademul {
    public static void main(String[] args) {
        int ta=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));     
        int ti=Integer.parseInt(JOptionPane.showInputDialog("Digite hasta que numero"));
        for (int i = 1; i <=ti; i++) {
            JOptionPane.showMessageDialog(null,ta+" x "+i+" = "+(ta*i));
            System.out.println(ta+" x "+i+" = "+(ta*i));
            
        }
    }
}
