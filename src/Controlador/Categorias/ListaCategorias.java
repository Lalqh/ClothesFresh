package Controlador.Categorias;

import Modelos.Categorias.Categorias;
import javax.swing.JOptionPane;

/**
 *
 * @author laloh
 */
public class ListaCategorias {

    public NodoCategorias lista;
    private int cantidadNodos;

    public ListaCategorias() {
        lista = null;
        cantidadNodos = 0;
    }

    public NodoCategorias getLista() {
        return lista;
    }

    public void setLista(NodoCategorias lista) {
        this.lista = lista;
    }

    public int getCantidadNodos() {
        return cantidadNodos;
    }

    public void setCantidadNodos(int cantidadNodos) {
        this.cantidadNodos = cantidadNodos;
    }

    public void agregarNodo(Categorias c) {
        NodoCategorias nuevo = new NodoCategorias(c);
        if (lista == null) {
            lista = nuevo;
        } else {
            NodoCategorias aux = lista;
            while (aux.getAptSiguiente() != null) {
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
        cantidadNodos++;
    }

    public Categorias[] mostrar() {
        NodoCategorias aux = lista;
        Categorias[] categorias = new Categorias[cantidadNodos];
        int j = 0;
        int I = 1;
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "lista esta vacia");
        } else {
            while (aux != null) {
                categorias[j] = aux.getC();
                aux = aux.getAptSiguiente();
                j++;
                I++;
            }
        }
        return categorias;
    }
}