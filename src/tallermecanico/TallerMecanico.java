/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermecanico;

import Models.Carro;
import Models.Cliente;
import Models.Cubiculo;
import Models.Kit;
import Models.Moto;
import Models.Taller;
import Models.Tecnico;

/**
 *
 * @author User
 */
public class TallerMecanico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear Taller
        Taller cacharro = new Taller("01", "Calle 49");
        
        //Crear tecnicos
        cacharro.crearTecnico("1025", "Andres", "313-490-2138 ", "Motos Ninja", 7);
        cacharro.crearTecnico("1026", "Juan", "313-490-2139 ", "Carros automaticos", 1);
        cacharro.crearTecnico("1027", "Camilo", "313-490-2140 ", "Carros semiautomaticos", 4);

        //Crear cubiculos
        cacharro.crearCubiculo("1");
        cacharro.crearCubiculo("2");
        
        //Crear Kit
        Kit kit1= new Kit("1", 5);
        Kit kit2= new Kit("2", 6);
        


        //Crear Cliente
        Cliente cliente1 = new Cliente("1024", "Luis", "31524", 32);
        Cliente cliente2 = new Cliente("1023", "Salome", "31526", 30);
        
        //Crear vehiculos
        Moto moto1 = new Moto("A1", "Kawasaki 2012", 2012, 500, "1", 2);
        moto1.crearMotor("1", 45.2, 12);
        
        Moto moto2 = new Moto("A2", "Yamaha 2020", 2020, 800, "2", 2);
        moto2.crearMotor("2", 43.5, 10);
        
        Moto moto3 = new Moto("A3", "Yamaha 2005", 2005, 200, "3", 2);  
        moto2.crearMotor("3", 43.5, 10);
                
        Carro carro1 = new Carro("A4", "Audi 2008", 2008, 800, "4", "Automatica");
        carro1.crearMotor("4", 85.2, 20);
        
        Carro carro2 = new Carro("A5", "Chevrolet 2015", 2015, 1000, "5", "Mecanica");
        carro2.crearMotor("5", 65.8, 25);
        
        
         //Asignarle a los cubiculos los vehiculos
        for (Cubiculo cubiculoActual: cacharro.getMisCubiculos()) {
              if (cubiculoActual.getId().equals("1")) {
                cubiculoActual.getMisVehiculos().add(moto3);
                cubiculoActual.getMisVehiculos().add(moto2);
                cubiculoActual.getMisVehiculos().add(carro1);
                
                //Crear Kit
                cubiculoActual.setMiKit(kit1);
            }
              if (cubiculoActual.getId().equals("2")) {
                cubiculoActual.getMisVehiculos().add(carro2);
                cubiculoActual.getMisVehiculos().add(moto1);
                
                //Crear Kit
                cubiculoActual.setMiKit(kit2);
            }
        }
         
        carro1.setMiCliente(cliente2);
        carro2.setMiCliente(cliente1);
        moto1.setMiCliente(cliente2);
        moto2.setMiCliente(cliente2);
        moto3.setMiCliente(cliente1);
        
        
        cliente1.getMisVehiculos().add(moto3);
        cliente1.getMisVehiculos().add(carro2);
        cliente2.getMisVehiculos().add(moto2);
        cliente2.getMisVehiculos().add(moto1);
        cliente2.getMisVehiculos().add(carro1);
        

        
//          for (Carro carroActual: cacharro.carrosClienteMasFiel()) {
//               System.out.println(carroActual.getModelo());
//        }

//        System.out.println(cacharro.promedioAñosExperiencia());
        
//        System.out.println(cacharro.clienteMasMotos().getNombre());

//        System.out.println(cacharro.cubiculoMasPatasMotos());
        cacharro.carrosCubiculos();
    }
    
}
