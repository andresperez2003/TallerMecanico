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
public class Cliente extends Persona {
    private int añosFidelidad;
    private LinkedList<Vehiculo> misVehiculos;
    public Cliente(String cedula, String nombre, String telefono,int añosFidelidad) {
        super(cedula, nombre, telefono);
        this.añosFidelidad = añosFidelidad;
        this.misVehiculos= new LinkedList<>();
    }

    
    /**
     * @return the añosFidelidad
     */
    public int getAñosFidelidad() {
        return añosFidelidad;
    }

    /**
     * @param añosFidelidad the añosFidelidad to set
     */
    public void setAñosFidelidad(int añosFidelidad) {
        this.añosFidelidad = añosFidelidad;
    }

    /**
     * @return the misVehiculos
     */
    public LinkedList<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }

    /**
     * @param misVehiculos the misVehiculos to set
     */
    public void setMisVehiculos(LinkedList<Vehiculo> misVehiculos) {
        this.misVehiculos = misVehiculos;
    }
}
