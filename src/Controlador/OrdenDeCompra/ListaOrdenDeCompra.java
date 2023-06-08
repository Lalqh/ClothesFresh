
package Controlador.OrdenDeCompra;
import Modelos.OrdenDeCompra.OrdenesDeCompra;
import javax.swing.JOptionPane;

public class ListaOrdenDeCompra {

    public NodoOrdenDeCompra lista;
    private int cantidadNodos;

    public ListaOrdenDeCompra() {
        lista = null;
        cantidadNodos = 0;
    }

    public NodoOrdenDeCompra getLista() {
        return lista;
    }

    public void setLista(NodoOrdenDeCompra lista) {
        this.lista = lista;
    }

    public int getCantidadNodos() {
        return cantidadNodos;
    }

    public void setCantidadNodos(int cantidadNodos) {
        this.cantidadNodos = cantidadNodos;
    }

    public void agregarNodo(OrdenesDeCompra o) {
        NodoOrdenDeCompra nuevo = new NodoOrdenDeCompra(o);
        if (lista == null) {
            lista = nuevo;
        } else {
            NodoOrdenDeCompra aux = lista;
            while (aux.getAptSiguiente() != null) {
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
        cantidadNodos++;
    }

    public OrdenesDeCompra[] mostrar() {
        NodoOrdenDeCompra aux = lista;
        OrdenesDeCompra[] ordenesdecompra = new OrdenesDeCompra[cantidadNodos];
        int j = 0;
        int I = 1;
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "lista esta vacia");
        } else {
            while (aux != null) {
                ordenesdecompra[j] = aux.getO();
                aux = aux.getAptSiguiente();
                j++;
                I++;
            }
        }
        return ordenesdecompra;
    }
}
