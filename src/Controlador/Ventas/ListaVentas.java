package Controlador.Ventas;

import Modelos.Ventas.Ventas;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaVentas {

    public NodoVentas lista;
    public int auxCounter = 3;
    
    public ListaVentas() {
        lista = null;

    }

    public NodoVentas getLista() {
        return lista;
    }

    public void setLista(NodoVentas lista) {
        this.lista = lista;
    }

    public int getAuxCounter() {
        return auxCounter;
    }

    public void setAuxCounter(int auxCounter) {
        this.auxCounter = auxCounter;
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
    }

    public void mostrarElementosVentas(JTable tabla, ListaVentas listaV) {
        NodoVentas aux = listaV.lista;
        if (listaV.lista == null) {
            JOptionPane.showMessageDialog(null, "Lista de productos vacia.");
        } else {
            DefaultTableModel mainTable = new DefaultTableModel();
            String cabecera[] = {"ID", "Producto", "Empleado", "Fecha de venta", "Metodo de pago", "Total de la venta"};
            mainTable.setColumnIdentifiers(cabecera);
            tabla.setModel(mainTable);

            Object[] datosVentas = new Object[6];

            while (aux != null) {
                datosVentas[0] = aux.getV().getIdVenta();
                datosVentas[1] = aux.getV().getProducto();
                datosVentas[2] = aux.getV().getEmpleado();
                datosVentas[3] = aux.getV().getFechaDeVenta();
                datosVentas[4] = aux.getV().getMetodoPago();
                datosVentas[5] = aux.getV().getTotalVenta();
                aux = aux.getAptSiguiente();
                mainTable.addRow(datosVentas);
            }
            tabla.setModel(mainTable);
        }
    }

    public void eliminarNodo(int idVenta) {
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "La lista de ventas está vacía.");
            return;
        }
        if (lista.getV().getIdVenta()== idVenta) {
            lista = lista.getAptSiguiente();
            JOptionPane.showMessageDialog(null, "Elemento eliminado.");
            return;
        }

        NodoVentas aux = lista;
        NodoVentas previo = null;

        while (aux != null && aux.getV().getIdVenta()!= idVenta) {
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
}
