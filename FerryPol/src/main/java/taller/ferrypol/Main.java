/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ferrypol;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        //Array de vehiclos creado a partir de la clase abstracta Vehicle
        ArrayList<Vehicle> vehiculos = new ArrayList<>();
        for(int i=1;i<=5;i++){
            //Se determina el tipo de vehiculo por input
            int type = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo del vehiculo "+i+":\n"
                    + "1. Carro\n2. Motocicleta\n3. Bicicleta\n4. Camión")); 
            boolean pasajeros = false;
            int numeroPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pasajeros del vehiculo "+i)); 
            if(numeroPasajeros>0){
                pasajeros = true;
            }
            String matricula = JOptionPane.showInputDialog("Ingrese la matricula del vehiculo "+i);
            String medio = JOptionPane.showInputDialog("Ingrese el medio de transporte del vehiculo "+i);
            
            //Switch para polimorfismo dinamico
             try{
                 switch(type){
                     case 1:
                         int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas del vehiculo "+i)); 
                         Vehicle car = new Car(numeroPasajeros, pasajeros,4,matricula,medio,numeroPuertas);
                         vehiculos.add(car);
                         break;
                    case 2:
                         int kilometraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje del vehiculo "+i)); 
                         Vehicle motorcycle = new Motorcycle(numeroPasajeros, pasajeros,2,matricula,medio,kilometraje);
                         vehiculos.add(motorcycle);
                         break;
                    case 3:
                         String nombreDueño = JOptionPane.showInputDialog("Ingrese el nombre del dueño del vehiculo "+i); 
                         Vehicle bike = new Bike(numeroPasajeros, pasajeros,2,matricula,medio,nombreDueño);
                         vehiculos.add(bike);
                         break; 
                    case 4:
                         int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del vehiculo "+i)); 
                         Vehicle truck = new Truck(numeroPasajeros, pasajeros,6,matricula,medio,altura);
                         vehiculos.add(truck);
                         break;      
                                             
                 }
                 //Impresion del arreglo
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
