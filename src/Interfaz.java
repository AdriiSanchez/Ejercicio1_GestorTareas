import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        //Mientras que la opcion no sea = 0
        //Sigo con el bucle
        int opcion = 6;
        Scanner sc = new Scanner(System.in);
        GestorTareas gestorTareas = new GestorTareas();
        String nombre, descripcion;
        int id;

        do {
            System.out.println("Elige la opción deseada");
            System.out.println("0. Salir");
            System.out.println("1. Añadir una tarea");
            System.out.println("2. Ver tareas pendientes");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            //Para evitar errores le hago casting
            opcion = Integer.parseInt(sc.nextLine());
            //Si la opción no es 0
            if (opcion != 0) {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Escribe el nombre del tarea");
                        nombre = sc.nextLine();
                        System.out.println("Escribe la descripción de la tarea");
                        descripcion = sc.nextLine();
                        Tarea tarea = new Tarea(nombre, descripcion);
                        //Al gestor tareas le pido que me añada la tarea
                        gestorTareas.anadirTarea(tarea);
                    }
                    case 2 -> gestorTareas.mostrarPendientes();
                    case 3 -> {
                        gestorTareas.ensenar();
                        gestorTareas.marcar();
                    }
                    case 4 -> {
                        gestorTareas.ensenar();
                        gestorTareas.eliminar();
                    }
                }
            }
        } while (opcion != 0);
    }
}

