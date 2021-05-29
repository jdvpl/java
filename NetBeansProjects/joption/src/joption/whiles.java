package joption;
import javax.swing.*;
public class whiles {
    public static void main(String[] args) {
         int n =Integer.parseInt(JOptionPane.showInputDialog("por favor digite desde que numero"));
         int s =Integer.parseInt(JOptionPane.showInputDialog("hasta que numero quiere"));
     while(n<=s){    
         JOptionPane.showMessageDialog(null,s+" x "+n+" = "+n*s);
         System.out.println(n);
         n++;
     }
    }
    
    
    
    
    
    
    
}
