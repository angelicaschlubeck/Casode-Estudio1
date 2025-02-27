/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio1;

/**
 *
 * @author Hp
 */
public class Vendedor {

    private String nombre;
    private String codigo;
    private String sucursal;
    private boolean Vehiculo;
    private double totalVentas;
    private double totalComisiones;
    private boolean alcanzaBonoExtra;
    private int totalPuntos;
    private int cantidadFacturas;

    public Vendedor(String nombre, String codigo, String sucursal, boolean tieneVehiculo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.Vehiculo = tieneVehiculo;
        this.totalVentas = 0;
        this.totalComisiones = 0;
        this.alcanzaBonoExtra = false;
        this.totalPuntos = 0;
        this.cantidadFacturas = 0;
    }

    Vendedor(String nombre, String codigo, String sucursal, String respuesta) {
         }

    public void agregarFactura(Facturas factura) {
        cantidadFacturas++;
        calcularComisionFactura(factura);
    }

    private void calcularComisionFactura(Facturas factura) {
        double comision = 0;
        int puntos = 0;  
        
}
    
   
}

   
    
   
        
        
        

 
      
    
    
    


    

     
    
    

    
    
    

