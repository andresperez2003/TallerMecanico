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
public class Taller {
    private String id;
    private String direccion;
    private LinkedList<Tecnico> misTecnicos;
    private LinkedList<Cubiculo> misCubiculos;
    private LinkedList<Cliente> misClientes;
    public Taller(String id, String direccion) {
        this.id = id;
        this.direccion = direccion;
        this.misCubiculos= new LinkedList<>();
        this.misTecnicos = new LinkedList<>();
        this.misClientes= new LinkedList<>();
    }
    
    //Crear un nuevo Tecnico (Composicion Fuerte)
    public void crearTecnico(String cedula, String nombre, String telefono, String especializacion, int experiencia){
    Tecnico nuevoTecnico= new Tecnico(cedula, nombre, telefono, especializacion, experiencia);
    this.getMisTecnicos().add(nuevoTecnico);
    }
    
    //Crear un nuevo Cubiculo (Composicion Fuerte)
    public void crearCubiculo(String id){
    Cubiculo nuevoCubiculo = new Cubiculo(id);
    this.getMisCubiculos().add(nuevoCubiculo);
    }
    
    public String cubiculoMasPatasMotos(){
        String cubiculoMayor="";     
        int mayor= Integer.MIN_VALUE;
        for (Cubiculo cubiculoActual: this.getMisCubiculos()) {   
            int suma=0;
            for (Vehiculo vehiculoActual: cubiculoActual.getMisVehiculos()) {
                if (vehiculoActual instanceof Moto) {
                     suma+=((Moto) vehiculoActual).getNumPatas();   
                }
            }
            
            if (suma>mayor) {
                mayor=suma;
                
                cubiculoMayor= cubiculoActual.getId();
            }
        }
        return cubiculoMayor;
    }
    //Forma dificil Punto III
    public Cliente clienteMasMotos(){
    Cliente cliente = null;
    int numMotos=0;
    int mayor= Integer.MIN_VALUE;
        for (Cubiculo cubiculoActual: this.getMisCubiculos()) { 
            for (Vehiculo vehiculoActual: cubiculoActual.getMisVehiculos()) {
                numMotos=0;
                for (Vehiculo VehiculoclienteActual: vehiculoActual.getMiCliente().getMisVehiculos()) {
                    if (VehiculoclienteActual instanceof Moto) {
                        numMotos+=1;
                    }
                }
                if (numMotos>mayor) {
                    mayor=numMotos;
                    cliente = vehiculoActual.getMiCliente();
                }
            }
        }
    
    return cliente;
    }
    
    //Forma facil Punto III
    public Cliente clienteMasMotosFacil(){
    Cliente cliente = null;
    int numMotos=0;
    int mayor= Integer.MIN_VALUE;
        for (Cliente clienteActual: this.misClientes) {
            numMotos=0;
            for (Vehiculo vehiculoActual: clienteActual.getMisVehiculos()) {
                if (vehiculoActual instanceof Moto) {
                    numMotos+=1;
                }
            }
            if (numMotos>mayor) {
                mayor= numMotos;
                cliente= clienteActual;
            }
        }
    return cliente;
    }
    
    
    
    public int promedioAñosExperiencia(){
    int promedio=0;
    int suma=0;
        for (Tecnico tecnicoActual: this.misTecnicos) {
            suma+=tecnicoActual.getExperiencia();
        }
    promedio=suma/this.getMisTecnicos().size();   
    return promedio;
    }
    
    //Forma Dificil
    public LinkedList<Carro> carrosClienteMasFiel(){
    
    LinkedList<Carro> carrosCliente = new LinkedList<>();
    int mayor = Integer.MIN_VALUE;
    String cedula="";
        for (Cubiculo cubiculoActual: this.getMisCubiculos()) {
            for (Vehiculo vehiculoActual: cubiculoActual.getMisVehiculos()) {  
               if (vehiculoActual.getMiCliente().getAñosFidelidad()>mayor) {  
                   mayor=vehiculoActual.getMiCliente().getAñosFidelidad();
                   cedula=vehiculoActual.getMiCliente().getCedula();
                       }                
                   }
            for (Vehiculo vehiculoActual: cubiculoActual.getMisVehiculos()) {  
                if (vehiculoActual.getMiCliente().getCedula()==cedula) {
                    if (vehiculoActual instanceof Carro) {
                            carrosCliente.add(((Carro)vehiculoActual));
                }
                }
            }
        }
    return carrosCliente;
    }
    
   public LinkedList<Carro> carrosClienteMasFielFacil(){
    
    LinkedList<Carro> carrosCliente = new LinkedList<>();
    int mayor = Integer.MIN_VALUE;
       for (Cliente clienteActual: this.getMisClientes()) {
           if (clienteActual.getAñosFidelidad()>mayor) {
               mayor=clienteActual.getAñosFidelidad();
               for (Vehiculo vehiculoActual: clienteActual.getMisVehiculos()) {
                   if (vehiculoActual instanceof Carro) {
                       carrosCliente.add(((Carro)vehiculoActual));
                   }
               }
           }
       }
    return carrosCliente;
   }
   
   public void carrosCubiculos(){
   
       for (Cubiculo cubiculoActual: this.misCubiculos) {
           System.out.println("Id cubiculo "+ cubiculoActual.getId());
           System.out.println("Numero carros "+cubiculoActual.cantidadCarros()+"\n");
           
       }
   
    
   
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the misTecnicos
     */
    public LinkedList<Tecnico> getMisTecnicos() {
        return misTecnicos;
    }

    /**
     * @param misTecnicos the misTecnicos to set
     */
    public void setMisTecnicos(LinkedList<Tecnico> misTecnicos) {
        this.misTecnicos = misTecnicos;
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
     * @return the misClientes
     */
    public LinkedList<Cliente> getMisClientes() {
        return misClientes;
    }

    /**
     * @param misClientes the misClientes to set
     */
    public void setMisClientes(LinkedList<Cliente> misClientes) {
        this.misClientes = misClientes;
    }
}
