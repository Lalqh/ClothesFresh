
package Controlador.Proveedores;

import Modelos.Proveedor.Proveedores;

/**
 *
 * @author laloh
 */
public class NodoProveedor {
    private NodoProveedor aptSiguiente;
    private Proveedores p;

    public NodoProveedor(Proveedores p) {
        this.aptSiguiente = null;
        this.p = p;
    }

    public NodoProveedor getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoProveedor aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }

    public Proveedores getP() {
        return p;
    }

    public void setP(Proveedores p) {
        this.p = p;
    }
}
