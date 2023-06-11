package Controlador.Categorias;

import Modelos.Categorias.Categorias;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaCategorias {

    public NodoCategorias lista;
    public int auxCounter = 1;

    public ListaCategorias() {
        lista = null;
    }

    public NodoCategorias getLista() {
        return lista;
    }

    public void setLista(NodoCategorias lista) {
        this.lista = lista;
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
            JOptionPane.showMessageDialog(null, "Elemento agregado.");
        }
    }

    public void mostrarElementosCategoria(JTable tabla, ListaCategorias listaL) {
        NodoCategorias aux = listaL.lista;
        if (listaL.lista == null) {
            JOptionPane.showMessageDialog(null, "Lista de categorias vacia.");
        } else {
            DefaultTableModel mainTable = new DefaultTableModel();
            String cabecera[] = {"ID", "Nombre", "Descripcion", "Fecha registro"};
            mainTable.setColumnIdentifiers(cabecera);
            tabla.setModel(mainTable);

            Object[] datosCategoria = new Object[4];

            while (aux != null) {
                datosCategoria[0] = aux.getC().getIdCategoria();
                datosCategoria[1] = aux.getC().getNombreCategoria();
                datosCategoria[2] = aux.getC().getDescripcion();
                datosCategoria[3] = aux.getC().getFechaCreacion();
                aux = aux.getAptSiguiente();
                mainTable.addRow(datosCategoria);
            }
            tabla.setModel(mainTable);
        }
    }

    public void eliminarNodo(int idCategoria) {
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "La lista de categorías está vacía.");
            return;
        }
        if (lista.getC().getIdCategoria() == idCategoria) {
            lista = lista.getAptSiguiente();
            JOptionPane.showMessageDialog(null, "Elemento eliminado.");
            return;
        }

        NodoCategorias aux = lista;
        NodoCategorias previo = null;

        while (aux != null && aux.getC().getIdCategoria() != idCategoria) {
            previo = aux;
            aux = aux.getAptSiguiente();
        }

        if (aux == null) {
            JOptionPane.showMessageDialog(null, "No se encontró la categoría en la lista.");
            return;
        }
        previo.setAptSiguiente(aux.getAptSiguiente());
        JOptionPane.showMessageDialog(null, "Elemento eliminado.");
    }

    public Categorias buscarNodo(int idCategoria) {
        NodoCategorias aux = lista;

        while (aux != null) {
            if (aux.getC().getIdCategoria() == idCategoria) {
                return aux.getC();
            }
            aux = aux.getAptSiguiente();
        }

        // Si no se encontró el elemento
        return null;
    }

    public void editarNodo(int idCategoria, Categorias categoriaActualizada) {
        NodoCategorias aux = lista;

        while (aux != null) {
            if (aux.getC().getIdCategoria() == idCategoria) {
                aux.getC().setNombreCategoria(categoriaActualizada.getNombreCategoria());
                aux.getC().setDescripcion(categoriaActualizada.getDescripcion());
                aux.getC().setFechaCreacion(categoriaActualizada.getFechaCreacion());
                JOptionPane.showMessageDialog(null, "Elemento actualizado.");
                return;
            }
            aux = aux.getAptSiguiente();
        }
        JOptionPane.showMessageDialog(null, "No se encontró la categoría en la lista.");
    }

}
