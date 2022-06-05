/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.vector;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        //Se crea el vector
        Vector<Integer> v = new Vector<>();
        
        //Variables de control para el ciclo
        Scanner scanner = new Scanner(System.in);
        int num = 0;        
        int prev = 0;
        boolean flag = true; 
        
        /**
         * Ciclo que determina cuando el usuario ingresa dos numeros iguales
         * de forma consecutiva.
         */
        while(flag){
            
            System.out.println("Ingrese un numero");
            try{
                num = scanner.nextInt();
                if(prev==num){
                    flag=false;
                }
                v.add(num);
                
                prev = v.lastElement();
                
                
            }catch(Exception e){
                System.out.println("No ingreso un numero");
            }
        }
        
        for(int x:v){
            System.out.print(x+",");        
        }
    }
}
