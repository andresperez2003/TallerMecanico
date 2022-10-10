/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author User
 */
public class Motor {
    private String id;
    private double peso;
    private int numCaballosFuerza;

    public Motor(String id, double peso, int numCaballosFuerza) {
        this.id = id;
        this.peso = peso;
        this.numCaballosFuerza = numCaballosFuerza;
    }

    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the numCaballosFuerza
     */
    public int getNumCaballosFuerza() {
        return numCaballosFuerza;
    }

    /**
     * @param numCaballosFuerza the numCaballosFuerza to set
     */
    public void setNumCaballosFuerza(int numCaballosFuerza) {
        this.numCaballosFuerza = numCaballosFuerza;
    }
}
