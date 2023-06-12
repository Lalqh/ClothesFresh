
package Controlador.OrdenDeCompra;
import Modelos.OrdenDeCompra.OrdenesDeCompra;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaOrdenDeCompra {

    public NodoOrdenDeCompra lista;
   public int auxCounter = 3;

    public ListaOrdenDeCompra() {
        lista = null;
        
    }

    public NodoOrdenDeCompra getLista() {
        return lista;
    }

    public void setLista(NodoOrdenDeCompra lista) {
        this.lista = lista;
    }

    public int getAuxCounter() {
        return auxCounter;
    }

    public void setAuxCounter(int auxCounter) {
        this.auxCounter = auxCounter;
    }

    public void agregarNodo(OrdenesDeCompra o) {
        NodoOrdenDeCompra nuevo = new NodoOrdenDeCompra(o);
        if (lista == null) {
            lista = nuevo;
        } else {
            NodoOrdenDeCompra aux = lista;
            while (aux.getAptSiguiente() != null) {
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
    }

   public void mostrarElementosOrdenC(JTable tabla, ListaOrdenDeCompra listaP) {
        NodoOrdenDeCompra aux = listaP.lista;
        if (listaP.lista == null) {
            JOptionPane.showMessageDialog(null, "Lista de Ordende compras vacia.");
        } else {
            DefaultTableModel mainTable = new DefaultTableModel();
            String cabecera[] = {"ID", "Cantidad Surtida", "Fecha de compra "
                    , "Monto total", "Estado del pago", "Proveedor"};
            mainTable.setColumnIdentifiers(cabecera);
            tabla.setModel(mainTable);

            Object[] datosOrdenDeCompra = new Object[6];

            while (aux != null) {
                datosOrdenDeCompra[0] = aux.getO().getIdOrdenCompra();
                datosOrdenDeCompra[1] = aux.getO().getCantidadSurtida();
                datosOrdenDeCompra[2] = aux.getO().getFechaDeCompra();
                datosOrdenDeCompra[3] = aux.getO().getMontoTotal();
                datosOrdenDeCompra[4] = aux.getO().isEstadoDePago();
                datosOrdenDeCompra[5] = aux.getO().getProvedor();
                aux = aux.getAptSiguiente();
                mainTable.addRow(datosOrdenDeCompra);
            }
            tabla.setModel(mainTable);
        }
    }
   
    public void eliminarNodo(int idOrdencompra) {
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "La lista de ordenes está vacía.");
            return;
        }
        if (lista.getO().getIdOrdenCompra()== idOrdencompra) {
            lista = lista.getAptSiguiente();
            JOptionPane.showMessageDialog(null, "Elemento eliminado.");
            return;
        }
         NodoOrdenDeCompra aux = lista;
        NodoOrdenDeCompra previo = null;

        while (aux != null && aux.getO().getIdOrdenCompra()!= idOrdencompra) {
            previo = aux;
            aux = aux.getAptSiguiente();
        }

        if (aux == null) {
            JOptionPane.showMessageDialog(null, "No se encontró la orden en la lista.");
            return;
        }
        previo.setAptSiguiente(aux.getAptSiguiente());
        JOptionPane.showMessageDialog(null, "Elemento eliminado.");
        }
    
    public OrdenesDeCompra buscarNodo(int idOrdencompra) {
        NodoOrdenDeCompra aux = lista;
        while (aux != null) {
            if (aux.getO().getIdOrdenCompra() == idOrdencompra) {
                return aux.getO();
            }
            aux = aux.getAptSiguiente();
        }

        // Si no se encontró el elemento
        return null;
    }
    
     public void editarNodo(int idCategoria, OrdenesDeCompra productosActu) {
        NodoOrdenDeCompra aux = lista;

        while (aux != null) {
            if (aux.getO().getIdOrdenCompra()== idCategoria) {
                aux.getO().setCantidadSurtida(productosActu.getCantidadSurtida());
                aux.getO().setFechaDeCompra(productosActu.getFechaDeCompra());
                aux.getO().setMontoTotal(productosActu.getMontoTotal());
                aux.getO().setEstadoDePago(productosActu.isEstadoDePago());
                aux.getO().setProvedor(productosActu.getProvedor());
                
                JOptionPane.showMessageDialog(null, "Elemento actualizado.");
                return;
            }
            aux = aux.getAptSiguiente();
        }
        JOptionPane.showMessageDialog(null, "No se encontró la Orden en la lista.");
    }
    
}
