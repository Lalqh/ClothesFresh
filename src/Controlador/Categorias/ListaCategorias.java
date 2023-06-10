package Controlador.Categorias;

import Modelos.Categorias.Categorias;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laloh
 */
public class ListaCategorias {

    public NodoCategorias lista;
    public int auxCounter = 0;

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
       if(listaL.lista == null) {
           JOptionPane.showMessageDialog(null, "Lista de categorias vacia.");
       } else {
           DefaultTableModel mainTable = new DefaultTableModel();
           String cabecera[] = {"ID", "Nombre","Descripcion", "Fecha registro"};
           mainTable.setColumnIdentifiers(cabecera);
           tabla.setModel(mainTable);
           
           Object[] datosCategoria = new Object[4];
           
           while( aux != null ) {
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
}