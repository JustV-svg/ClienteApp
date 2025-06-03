import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        Random random = new Random();
        int idCounter = 1;
        while (true) {
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido del cliente: ");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese el email: ");
            String email = scanner.nextLine();
            System.out.println("Ingrese el teléfono por favor: ");
            String telefono = scanner.nextLine();

        }
    }
}