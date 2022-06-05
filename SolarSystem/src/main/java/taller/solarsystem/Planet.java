/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.solarsystem;

/**
 *
 * @author LENOVO
 */
public class Planet {
    
    private int ID;
    private String name;
    private double density;
    private double mass;
    private double diameter;
    private double sunDistance;

    public Planet(int ID, String name, double mass, double density, double diameter, double sunDistance) {
        this.ID = ID;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.sunDistance = sunDistance;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getDensity() {
        return density;
    }

    public double getMass() {
        return mass;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getSunDistance() {
        return sunDistance;
    }
    
    
    @Override
    public String toString() {
        return "Planet{" + "ID=" + ID + ", name=" + name + ", density=" + density + ", mass=" + mass + ", diameter=" + diameter + ", sunDistance=" + sunDistance + '}';
    }
    
    
}
