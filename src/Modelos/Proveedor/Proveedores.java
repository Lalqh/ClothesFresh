
package Modelos.Proveedor;

/**
 *
 * @author laloh
 */
public class Proveedores {
    private int idProveedor, numeroProveedor;
    private String nombreProveedor, rfcProveedor, correoProveedor;

    public Proveedores(int idProveedor, int numeroProveedor, String nombreProveedor, String rfcProveedor, String correoProveedor) {
        this.idProveedor = idProveedor;
        this.numeroProveedor = numeroProveedor;
        this.nombreProveedor = nombreProveedor;
        this.rfcProveedor = rfcProveedor;
        this.correoProveedor = correoProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getNumeroProveedor() {
        return numeroProveedor;
    }

    public void setNumeroProveedor(int numeroProveedor) {
        this.numeroProveedor = numeroProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getRfcProveedor() {
        return rfcProveedor;
    }

    public void setRfcProveedor(String rfcProveedor) {
        this.rfcProveedor = rfcProveedor;
    }

    public String getCorreoProveedor() {
        return correoProveedor;
    }

    public void setCorreoProveedor(String correoProveedor) {
        this.correoProveedor = correoProveedor;
    }
    
    
    
}
