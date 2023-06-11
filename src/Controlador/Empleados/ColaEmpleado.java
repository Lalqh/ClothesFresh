package Controlador.Empleados;

import Controlador.Categorias.NodoCategorias;
import Modelos.Empleados.Empleados;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laloh
 */
public class ColaEmpleado {

    public NodoEmpleado cola;
    public int auxCounter = 1;

    public ColaEmpleado() {
        cola = null;
    }

    public void encolar(Empleados e) {
        NodoEmpleado nuevo = new NodoEmpleado(e);
        if (cola == null) {
            cola = nuevo;
        } else {
            NodoEmpleado aux = cola;

            while (aux.getAptSiguiente() != null) {
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
    }

    public void mostrarElementosEmpleado(JTable tabla, ColaEmpleado cola) {
        NodoEmpleado aux = cola.cola;
        if (cola.cola == null) {
            JOptionPane.showMessageDialog(null, "La cola de empleados esta vacia.");
        } else {
            DefaultTableModel mainTable = new DefaultTableModel();
            String cabecera[] = {"ID", "Usuario", "Nombre", "Apellido paterno", "Apellido materno"};
            mainTable.setColumnIdentifiers(cabecera);
            tabla.setModel(mainTable);

            Object[] datosCategoria = new Object[5];

            while (aux != null) {
                datosCategoria[0] = aux.getE().getID();
                datosCategoria[1] = aux.getE().getUsuarioEmpleado();
                datosCategoria[2] = aux.getE().get();
                datosCategoria[3] = aux.getC().getFechaCreacion();
                aux = aux.getAptSiguiente();
                mainTable.addRow(datosCategoria);
            }
            tabla.setModel(mainTable);
        }
    }

}
