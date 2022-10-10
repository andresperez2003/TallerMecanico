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
public class Moto extends Vehiculo {
    private String id;
    private int numPatas;

    public Moto(String placa, String modelo, int año, int avaluo, String id, int numPatas) {
        super(placa, modelo, año, avaluo);
        this.id = id;
        this.numPatas = numPatas;
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
     * @return the numPatas
     */
    public int getNumPatas() {
        return numPatas;
    }

    /**
     * @param numPatas the numPatas to set
     */
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
}
