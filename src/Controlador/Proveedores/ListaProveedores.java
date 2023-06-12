package Controlador.Proveedores;



import Controlador.Productos.NodoProductos;
import Modelos.Productos.Productos;
import Modelos.Proveedor.Proveedores;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ListaProveedores {

  
    public NodoProveedor lista;
    public int auxCounter = 1;

    public ListaProveedores() {
        lista = null;
    }

    public NodoProveedor getLista() {
        return lista;
    }

    public void setLista(NodoProveedor lista) {
        this.lista = lista;
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
    
    public void mostrarElementosProveedores(JTable tabla, ListaProveedores listaL) {
       NodoProveedor aux = listaL.lista; 
       if(listaL.lista == null) {
           JOptionPane.showMessageDialog(null, "Lista de proveedores vacia.");
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
    
    public void eliminarNodo(int idProveedor) {
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "La lista de proveedores está vacía.");
            return;
        }
        if (lista.getP().getIdProveedor()== idProveedor) {
            lista = lista.getAptSiguiente();
            JOptionPane.showMessageDialog(null, "Elemento eliminado.");
            return;
        }

        NodoProveedor aux = lista;
        NodoProveedor previo = null;

        while (aux != null && aux.getP().getIdProveedor()!= idProveedor) {
            previo = aux;
            aux = aux.getAptSiguiente();
        }

        if (aux == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el proveedor en la lista.");
            return;
        }
        previo.setAptSiguiente(aux.getAptSiguiente());
        JOptionPane.showMessageDialog(null, "Elemento eliminado.");
    }
    
    
    public Proveedores buscarNodo(int idProveedor) {
        NodoProveedor aux = lista;

        while (aux != null) {
            if (aux.getP().getIdProveedor()== idProveedor) {
                return aux.getP();
            }
            aux = aux.getAptSiguiente();
        }

        // Si no se encontró el elemento
        return null;
    }
    
      public void editarNodo(int idProveedor, Proveedores ProveedorActualizado) {
        NodoProveedor aux = lista;

        while (aux != null) {
            if (aux.getP().getIdProveedor()== idProveedor) {
                aux.getP().setNombreProveedor(ProveedorActualizado.getNombreProveedor());
                aux.getP().setRfcProveedor(ProveedorActualizado.getRfcProveedor());
                aux.getP().setCorreoProveedor(ProveedorActualizado.getCorreoProveedor());
                aux.getP().setNumeroProveedor(ProveedorActualizado.getNumeroProveedor());
                
                JOptionPane.showMessageDialog(null, "Elemento actualizado.");
                return;
            }
            aux = aux.getAptSiguiente();
        }
        JOptionPane.showMessageDialog(null, "No se encontró el proveedor en la lista.");
    }


    
    
}
