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
public class Tecnico extends Persona {
    private String especializacion;
    private int experiencia;
    private LinkedList<Cubiculo> misCubiculos;
    private LinkedList<Diagnostico> misDiagnosticos;

    public Tecnico(String cedula, String nombre, String telefono, String especializacion, int experiencia) {
        super(cedula, nombre, telefono);
        this.especializacion = especializacion;
        this.experiencia = experiencia;
        this.misCubiculos= new LinkedList<>();
        this.misDiagnosticos = new LinkedList<>();
    }
    
   

    
    /**
     * @return the especializacion
     */
    public String getEspecializacion() {
        return especializacion;
    }

    /**
     * @param especializacion the especializacion to set
     */
    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    /**
     * @return the experiencia
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * @param experiencia the experiencia to set
     */
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * @return the misCubiculos
     */
    public LinkedList<Cubiculo> getMisCubiculos() {
        return misCubiculos;
    }

    /**
     * @param misCubiculos the misCubiculos to set
     */
    public void setMisCubiculos(LinkedList<Cubiculo> misCubiculos) {
        this.misCubiculos = misCubiculos;
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
}
