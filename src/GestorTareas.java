import java.util.ArrayList;
import java.util.Scanner;

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
}



