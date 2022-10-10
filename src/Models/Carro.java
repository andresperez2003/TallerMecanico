/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Carro extends Vehiculo {
    private String id;
    private String transmision;

    public Carro(String placa, String modelo, int año, int avaluo, String id, String transmision) {
        super(placa, modelo, año, avaluo);
        this.id = id;
        this.transmision = transmision;
    }
   
  
    /**
     * @return the transmision
     */
    public String getTransmision() {
        return transmision;
    }

    /**
     * @param transmision the transmision to set
     */
    public void setTransmision(String transmision) {
        this.transmision = transmision;
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

}
