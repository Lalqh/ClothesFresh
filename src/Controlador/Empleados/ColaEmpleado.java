package Controlador.Empleados;

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

            Object[] datosEmpleado = new Object[5];

            while (aux != null) {
                datosEmpleado[0] = aux.getE().getID();
                datosEmpleado[1] = aux.getE().getUsuarioEmpleado();
                datosEmpleado[2] = aux.getE().getNombreEmpleado();
                datosEmpleado[3] = aux.getE().getApellidoPaterno();
                datosEmpleado[3] = aux.getE().getApellidoPaterno();
                aux = aux.getAptSiguiente();
                mainTable.addRow(datosEmpleado);
            }
            tabla.setModel(mainTable);
        }
    }
}
