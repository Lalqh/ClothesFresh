
package Modelos.Empleados;

/**
 *
 * @author laloh
 */
public class Empleados {
    private String nombreEmpleado, apellidoPaterno, apellidoMaterno, 
            usuarioEmpleado, contrasenaEmpleado;
    private int ID;

    public Empleados(String nombreEmpleado, String apellidoPaterno, String apellidoMaterno, String usuarioEmpleado, String contrasenaEmpleado, int ID) {
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.usuarioEmpleado = usuarioEmpleado;
        this.contrasenaEmpleado = contrasenaEmpleado;
        this.ID = ID;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getUsuarioEmpleado() {
        return usuarioEmpleado;
    }

    public void setUsuarioEmpleado(String usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }

    public String getContrasenaEmpleado() {
        return contrasenaEmpleado;
    }

    public void setContrasenaEmpleado(String contrasenaEmpleado) {
        this.contrasenaEmpleado = contrasenaEmpleado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
