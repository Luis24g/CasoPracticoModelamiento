/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ferry;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        //Array del objeto Vehicle
        ArrayList<Vehicle> vehiculos = new ArrayList<>();
        for(int i=1;i<=10;i++){
            //Captura de datos
            boolean pasajeros = false;
            int numeroPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pasajeros del vehiculo "+i)); 
            if(numeroPasajeros>0){
                pasajeros = true;
            }
            int ruedas =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ruedas del vehiculo "+i));
            String matricula = JOptionPane.showInputDialog("Ingrese la matricula del vehiculo "+i);
            String medio = JOptionPane.showInputDialog("Ingrese el medio de transporte del vehiculo "+i);
            
             try{
                 //Anexación al Array
                 Vehicle vehiculo = new Vehicle(numeroPasajeros,pasajeros,ruedas,matricula,medio);
                 vehiculos.add(vehiculo);
                 //Impresion del Array
                 for(Vehicle v:vehiculos){
                     System.out.println(v);
                     v.empty();
                    }  
                }catch(Exception e){
                     System.out.println("Error al crear el objeto planeta");
                 }    
        }
    }
    
}
