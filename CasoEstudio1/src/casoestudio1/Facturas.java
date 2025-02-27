/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio1;

/**
 *
 * @author Hp
 */
public class Facturas {
    

    private String NomCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double montoFactura;
    private int mes;
    private boolean tieneElectricos;
    private int cantidadElectricos;
    private boolean tieneAutomotrices;
    private int cantidadAutomotrices;
    private boolean tieneConstruccion;
    private double comision;
    private int puntos;

//Constrcutor
    public Facturas(String NomCliente, String cedulaCliente, String codigoFactura, 
                   double montoFactura, int mes, boolean tieneElectricos,
                   boolean tieneAutomotrices, boolean tieneConstruccion) {
        this.NomCliente = NomCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.tieneElectricos = tieneElectricos;
        this.tieneAutomotrices = tieneAutomotrices;
        this.tieneConstruccion = tieneConstruccion;
    }
//Get set
    public String getNomCliente() {
        return NomCliente;
    }

    public void setNomCliente(String nombreCliente) {
        this.NomCliente = NomCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean isTieneElectricos() {
        return tieneElectricos;
    }

    public void setTieneElectricos(boolean tieneElectricos) {
        this.tieneElectricos = tieneElectricos;
    }

    public int getCantidadElectricos() {
        return cantidadElectricos;
    }

    public void setCantidadElectricos(int cantidadElectricos) {
        this.cantidadElectricos = cantidadElectricos;
    }

    public boolean isTieneAutomotrices() {
        return tieneAutomotrices;
    }

    public void setTieneAutomotrices(boolean tieneAutomotrices) {
        this.tieneAutomotrices = tieneAutomotrices;
    }

    public int getCantidadAutomotrices() {
        return cantidadAutomotrices;
    }

    public void setCantidadAutomotrices(int cantidadAutomotrices) {
        this.cantidadAutomotrices = cantidadAutomotrices;
    }

    public boolean isTieneConstruccion() {
        return tieneConstruccion;
    }

    public void setTieneConstruccion(boolean tieneConstruccion) {
        this.tieneConstruccion = tieneConstruccion;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

   

    





}
    

