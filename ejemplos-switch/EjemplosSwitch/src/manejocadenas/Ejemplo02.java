/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    
    public static void main(String[] args) {
        String pais;
        
        pais = "Ecuador";
        //      0123456
        char letra = pais.charAt(7);
        System.out.printf("%s\n", letra);
        // entonces .charAt es para extraer un caracter en funcion del indice
        // se cuenta desde 0
    }
}
