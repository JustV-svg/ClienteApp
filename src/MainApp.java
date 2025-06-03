import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        Random random = new Random();
        int idCounter = 1;
        while (true){
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido del cliente: ");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese el email: ");
            String email = scanner.nextLine();
            System.out.println("Ingrese el teléfono por favor: ");
            String telefono = scanner.nextLine();
            //Aqui empiezas a escribir el paso 3
            String codigo = generarCodigo(nombre, apellido, random);

            // Crear el cliente y agregarlo al ArrayList
            Cliente cliente = new Cliente(idCounter++, codigo, nombre, apellido, email, telefono);
            clientes.add(cliente);

            System.out.print("¿Desea registrar otro cliente? (s/n): ");
            String continuar = scanner.nextLine().toLowerCase();
            if (!continuar.equals("s")) {
                break;
            }
        }

        // Paso 4: Mostrar clientes usando Iterator
        System.out.println("\nClientes registrados:");
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            System.out.println(cliente);
        }

        scanner.close();
    }

    // Método auxiliar para generar el código del cliente
    private static String generarCodigo(String nombre, String apellido, Random random) {
        String parteNombre = nombre.length() >= 2 ? nombre.substring(0, 2).toUpperCase() : nombre.toUpperCase();
        String parteApellido = apellido.length() >= 2 ? apellido.substring(0, 2).toUpperCase() : apellido.toUpperCase();
        int numero = random.nextInt(900) + 100; // número entre 100 y 999
        return parteApellido + parteNombre + numero;
    }
}
