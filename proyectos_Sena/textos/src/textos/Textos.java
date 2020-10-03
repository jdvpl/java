package textos;

public class Textos {

    public static void main(String[] args) {
        // TODO code application logi
        String mi_nombre="juan daniel suarez" ;
        System.out.println("mi nombre es: "+mi_nombre);
        int ultima=mi_nombre.length();
        //cuenta las letras
        System.out.println("mi nombre tiene : "+mi_nombre.length()+" letras");
        System.out.println("letra final de mi nombre " +mi_nombre.charAt(ultima -1));
        
        String frase= "que hay de nuevo viejo";
        String resumen=frase.substring(0,7);
        System.out.println("los siete primeros caracteres  de la frase son: "+resumen);
        System.out.println("las ultimas dos palabras de la frase son " + frase.substring(11,22));
        
        //comparar cadenas de texto
       String nombre1="sena", nombre2="sena";
        System.out.println("los nombres son iguales " +nombre1.equals(nombre2));
            
        
        
    
        
    }
    
}
