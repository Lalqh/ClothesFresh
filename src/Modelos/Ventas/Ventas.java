
package Modelos.Ventas;

/**
 *
 * @author laloh
 */
public class Ventas {
    private int idVenta;
    private String producto, empleado, fechaDeVenta, metodoPago;
    private float TotalVenta;

    public Ventas(int idVenta, String producto, String empleado, String fechaDeVenta, String metodoPago, float TotalVenta) {
        this.idVenta = idVenta;
        this.producto = producto;
        this.empleado = empleado;
        this.fechaDeVenta = fechaDeVenta;
        this.metodoPago = metodoPago;
        this.TotalVenta = TotalVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getFechaDeVenta() {
        return fechaDeVenta;
    }

    public void setFechaDeVenta(String fechaDeVenta) {
        this.fechaDeVenta = fechaDeVenta;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public float getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(float TotalVenta) {
        this.TotalVenta = TotalVenta;
    }
}
