package Controlador.Empleados;

import Modelos.Empleados.Empleados;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ColaEmpleado {

    public NodoEmpleado cola;
    public int auxCounter = 3;

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
                datosEmpleado[4] = aux.getE().getApellidoMaterno();
                aux = aux.getAptSiguiente();
                mainTable.addRow(datosEmpleado);
            }
            tabla.setModel(mainTable);
        }
    }
    
    public void desencolar(int idEmpleado){
        if (cola == null) {
            JOptionPane.showMessageDialog(null, "La cola de empleados está vacía.");
            return;
        }
        if (cola.getE().getID()== idEmpleado) {
            cola = cola.getAptSiguiente();
            JOptionPane.showMessageDialog(null, "Elemento eliminado.");
            return;
        }

        NodoEmpleado aux = cola;
        NodoEmpleado previo = null;

        while (aux != null && aux.getE().getID() != idEmpleado) {
            previo = aux;
            aux = aux.getAptSiguiente();
        }

        if (aux == null) {
            JOptionPane.showMessageDialog(null, "No se encontró al empleado.");
            return;
        }
        previo.setAptSiguiente(aux.getAptSiguiente());
        JOptionPane.showMessageDialog(null, "Elemento eliminado.");

    }
    
    public Empleados buscarNodo(int idEmpleado){
        NodoEmpleado aux = cola;
        
        while(aux!=null){
            if(aux.getE().getID()==idEmpleado){
                return aux.getE();
            }
            aux=aux.getAptSiguiente();
        }
        return null;
    }
       
    

}
