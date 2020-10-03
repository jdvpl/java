package bucle;
import javax.swing.*;
public class while2 {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese hasta que numero multiplicar"));
        int l=1;
        while (l<=x) {
            JOptionPane.showMessageDialog(null,num+" x "+l+" = "+num*l);
            l++;
        }
    }
}
