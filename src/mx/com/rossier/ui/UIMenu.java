package mx.com.rossier.ui;

import mx.com.rossier.domain.empleado.Empleado;
import mx.com.rossier.domain.empleado.Puesto;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Empleado> empleadoArrayList = new ArrayList<>();

    public static void mostrarMenu() {
        int opcion;
        System.out.println("=====================");
        System.out.println("1.- Registrar empleado");
        System.out.println("2.- Borrar empleado");
        System.out.println("3.- Actualizar datos de un empleado");
        System.out.println("4.- Buscar empleado");
        System.out.println("5.- Salir");
        System.out.println("=====================");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> registrarEmpleado();
            case 2 -> borrarEmpleado();
            case 3 -> actualizarDatos();
            case 4 -> buscarEmpleado();
            case 5 -> System.exit(0);
            default -> System.out.println("Valor no valido");
        }
    }

    private static void registrarEmpleado() {
        Empleado empleado = leerDatos();
        empleadoArrayList.add(empleado);
        mostrarMenu();
    }

    private static void borrarEmpleado() {
        System.out.println("Ingresa el id del empleadoa  buscar");
        int id = sc.nextInt();
        for (Empleado empleado : empleadoArrayList){
            if (empleado.getIdEmpleado() == id){
                empleadoArrayList.remove(empleado);
            }else{
                System.out.println("No se encontro");
            }
        }
        mostrarMenu();
    }

    private static void actualizarDatos() {
        for (Empleado empleado : empleadoArrayList) {
            System.out.println(empleado.toString());
        }
        System.out.println("Ingrese el id del empleado a actualizar");
        int id = sc.nextInt();
        for (Empleado empleado : empleadoArrayList){
            if (empleado.getIdEmpleado() == id){
                Empleado miEmpleado = leerDatos();
                empleadoArrayList.remove(empleado);
                empleadoArrayList.add(miEmpleado);
            }else{
                System.out.println("El empleado no se encontro");
            }
        }

        mostrarMenu();
    }

    private static void buscarEmpleado() {
        System.out.println("Ingresa el id del empleadoa  buscar");
        int id = sc.nextInt();
        for (Empleado empleado : empleadoArrayList){
            if (empleado.getIdEmpleado() == id){
                System.out.println(empleado);
            }else{
                System.out.println("No se encontro");
            }
        }
        mostrarMenu();
    }

    private static Empleado leerDatos() {
        System.out.println("Favor de ingresar nombre del empleado");
        String nombre_empleado = sc.next();
        System.out.println("Favor de ingresar la edad del empleado");
        int edad = sc.nextInt();
        System.out.println("\nFavor de ingresar el puesto desempeñado");
        Puesto Puesto_trabajo = Puesto.valueOf(sc.next());
        System.out.println("\nFavor de ingresar el ID del empleado");
        int id_empledado = sc.nextInt();
        System.out.println("\nFavor de ingresar el departamento que le fué asignado");
        String departamento = sc.next();
        System.out.println("Favor de ingresar la jornada que le fue asignada");
        String jornada_laboral = sc.next();
        System.out.println("Favor de ingresar el gerente encargado de su departamento");
        String Gerente_responsable = sc.nextLine();
        sc.nextLine();
        return new Empleado(id_empledado, nombre_empleado, edad, Puesto_trabajo, departamento,
                jornada_laboral, Gerente_responsable);
    }
}
