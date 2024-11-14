/*
ingrese fecha de nacimiento 

dia: 7
mes: 2
ano: 1980

salida

usted ha nacido el 7 de FEBRERO de 1980
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int DiaNacimiento;
        int MesNacimiento;
        int YearNacimiento;
        
        System.out.println("Ingrese su dia de nacimiento");
         DiaNacimiento = entrada.nextInt();
        
        System.out.println("Ingrese su mes de nacimiento");
         MesNacimiento = entrada.nextInt();
 
        System.out.println("Ingrese su ano de nacimiento");
         YearNacimiento = entrada.nextInt();
        
        String MesCadena = "";
        
        switch (MesNacimiento){
            case 1:
                MesCadena = "ENERO";
                break;
            
            case 2:
                MesCadena = "FEBRERO";
                break;
            
            case 3:
                MesCadena = "MARZO";
                break;
                
            case 4:
                MesCadena = "ABRIL";
                break;
                
            case 5:
                MesCadena = "MAYO";
                break;
                
            case 6:
                MesCadena = "JUNIO";
                break;
                
            case 7:
                MesCadena = "JULIO";
                break;
               
            case 8:
                MesCadena = "AGOSTO";
                break;
                
            case 9:
                MesCadena = "SEPTIEMBRE";
                break;
                
            case 10:
                MesCadena = "OCTUBRE";
                break;
                
            case 11:
                MesCadena = "NOVIEMBRE";
                break;
                
            case 12:
                MesCadena = "DICIEMBRE";
                break;
            
        }
            System.out.printf("usted ha nacido el %d de %s de %d\n",
                     DiaNacimiento, MesCadena, YearNacimiento);
}
    }