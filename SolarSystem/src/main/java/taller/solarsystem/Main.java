/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.solarsystem;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        
        int numberOfPlanets;
        int option=0;
        Scanner scanner= new Scanner(System.in);
        numberOfPlanets = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de planetas del sistema solar"));
        ArrayList<Planet> planets= new ArrayList<>();
        
           
           try{
             for(int i=1;i<=numberOfPlanets;i++){
                 //Captura de datos por numero de planetas en el sistema
                 int ID = i;
                 String name = JOptionPane.showInputDialog("Ingrese el nombre del planeta "+i); 
                 double mass = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la masa en toneladas del planeta "+i))*907;
                 double density = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la densidad en kg/m3 del planeta "+i));
                 double diameter = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el diametro en km del planeta "+i));
                 double sunDistance = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia del sol en km del planeta "+i));
                 
                 try{
                     Planet planet = new Planet(ID,name,mass,density,diameter,sunDistance);
                     planets.add(planet);
                     
                }catch(Exception e){
                     System.out.println("Error al crear el objeto planeta");
                 }
                }
             
              // Menú de Opciones
        System.out.println("********MENÚ*********");
        System.out.println("1. Imprimir sistema solar.\n2. Calcular fuerza de atracción entre dos planetas"
                + "\n3. Salir " );
        System.out.println("*************************");
        do{
            option=scanner.nextInt();
            switch(option){
                case 1:
                    for(Planet planet:planets){
                        System.out.println(planet);
                    }                        
                    System.out.println("**********MENÚ***********");
                    System.out.println("1. Imprimir sistema solar.\n2. Calcular fuerza de atracción entre dos planetas"
                + "\n3. Salir " );
                    System.out.println("*************************");
                    break;
                case 2:
                    System.out.println("********Seleccionar Planeta 1*********");
                    for(Planet planet:planets){
                        System.out.println(planet.getID()+" "+planet.getName());
                    }
                    int index1=scanner.nextInt()-1;
                    
                    System.out.println("********Seleccionar Planeta 2*********");
                    for(Planet planet:planets){
                        if(planet.getID()!=index1+1)
                        System.out.println(planet.getID()+" "+planet.getName());
                    }
                    int index2=scanner.nextInt()-1;
                    
                    Planet planet1 = planets.get(index1);
                    Planet planet2 = planets.get(index2);
                    //Se llama al metodo para calcular la fuerza de atracción.
                    Gravity.calculate(planets.get(index1),planets.get(index2));
                    
                    System.out.println("********MENÚ*********");
                    System.out.println("1. Imprimir sistema solar.\n2. Calcular fuerza de atracción entre dos planetas"
                    + "\n3. Salir " );
                    System.out.println("*************************");
                    break;    
                    
            }
        }while(option!=3);
        }catch (Exception e){
            System.out.println(e);
            }
        
        
        
        
        
       
        
       
    }
}
