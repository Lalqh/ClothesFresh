/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Productos;

/**
 *
 * @author laloh
 */
public class Productos {

    private int stockProducto;
    private float precio;
    private String folioProducto, nombreProducto, descripcion, talla;

    public Productos(int stockProducto, float precio, String folioProducto, String nombreProducto, String descripcion, String talla) {
        this.stockProducto = stockProducto;
        this.precio = precio;
        this.folioProducto = folioProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.talla = talla;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFolioProducto() {
        return folioProducto;
    }

    public void setFolioProducto(String folioProducto) {
        this.folioProducto = folioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    
}
