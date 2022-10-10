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
public class Diagnostico {
    private String id;
    private String diagnostico;
    private Vehiculo refVehiculo;
    private Tecnico refTecnico;
    public Diagnostico(String id, String diagnostico) {
        this.id = id;
        this.diagnostico = diagnostico;
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
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @return the refVehiculo
     */
    public Vehiculo getRefVehiculo() {
        return refVehiculo;
    }

    /**
     * @param refVehiculo the refVehiculo to set
     */
    public void setRefVehiculo(Vehiculo refVehiculo) {
        this.refVehiculo = refVehiculo;
    }

    /**
     * @return the refTecnico
     */
    public Tecnico getRefTecnico() {
        return refTecnico;
    }

    /**
     * @param refTecnico the refTecnico to set
     */
    public void setRefTecnico(Tecnico refTecnico) {
        this.refTecnico = refTecnico;
    }
}
