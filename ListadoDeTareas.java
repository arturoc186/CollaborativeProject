
public class ListaDeTareas {
    public static void main(String[] args) {
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        int seleccion_tarea;

        do {
            System.out.println("--- Lista de Tareas ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Listar todas las tareas");
            System.out.println("4. Listar tareas pendientes");
            System.out.println("5. Listar tareas completadas");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
           seleccion_tarea = ConsoleReader.readInt();

            switch (seleccion_tarea) {
                case 1:
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = ConsoleReader.readString();
                    listaDeTareas.agregarTarea(descripcion);
                    break;
                case 2:
                    listaDeTareas.listarTareas();
                    System.out.print("Ingrese el número de la tarea a marcar como completada: ");
                    int indice = ConsoleReader.readInt();
                    listaDeTareas.marcarTareaComoCompletada(indice);
                    break;
                case 3:
                    listaDeTareas.listarTareas();
                    break;
                case 4:
                    listaDeTareas.listarTareasPendientes();
                    break;
                case 5:
                    listaDeTareas.listarTareasCompletadas();
                    break;
                case 6:
                    System.out.println("Has salido correctamente del programa. ¡Hasta pronto!");
                    break;
            }
        } while (seleccion_tarea!= 6);
    }

    public static void agregarTarea(String descripcion) {
        // Implementar
    }

    public static void marcarTareaComoCompletada(int indice) {
        // Implementar
    }

    public static void listarTareas() {
        // Implementar
    }

    public static void listarTareasPendientes() {
        // Implementar
    }
    
    public static void listarTareasCompletadas() {
        // Implementar
    }
}
