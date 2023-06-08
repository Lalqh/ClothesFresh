/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Categorias;

import Modelos.Categorias.Categorias;

/**
 *
 * @author laloh
 */
public class NodoCategorias {
    private NodoCategorias aptSiguiente;
    private Categorias c;

    public NodoCategorias(Categorias c) {
        this.aptSiguiente = null;
        this.c = c;
    }

    public NodoCategorias getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoCategorias aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }

    public Categorias getC() {
        return c;
    }

    public void setC(Categorias c) {
        this.c = c;
    }
}
