package ejerciciosoperadores;
public class intercambioVariables {
    public static void main(String[] args) {
         
        int A=8, B=2, AUX;
        
        System.out.println("Valores iniciales: A = " + A + "   B = " + B);
        //instrucciones para hacer el intercambio
        //se utiliza una variable auxiliar
        AUX = A;
        A = B;
        B = AUX;      
        System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
    }
    
}
