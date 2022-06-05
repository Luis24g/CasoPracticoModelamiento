/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ferry;

/**
 *
 * @author LENOVO
 */
public class Vehicle {
    /**
     * Se declaran los atributos de la clase Vehicle
     */
    private int numeroPasajeros;
    private boolean pasajeros;
    private int ruedas;
    private String fecha;
    private String medio;
    
    /**
     * 
     * @param numeroPasajeros
     * @param pasajeros
     * @param ruedas
     * @param fecha
     * @param medio 
     */
    public Vehicle(int numeroPasajeros, boolean pasajeros, int ruedas, String fecha, String medio) {
        this.numeroPasajeros = numeroPasajeros;
        this.pasajeros = pasajeros;
        this.ruedas = ruedas;
        this.fecha = fecha;
        this.medio = medio;
    }
    
    
   public void empty(){
       if(isPasajeros()){
           System.out.println("El vehiculo esta ocupado");
       }else{
           System.out.println("El vehiculo no esta ocupado");
       }
   }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public boolean isPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(boolean pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "numeroPasajeros=" + numeroPasajeros + ", pasajeros=" + pasajeros + ", ruedas=" + ruedas + ", fecha=" + fecha + ", medio=" + medio + '}';
    }

   
    
    
    
}
