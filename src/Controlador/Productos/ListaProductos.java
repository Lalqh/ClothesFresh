package Controlador.Productos;

import Modelos.Productos.Productos;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaProductos {

    public NodoProductos lista;
    public int auxCounter = 3;

    public ListaProductos() {
        lista = null;
    }

    public NodoProductos getLista() {
        return lista;
    }

    public void setLista(NodoProductos lista) {
        this.lista = lista;
    }

    public int getAuxCounter() {
        return auxCounter;
    }

    public void setAuxCounter(int auxCounter) {
        this.auxCounter = auxCounter;
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
    }

    public void mostrarElementosProductos(JTable tabla, ListaProductos listaP) {
        NodoProductos aux = listaP.lista;
        if (listaP.lista == null) {
            JOptionPane.showMessageDialog(null, "Lista de productos vacia.");
        } else {
            DefaultTableModel mainTable = new DefaultTableModel();
            String cabecera[] = {"ID", "Nombre", "Descripcion", "Talla", "Categoria", "Stock", "Precio"};
            mainTable.setColumnIdentifiers(cabecera);
            tabla.setModel(mainTable);

            Object[] datosProductos = new Object[7];

            while (aux != null) {
                datosProductos[0] = aux.getP().getId();
                datosProductos[1] = aux.getP().getNombreProducto();
                datosProductos[2] = aux.getP().getDescripcion();
                datosProductos[3] = aux.getP().getTalla();
                datosProductos[4] = aux.getP().getCategoria();
                datosProductos[5] = aux.getP().getStockProducto();
                datosProductos[6] = aux.getP().getPrecio();
                aux = aux.getAptSiguiente();
                mainTable.addRow(datosProductos);
            }
            tabla.setModel(mainTable);
        }
    }

    public void eliminarNodo(int idProducto) {
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "La lista de productos está vacía.");
            return;
        }
        if (lista.getP().getId() == idProducto) {
            lista = lista.getAptSiguiente();
            JOptionPane.showMessageDialog(null, "Elemento eliminado.");
            return;
        }

        NodoProductos aux = lista;
        NodoProductos previo = null;

        while (aux != null && aux.getP().getId() != idProducto) {
            previo = aux;
            aux = aux.getAptSiguiente();
        }

        if (aux == null) {
            JOptionPane.showMessageDialog(null, "No se encontró del producto en la lista.");
            return;
        }
        previo.setAptSiguiente(aux.getAptSiguiente());
        JOptionPane.showMessageDialog(null, "Elemento eliminado.");
    }

    public Productos buscarNodo(int idProducto) {
        NodoProductos aux = lista;
        while (aux != null) {
            if (aux.getP().getId() == idProducto) {
                return aux.getP();
            }
            aux = aux.getAptSiguiente();
        }

        // Si no se encontró el elemento
        return null;
    }

    public void editarNodo(int idCategoria, Productos productosActu) {
        NodoProductos aux = lista;

        while (aux != null) {
            if (aux.getP().getId() == idCategoria) {
                aux.getP().setNombreProducto(productosActu.getNombreProducto());
                aux.getP().setDescripcion(productosActu.getDescripcion());
                aux.getP().setTalla(productosActu.getTalla());
                aux.getP().setStockProducto(productosActu.getStockProducto());
                aux.getP().setPrecio(productosActu.getPrecio());
                aux.getP().setCategoria(productosActu.getCategoria());
                aux.getP().setTalla(productosActu.getTalla());
                JOptionPane.showMessageDialog(null, "Elemento actualizado.");
                return;
            }
            aux = aux.getAptSiguiente();
        }
        JOptionPane.showMessageDialog(null, "No se encontró del proucto en la lista.");
    }
}