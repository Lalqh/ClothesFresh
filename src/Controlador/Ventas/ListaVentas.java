
package Controlador.Ventas;
import Modelos.Ventas.Ventas;
import javax.swing.JOptionPane;

public class ListaVentas {

    public NodoVentas lista;
    private int cantidadNodos;

    public ListaVentas() {
        lista = null;
        cantidadNodos = 0;
    }

    public NodoVentas getLista() {
        return lista;
    }

    public void setLista(NodoVentas lista) {
        this.lista = lista;
    }

    public int getCantidadNodos() {
        return cantidadNodos;
    }

    public void setCantidadNodos(int cantidadNodos) {
        this.cantidadNodos = cantidadNodos;
    }

    public void agregarNodo(Ventas v) {
        NodoVentas nuevo = new NodoVentas(v);
        if (lista == null) {
            lista = nuevo;
        } else {
            NodoVentas aux = lista;
            while (aux.getAptSiguiente() != null) {
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
        cantidadNodos++;
    }

    public Ventas[] mostrar() {
        NodoVentas aux = lista;
        Ventas[] ventas = new Ventas[cantidadNodos];
        int j = 0;
        int I = 1;
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "lista esta vacia");
        } else {
            while (aux != null) {
                ventas[j] = aux.getV();
                aux = aux.getAptSiguiente();
                j++;
                I++;
            }
        }
        return ventas;
    }
}
