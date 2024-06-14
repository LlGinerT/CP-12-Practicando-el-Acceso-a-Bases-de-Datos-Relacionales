import java.util.Scanner;

import Empresa.Empleado;
import Utils.InputUtils;

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("=== Gestión de Empleados ===");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Actualizar Empleado");
            System.out.println("3. Obtener Empleado por ID");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = InputUtils.leerEntero(scanner);

            switch (opcion) {
                case 1:
                    agregarEmpleado(empleado, scanner);
                    break;
                case 2:
                    actualizarEmpleado(empleado, scanner);
                    break;
                case 3:
                    obtenerEmpleadoPorId(empleado, scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void agregarEmpleado(Empleado empleado, Scanner scanner) {
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el puesto: ");
        String puesto = scanner.nextLine();
        System.out.print("Ingrese el salario: ");
        double salario = InputUtils.leerDouble(scanner);

        empleado.agregarEmpleado(nombre, apellido, puesto, salario);
        System.out.println("Empleado agregado exitosamente.");
    }

    private static void actualizarEmpleado(Empleado empleado, Scanner scanner) {
        System.out.print("Ingrese el ID del empleado a actualizar: ");
        int id = InputUtils.leerEntero(scanner);
        System.out.print("Ingrese el nuevo nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el nuevo apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el nuevo puesto: ");
        String puesto = scanner.nextLine();
        System.out.print("Ingrese el nuevo salario: ");
        double salario = InputUtils.leerDouble(scanner);

        empleado.actualizarEmpleado(id, nombre, apellido, puesto, salario);
        System.out.println("Empleado actualizado exitosamente.");
    }

    private static void obtenerEmpleadoPorId(Empleado empleado, Scanner scanner) {
        System.out.print("Ingrese el ID del empleado: ");
        int id = InputUtils.leerEntero(scanner);

        empleado.obtenerEmpleadoPorId(id);
    }
}