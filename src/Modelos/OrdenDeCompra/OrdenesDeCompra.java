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
   
}
