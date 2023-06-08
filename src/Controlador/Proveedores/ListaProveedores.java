package Controlador.Proveedores;

import Controlador.Productos.NodoProductos;
import Modelos.Productos.Productos;
import Modelos.Proveedor.Proveedores;
import javax.swing.JOptionPane;

/**
 *
 * @author laloh
 */
public class ListaProveedores {
    public NodoProveedor lista;
    private int cantidadNodos;
    
     public ListaProveedores() {
        lista = null;
        cantidadNodos = 0;
    }

    public NodoProveedor getLista() {
        return lista;
    }

    public void setLista(NodoProveedor lista) {
        this.lista = lista;
    }

    public int getCantidadNodos() {
        return cantidadNodos;
    }

    public void setCantidadNodos(int cantidadNodos) {
        this.cantidadNodos = cantidadNodos;
    }
     
       public void agregarNodo(Proveedores p) {
        NodoProveedor nuevo = new NodoProveedor(p);
        if (lista == null) {
            lista = nuevo;
        } else {
            NodoProveedor aux = lista;
            while (aux.getAptSiguiente() != null) {
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
        cantidadNodos++;
    }

    public Proveedores[] mostrar() {
        NodoProveedor aux = lista;
        Proveedores[] proveedor = new Proveedores[cantidadNodos];
        int j = 0;
        int I = 1;
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "lista esta vacia");
        } else {
            while (aux != null) {
                proveedor[j] = aux.getP();
                aux = aux.getAptSiguiente();
                j++;
                I++;
            }
        }
        return proveedor;
    }
}
