/*

ANA DIAZ con edad 19, es estudiante de UTPL

luis vera con edad 19, es estudiante de UNL

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("ingrese su nombre");
        String nombre = entrada.nextLine();
        
        System.out.println("ingrese su apellido");
        String apellido = entrada.nextLine();
        
        System.out.println("ingrese su edad");
        String edad = entrada.nextLine();
        
        System.out.println("ingrese su universidad");
        String universidad = entrada.nextLine();
        
        nombre = nombre.toLowerCase();
        String nombre1 = nombre.substring(0);
        
        char valor = nombre1.charAt(0); // obtener el primer caracter de una
        // ANA DIAZ con edad 19, es estudiante de UTPL

        // luis vera con edad 19, es estudiante de UNL
           
        switch(valor){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("%s %s con edad %s, es estudiante de %s", 
                        nombre.toUpperCase(),apellido.toUpperCase(),
                        edad,universidad.toUpperCase());
                break;
            
            default:
                
                    System.out.printf("%s %s con edad %s, es estudiante de %s", 
                        nombre.toLowerCase(),apellido.toLowerCase(),
                        edad,universidad.toUpperCase());
                break;
                
                
        }
        
    }
}
