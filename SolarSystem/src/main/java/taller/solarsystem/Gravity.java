/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.solarsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Gravity {
    //bigG es una constante para calcular la fuerza gravitatoria
    private static final double bigG = (6.673) * (Math.pow(10, -11));
    
    public static void calculate(Planet planet1, Planet planet2){
        
        double separation= planet1.getSunDistance()-planet2.getSunDistance();
        if(separation<0){
            separation*=-1;
        }
        double result = (bigG*planet1.getMass()*planet2.getMass())/separation;
        JOptionPane.showMessageDialog(null,"La fuerza de atracción gravitatoria entre el planeta "+planet1.getName()
        +" y el planeta "+planet2.getName()+" es: \n"+result+"n");
    }
}
