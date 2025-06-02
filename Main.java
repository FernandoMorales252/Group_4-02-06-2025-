import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        String continuar;

        do {
            System.out.println("Ingrese los datos del empleado:");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Departamento: ");
            String departamento = scanner.nextLine();

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // limpiar buffer

            Empleado emp = new Empleado(id, nombre, apellido, departamento, salario);
            empleados.add(emp);

            System.out.print("¿Desea agregar otro empleado? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nLista de empleados registrados:");

        // Usando Iterator (opcional)
        Iterator<Empleado> iterador = empleados.iterator();
        while (iterador.hasNext()) {
            Empleado e = iterador.next();
            e.mostrarInformacion();
        }

        scanner.close();
    }
}



    