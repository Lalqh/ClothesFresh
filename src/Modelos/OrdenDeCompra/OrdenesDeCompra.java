/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.OrdenDeCompra;

/**
 *
 * @author laloh
 */
public class OrdenesDeCompra {

    private int idOrdenCompra, cantidadSurtida;
    float montoTotal;
    private String fechaDeCompra;
    private boolean estadoDePago;

    public OrdenesDeCompra(int idOrdenCompra, int cantidadSurtida, float montoTotal, String fechaDeCompra, boolean estadoDePago) {
        this.idOrdenCompra = idOrdenCompra;
        this.cantidadSurtida = cantidadSurtida;
        this.montoTotal = montoTotal;
        this.fechaDeCompra = fechaDeCompra;
        this.estadoDePago = estadoDePago;
    }

    public int getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public int getCantidadSurtida() {
        return cantidadSurtida;
    }

    public void setCantidadSurtida(int cantidadSurtida) {
        this.cantidadSurtida = cantidadSurtida;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(String fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public boolean isEstadoDePago() {
        return estadoDePago;
    }

    public void setEstadoDePago(boolean estadoDePago) {
        this.estadoDePago = estadoDePago;
    }
    
    

}
