/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.sort;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        
        Random rd = new Random(); // creating Random object
        int[] arr = new int[10];
        System.out.println("Array aleatorio");
        for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(); // storing random integers in an array
         System.out.println(arr[i]); // printing each array element
        }
        
        /**
         * Se elige entre cual tipo de sort se quiere usar
         */
        try{
            int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite tipo de ordenamiento:\n"
                + "1. Quick Sort\n2. Bubble Sort"));  
            switch(tipo){
                case 1:
                    Quick quickSort = new Quick(arr,0,arr.length-1);
                    arr = quickSort.getArr();
                    System.out.println("Array Ordenado");
                    for(int x:arr){
                        System.out.println(x);
                    }                    
                    break;
                    
                case 2:
                    Buble bubble = new Buble(arr);
                    arr= bubble.getArr();
                    System.out.println("Array Ordenado");
                    for(int x:arr){
                        System.out.println(x);
                    }  
                    break;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
