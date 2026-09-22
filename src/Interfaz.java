class Tarea {
    //Atributos de la tarea
    private String nombre;
    private String descripcion;
    private String prioridad; // NUEVO ATRIBUTO
    private int id;
    private boolean completada = false;
    //Permite que puedan ir aumentando los ids
    //Al ponerlo static significa que lo comparten todas las instancias
    //Si no lo pongo el id siempre será 1
    private static int contador = 0;

    //Constructor
    //Aumentaré el valor del id cuando cree una nueva tarea
    public Tarea(String nombre, String descripcion, String prioridad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad; // NUEVO
        id = contador++;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    } // NUEVO

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    } // NUEVO

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public int getId() {
        return id;
    }

    //ToString

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad='" + prioridad + '\'' + // NUEVO
                ", id=" + id +
                ", completada=" + completada +
                '}';
    }
}

