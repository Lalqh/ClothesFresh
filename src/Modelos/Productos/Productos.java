
package Modelos.Productos;

/**
 *
 * @author laloh
 */
public class Productos {

    private int stockProducto;
    private int id;
    private float precio;
    private String nombreProducto, descripcion, talla, categoria;

    public Productos(int stockProducto, int id, float precio, String nombreProducto, String descripcion, String talla, String categoria) {
        this.stockProducto = stockProducto;
        this.id = id;
        this.precio = precio;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.talla = talla;
        this.categoria = categoria;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
