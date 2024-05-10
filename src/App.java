import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar la cantidad de productos
        System.out.print("Ingrese la cantidad de productos a registrar: ");
        int cantidadProductos = leer.nextInt();
        leer.nextLine(); // limpia el escanner para que no comience en 2 al entrar al ciclo for

        // Crear arreglo para almacenar productos
        String[] productos = new String[cantidadProductos];

        // Registrar productos
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ": ");
            productos[i] = leer.nextLine();
        }

        // Buscar producto específico
        System.out.println("Ingrese el nombre del producto a buscar: ");
        String nombreProducto = leer.nextLine();

        buscarProducto(productos, nombreProducto);
        leer.close();
    }

    public static void buscarProducto(String[] productos, String nombreProducto) {
        boolean productoEncontrado = false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equalsIgnoreCase(nombreProducto)) {
                productoEncontrado = true;
                System.out.println("El producto " + productos[i] + " fue encontrado");
                break; // Detener la iteración una vez que se encuentra un producto
            }
        }
        if (!productoEncontrado) {
            System.out.println("Producto no encontrado");
        }
    }
}