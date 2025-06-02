import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        String continuar;

        do {
            System.out.println("Ingrese los datos del empleado:");

            System.out.print("ID: ");
            int id = scanner.nextInt();

            scanner.nextLine(); // Limpiar buffer

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Departamento: ");
            String departamento = scanner.nextLine();
        
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();

            Empleado emp = new Empleado(id, nombre, apellido, departamento, salario);
            empleados.add(emp);

            scanner.nextLine(); // Limpiar buffer

            System.out.print("¿Desea agregar otro empleado? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("\nLista de empleados registrados:");

        Iterator<Empleado> iterador = empleados.iterator();
        while (iterador.hasNext()) {
            Empleado e = iterador.next();
            System.out.println(e);
        }

        scanner.close();
    }
}



    