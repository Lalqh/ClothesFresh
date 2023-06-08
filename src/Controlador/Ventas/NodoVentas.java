
package Controlador.Ventas;
import Modelos.Ventas.Ventas;

public class NodoVentas {
private NodoVentas aptSiguiente;
    private Ventas v;

    public NodoVentas(Ventas v) {
        this.aptSiguiente = null;
        this.v = v;
    }

    public NodoVentas getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoVentas aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }

    public Ventas getV() {
        return v;
    }

    public void setV(Ventas v) {
        this.v = v;
    }
    
}
