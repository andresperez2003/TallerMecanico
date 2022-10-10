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
public class Cubiculo {
   private String id;
   private Kit miKit;
   private LinkedList<Vehiculo> misVehiculos;
    public Cubiculo(String id) {
        this.id = id;
        this.misVehiculos = new LinkedList<>();
    }
   public void crearKit(Kit elKit){
       this.miKit = elKit;
   }
   public int cantidadCarros(){
   int respuesta=0;
       for (Vehiculo vehiculoActual: this.misVehiculos) {
           if (vehiculoActual instanceof Carro) {
               respuesta+=1;
           }
       }
   return respuesta;
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
     * @return the miKit
     */
    public Kit getMiKit() {
        return miKit;
    }

    /**
     * @param miKit the miKit to set
     */
    public void setMiKit(Kit miKit) {
        this.miKit = miKit;
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
