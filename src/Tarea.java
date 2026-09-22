import java.util.Scanner;

class Interfaz {
    public static void main(String[] args) {
        //Sigo con el bucle
        int opcion = 6;
        Scanner sc = new Scanner(System.in);
        GestorTareas gestorTareas = new GestorTareas();
        String nombre, descripcion, prioridad; // AÑADIDA VARIABLE PRIORIDAD
        int id;

        do {
            System.out.println("Elige la opción deseada");
            System.out.println("0. Salir");
            System.out.println("1. Añadir una tarea");
            System.out.println("2. Ver tareas pendientes");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Filtrar por prioridad"); // NUEVA OPCIÓN
            System.out.println("6. Guardar en archivo"); // NUEVA OPCIÓN
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

                        // NUEVO: Pedir prioridad
                        System.out.println("Escribe la prioridad (alta, media, baja):");
                        prioridad = sc.nextLine();

                        // MODIFICADO: Pasar 3 variables
                        Tarea tarea = new Tarea(nombre, descripcion, prioridad);
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
                    case 5 -> { // NUEVO CASO 5
                        System.out.println("Introduce la prioridad a filtrar:");
                        String filtro = sc.nextLine();
                        gestorTareas.filtrarPorPrioridad(filtro);
                    }
                    case 6 -> { // NUEVO CASO 6
                        gestorTareas.guardarTareasEnArchivo();
                    }
                }
            }
        } while (opcion != 0);
    }
}
