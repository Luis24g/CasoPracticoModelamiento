/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ferrypol;

/**
 *
 * @author LENOVO
 */
public class Motorcycle extends Vehicle {
    int kilometraje;
    public Motorcycle(int numeroPasajeros, boolean pasajeros, int ruedas, String fecha, String medio, int kilometraje) {
        super(numeroPasajeros, pasajeros, ruedas, fecha, medio);
        this.kilometraje = kilometraje;
    }

    @Override
    public void empty() {
        if(isPasajeros()){
           System.out.println("El vehiculo esta ocupado");
       }else{
           System.out.println("El vehiculo no esta ocupado");
       }
    }

    @Override
    public String toString() {
        return "Vehicle{" + "numeroPasajeros=" +this.getNumeroPasajeros()+ ", pasajeros=" 
                + ", ruedas=" + this.getRuedas() + ", fecha=" + this.getFecha() + ", medio=" + this.getMedio()+ ", kilometraje="+this.kilometraje+"km"+ '}'; 
    }
    
    
}
