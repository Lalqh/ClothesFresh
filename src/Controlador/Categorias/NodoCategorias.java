
package Controlador.Categorias;

import Modelos.Categorias.Categorias;


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
