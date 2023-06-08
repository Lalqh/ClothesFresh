/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Productos;

import Modelos.Productos.Productos;

/**
 *
 * @author laloh
 */
public class NodoProductos {
    private NodoProductos aptSiguiente;
    private Productos p;

    public NodoProductos(Productos p) {
        this.aptSiguiente = null;
        this.p = p;
    }

    public NodoProductos getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoProductos aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }

    public Productos getP() {
        return p;
    }

    public void setP(Productos p) {
        this.p = p;
    }
    
}
