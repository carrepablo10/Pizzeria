
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 1;
        Cliente cliente1 = new Cliente();
        Venta venta1 = new Venta();

        while (opcion >= 1 && opcion <= 5) {
            System.out.println("***OPCIONES***");
            System.out.println("1)	Ingresar cliente.");
            System.out.println("2)	Ingresar venta.");
            System.out.println("3)	Calcular total de venta.");
            System.out.println("4)	Ver datos de la venta");
            System.out.println("5)	Salir");
            opcion = Integer.parseInt(bf.readLine());

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese rut");
                    cliente1.setRut(bf.readLine());
                    System.out.println("\nIngrese nombre");
                    cliente1.setNombre(bf.readLine());
                    System.out.println("\nIngrese edad");
                    cliente1.setEdad(Integer.parseInt(bf.readLine()));
                    System.out.println("\nIngrese dirección");
                    cliente1.setDireccion(bf.readLine());
                    System.out.println("\nIngrese tipo cliente");
                    cliente1.setTipoCliente(bf.readLine().charAt(0));
                    break;
                case 2:
                    venta1.setPrecio(500);
                    System.out.println("\nIngrese tamaño de la pizza (Chica/Mediana/Familiar)");
                    venta1.setTamanio(bf.readLine());
                    System.out.println("\nIngrese cantidad de ingredientes");
                    venta1.setCantidadIngredientes(Integer.parseInt(bf.readLine()));
                    System.out.println("\nIngrese propina");
                    venta1.setPropina(Integer.parseInt(bf.readLine()));
                    venta1.setCliente(cliente1);
                    break;

                case 3:
                    System.out.println("El total a pagar es: $" + venta1.totalAPagar());
                    break;
                case 4:
                    venta1.imprimir();
                    break;
                case 5:
                    System.exit(0);

            }
        }

    }

}
