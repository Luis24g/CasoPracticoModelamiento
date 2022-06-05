/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.multiplemain;

/**
 *
 * @author LENOVO
 */
public class Main {
    
    public static void main(int i)
    {
 
        // Print statement for method 1
        System.out.println("Si se puede tener ");
    }
 
    
    public static void main(String s)
    {
 
        // Print statement for method 2
        System.out.println(s);
    }
    
    public static void main(boolean b)
    {
 
        // Print statement for method 3
        System.out.println("Siempre y cuando inicie desde el String[] args");
    }
    // Main method desde donde inicia la aplicación
    public static void main(String[] args)
    {
        String s = "Varios metodos main con sobrecarga";
        // llamando a los main methods
        main(1);
        main(s);
        main(true);
    }
}
