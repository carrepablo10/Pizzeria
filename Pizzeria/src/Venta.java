
public class Venta {

    private int precio;
    private String tamanio;
    private int cantidadIngredientes;
    private int propina;
    private Cliente cliente;

    public Venta() {
        precio = 0;
        tamanio = "";
        cantidadIngredientes = 0;
        propina = 0;
        cliente = new Cliente();
    }

    public Venta(int precio, String tamanio, int cantidadIngredientes, int propina, Cliente cliente) {
        setPrecio(precio);
        setTamanio(tamanio);
        setCantidadIngredientes(cantidadIngredientes);
        setPropina(propina);
        setCliente(cliente);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getCantidadIngredientes() {
        return cantidadIngredientes;
    }

    public void setCantidadIngredientes(int cantidadIngredientes) {

        if (cantidadIngredientes >= 2 && cantidadIngredientes <= 10) {
            this.cantidadIngredientes = cantidadIngredientes;
        }
    }

    public int getPropina() {
        return propina;
    }

    public void setPropina(int propina) {
        if (propina >= 0) {
            this.propina = propina;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void imprimir() {
        System.out.println("DATOS DEL CLIENTE");
        System.out.println("RUT            : " + getCliente().getRut());
        System.out.println("NOMBRE         : " + getCliente().getNombre());
        System.out.println("TIPO CLIENTE   : " + getCliente().getTipoCliente());
        System.out.println("DATOS DE LA VENTA");
        System.out.println("TAMAÑO         : " + getTamanio());
        System.out.println("INGREDIENTES   : " + getCantidadIngredientes());
        System.out.println("TOTAL A PAGAR  : " + totalAPagar());
    }

    public int precioPorTamanio(String tamanio) {

        int valor = 0;
        if (tamanio.equalsIgnoreCase("chica")) {
            valor = 1990;
        } else if (tamanio.equalsIgnoreCase("mediana")) {
            valor = 2990;
        } else if (tamanio.equalsIgnoreCase("familiar")) {
            valor = 3990;
        }
        return valor;
    }

    public int precioPorIngredientes(int cantidad) {
        int valor = cantidad * 690;
        return valor;
    }

    public double totalAPagar() {
        double total = getPrecio() + precioPorTamanio(getTamanio()) + precioPorIngredientes(getCantidadIngredientes()) + getPropina();
        if (getCliente().getTipoCliente().equals("Vip")) {
            total = total * 0.81;
        }
        if (getCliente().getEdad() >= 65) {
            total = total * 0.97;
        }

        return total;

    }
}
