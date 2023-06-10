package Controlador.Proveedores;

import Controlador.Categorias.ListaCategorias;
import Controlador.Categorias.NodoCategorias;
import Controlador.Productos.NodoProductos;
import Modelos.Productos.Productos;
import Modelos.Proveedor.Proveedores;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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

    public void obtenerDatos(JTextField nombre, JTextField rfc, JTextField correo, JTextField id, JTextField noTelefono) {
        String inputNombre = nombre.getText();
        String inputRFC = rfc.getText();
        String inputCorreo = correo.getText();
        int inputID = Integer.parseInt(id.getText());
        int inputNoTelefono = Integer.parseInt(noTelefono.getText());
        
        Proveedores proveedor = new Proveedores(inputNombre, inputRFC, inputCorreo, inputID, inputNoTelefono);
        agregarNodo(proveedor);
        cantidadNodos++;
                
        nombre.setText("");
        rfc.setText("");
        correo.setText("");
        id.setText("");
        noTelefono.setText("");
        
        nombre.requestFocus();
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
            JOptionPane.showMessageDialog(null, "Elemento agregado.");
        }
    }
    
    public void mostrarElementosCategoria(JTable tabla, ListaProveedores listaL) {
       NodoProveedor aux = listaL.lista; 
       if(listaL.lista == null) {
           JOptionPane.showMessageDialog(null, "Lista de categorias vacia.");
       } else {
           DefaultTableModel mainTable = new DefaultTableModel();
           String cabecera[] = {"ID", "Nombre","RFC", "Correo","No. Telefono"};
           mainTable.setColumnIdentifiers(cabecera);
           tabla.setModel(mainTable);
           
           Object[] datosCategoria = new Object[5];
           
           while( aux != null ) {
               datosCategoria[0] = aux.getP().getIdProveedor();
               datosCategoria[1] = aux.getP().getNombreProveedor();
               datosCategoria[2] = aux.getP().getRfcProveedor();
               datosCategoria[3] = aux.getP().getCorreoProveedor();
               datosCategoria[4] = aux.getP().getNumeroProveedor();
               aux = aux.getAptSiguiente();
               mainTable.addRow(datosCategoria);
           }
           tabla.setModel(mainTable);
       }
    }
}
