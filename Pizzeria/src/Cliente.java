
public class Cliente {

    private String rut;
    private String nombre;
    private int edad;
    private String direccion;
    private char tipoCliente;

    public Cliente() {
        rut = "";
        nombre = "";
        edad = 0;
        direccion = "";
        tipoCliente = 'N';
    }

    //constructor con parametro
    public Cliente(String rut, String nombre, int edad, String direccion, char tipoCliente) {
        setRut(rut);
        setNombre(nombre);
        setEdad(edad);
        setDireccion(direccion);
        setTipoCliente(tipoCliente);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() >= 3) {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 10) {
            this.edad = edad;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion.length() >= 5) {
            this.direccion = direccion;
        }
    }

    public String getTipoCliente() {
        if (tipoCliente == 'V') {
            return "Vip";
        } else if (tipoCliente == 'F') {
            return "Frecuente";
        } else if (tipoCliente == 'N') {
            return "Normal";
        } else {
            return "No Registrado";
        }
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

}
