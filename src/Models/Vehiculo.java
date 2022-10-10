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
public abstract class Vehiculo {
    private String placa;
    private String modelo;
    private int año;
    private int avaluo;
    private LinkedList<Diagnostico> misDiagnosticos; 
    private Cliente miCliente;
    private Motor miMotor;
    public Vehiculo(String placa, String modelo, int año, int avaluo) {
        this.placa = placa;
        this.modelo = modelo;
        this.año = año;
        this.avaluo = avaluo;
        this.misDiagnosticos = new LinkedList<>();
    }

    
    public void crearMotor(String id, double peso, int numCaballosFuerza){
    this.miMotor = new Motor(id, peso, numCaballosFuerza);
    }
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the avaluo
     */
    public int getAvaluo() {
        return avaluo;
    }

    /**
     * @param avaluo the avaluo to set
     */
    public void setAvaluo(int avaluo) {
        this.avaluo = avaluo;
    }

    /**
     * @return the misDiagnosticos
     */
    public LinkedList<Diagnostico> getMisDiagnosticos() {
        return misDiagnosticos;
    }

    /**
     * @param misDiagnosticos the misDiagnosticos to set
     */
    public void setMisDiagnosticos(LinkedList<Diagnostico> misDiagnosticos) {
        this.misDiagnosticos = misDiagnosticos;
    }

    /**
     * @return the miCliente
     */
    public Cliente getMiCliente() {
        return miCliente;
    }

    /**
     * @param miCliente the miCliente to set
     */
    public void setMiCliente(Cliente miCliente) {
        this.miCliente = miCliente;
    }

    /**
     * @return the miMotor
     */
    public Motor getMiMotor() {
        return miMotor;
    }

    /**
     * @param miMotor the miMotor to set
     */
    public void setMiMotor(Motor miMotor) {
        this.miMotor = miMotor;
    }
}
