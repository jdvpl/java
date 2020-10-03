
package mensajes;
import javax.swing.*;
public class Mensajes {

    public static void main(String[] args) {
        // TODO code application logic here
        //mensaje simple
        JOptionPane.showMessageDialog(null, "este es un mensaje de bienvenida");
        //cambiando iconos
        JOptionPane.showMessageDialog(null, "este es un mensaje de ADVERTENCIA",
                "adventencia",JOptionPane.WARNING_MESSAGE);
        //MENSAJE DE ERROR
        JOptionPane.showMessageDialog(null, "este es un mensaje de ERROR",
                "adventencia",JOptionPane.ERROR_MESSAGE);
        //MENSAJE DE PREGUNTA
        JOptionPane.showMessageDialog(null, "este es un mensaje de PREGUNTA",
                "adventencia",JOptionPane.QUESTION_MESSAGE);
        //mendaje de error
        JOptionPane.showConfirmDialog(null, "TE GUSTO MI PAGINA",
                "adventencia",JOptionPane.OK_CANCEL_OPTION);
        //mensaje de numero
       int num=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero para multiplicar por dos"));
       //mensaje de imoresion de la multiplicacion
       JOptionPane.showMessageDialog(null,"el resultado es:" +(num*2));
       //mensaje con letras
       String name=JOptionPane.showInputDialog("Digite su nombre");
       //imprime el nombre
       JOptionPane.showMessageDialog(null,"hola "+name);
       //lista
       Object ciudad= JOptionPane.showInputDialog(null,"seleccione una ciudad",
               "ciudad",JOptionPane.QUESTION_MESSAGE,null,
               new Object[]{"seleccione","la jagua","Garzón","neiva","cali","new york"},"");
       
       JOptionPane.showMessageDialog(null,"su ciudad es: "+ciudad);
        
    }
    
}
