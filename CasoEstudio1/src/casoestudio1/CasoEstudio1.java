/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class CasoEstudio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      Vendedor vendedor = CrearVendedor();
      ingresarFactura(vendedor);
      
       
        private static Vendedor CrearVendedor() {
        String Nombre = JOptionPane.showInputDialog("Nombre:");
        String Codigo = JOptionPane.showInputDialog("Código:");
        String Sucursal = JOptionPane.showInputDialog("Sucursal:");
        String Vehiculo = JOptionPane.showInputDialog("Tiene vehículo? SI/N0:");
        return new Vendedor(Nombre, Codigo, Sucursal, Vehiculo);
    }


        private static void ingresarFactura(Vendedor vendedor) {
        String nombreCliente = JOptionPane.showInputDialog("Nombre del cliente:");
        String cedula = JOptionPane.showInputDialog("Ingrese la Cdula:");
        String codigo = JOptionPane.showInputDialog("Ingrese el cdigo de factura:");
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Monto de la factura:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de mes:"));
            
        
        
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
