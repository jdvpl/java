package bucle;
import javax.swing.*;
public class Bucle {

    public static void main(String[] args) {
        int num= Integer.parseInt(JOptionPane.showInputDialog("Digite hasta que numero quiere el ciclo"));
        for (int i = 1; i < num; i++) {
            JOptionPane.showMessageDialog(null, i+" ","mensaje",JOptionPane.QUESTION_MESSAGE);
        }
    }
    
}
