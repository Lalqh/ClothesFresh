
package Controlador.Productos;

import Modelos.Productos.Productos;
import javax.swing.JOptionPane;

public class ListaProductos {

    public NodoProductos lista;
    private int cantidadNodos;

    public ListaProductos() {
        lista = null;
        cantidadNodos = 0;
    }

    public NodoProductos getLista() {
        return lista;
    }

    public void setLista(NodoProductos lista) {
        this.lista = lista;
    }

    public int getCantidadNodos() {
        return cantidadNodos;
    }

    public void setCantidadNodos(int cantidadNodos) {
        this.cantidadNodos = cantidadNodos;
    }

    public void agregarNodo(Productos p) {
        NodoProductos nuevo = new NodoProductos(p);
        if (lista == null) {
            lista = nuevo;
        } else {
            NodoProductos aux = lista;
            while (aux.getAptSiguiente() != null) {
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
        cantidadNodos++;
    }

    public Productos[] mostrar() {
        NodoProductos aux = lista;
        Productos[] categorias = new Productos[cantidadNodos];
        int j = 0;
        int I = 1;
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "lista esta vacia");
        } else {
            while (aux != null) {
                categorias[j] = aux.getP();
                aux = aux.getAptSiguiente();
                j++;
                I++;
            }
        }
        return categorias;
    }
}
