
package Controlador.OrdenDeCompra;
import Modelos.OrdenDeCompra.OrdenesDeCompra;


public class NodoOrdenDeCompra {
private NodoOrdenDeCompra aptSiguiente;
    private OrdenesDeCompra o;

    public NodoOrdenDeCompra(OrdenesDeCompra o) {
        this.aptSiguiente = null;
        this.o = o;
    }

    public NodoOrdenDeCompra getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoOrdenDeCompra aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }

    public OrdenesDeCompra getO() {
        return o;
    }

    public void setO(OrdenesDeCompra o) {
        this.o = o;
    }
}
