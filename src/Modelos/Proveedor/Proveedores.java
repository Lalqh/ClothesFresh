
package Modelos.Proveedor;

public class Proveedores {
    public int idProveedor;
    private String nombreProveedor, rfcProveedor, correoProveedor, numeroProveedor;

    public Proveedores(int idProveedor, String nombreProveedor, String rfcProveedor, String correoProveedor, String numeroProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.rfcProveedor = rfcProveedor;
        this.correoProveedor = correoProveedor;
        this.numeroProveedor = numeroProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
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

    public String getNumeroProveedor() {
        return numeroProveedor;
    }

    public void setNumeroProveedor(String numeroProveedor) {
        this.numeroProveedor = numeroProveedor;
    }
   
    
     
}