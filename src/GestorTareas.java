import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class GestorTareas {
    ArrayList<Tarea> tareas = new ArrayList();
    Scanner sc = new Scanner(System.in);
    private boolean encontrada = false;

    public GestorTareas() {
    }

    //Paso como parámetro la tarea
    public void anadirTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Tarea añadida correctamente");
    }

    //Método mostrar tareas pendientes
    public void mostrarPendientes() {
        for (Tarea t : tareas) {
            //Si no está marcada como completada la imprimo
            if (!t.isCompletada()) {
                System.out.println(t.toString());
            }
        }
    }

    //Método marcar como completada
    public void marcar() {
        System.out.println("¿Qué marcar como completada? Escribe el id: ");
        String id = sc.nextLine();
        for (Tarea tarea : tareas) {
            //Si la tarea coincide
            if (tarea.getId() == Integer.parseInt(id)) {
                //Marco como que la tarea está completada
                tarea.setCompletada(true);
            } else {
                System.out.println("Tarea no encontrada");
            }
        }
    }

    //Método tarea
    public void eliminar() {
        encontrada = false;
        System.out.println("¿Qué tarea deseas eliminar? Escribe el ID: ");
        int id_tarea = Integer.parseInt(sc.nextLine());
        tareas.remove(tareas.get(id_tarea));
    }

    //Enseñar tareas
    public void ensenar() {
        for (Tarea tarea : tareas) {
            System.out.println(tarea.toString());
        }
    }

    // --- NUEVAS FUNCIONES ---

    // Método para filtrar tareas por prioridad
    public void filtrarPorPrioridad(String filtro) {
        encontrada = false;
        System.out.println("--- Tareas con prioridad: " + filtro + " ---");
        for (Tarea tarea : tareas) {
            if (tarea.getPrioridad() != null && tarea.getPrioridad().equalsIgnoreCase(filtro)) {
                System.out.println(tarea.toString());
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("No se encontraron tareas con esa prioridad.");
        }
    }

    // Método para guardar el listado en un archivo de texto
    public void guardarTareasEnArchivo() {
        try {
            FileWriter writer = new FileWriter("tareas.txt");
            for (Tarea tarea : tareas) {
                writer.write(tarea.toString() + "\n");
            }
            writer.close();
            System.out.println("¡Listado guardado correctamente en el archivo 'tareas.txt'!");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al intentar guardar el archivo.");
        }
    }
}




