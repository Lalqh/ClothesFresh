/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Empleados;

import Modelos.Empleados.Empleados;

/**
 *
 * @author laloh
 */
public class NodoEmpleado {
    private NodoEmpleado aptSiguiente;
    private Empleados e;
    
    public NodoEmpleado(Empleados e) {
        this.aptSiguiente = null;
        this.e = e;
    }

    public NodoEmpleado getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoEmpleado aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }

    public Empleados getE() {
        return e;
    }

    public void setE(Empleados e) {
        this.e = e;
    }
}
