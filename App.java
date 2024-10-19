
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) throws Exception {
        TreeMap<String, String> contactos = new TreeMap<>();
        Scanner src = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Agenda de contactos");
            System.out.println("1- Agregar contacto");
            System.out.println("2- Mostrar todos los contactos");
            System.out.println("3- Buscar contacto");
            System.out.println("4- Eliminar contacto");
            System.out.println("5- Salir");
            System.out.println("Seleccione la opcion a elejir");
            opcion = src.nextInt();
            src.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del nuevo contacto");
                    String nombre = src.nextLine();
                    System.out.print("Ingrese el numero telefonico: \n+57 1");
                    String numero_telefono = src.nextLine();
                    if (numero_telefono.length() == 10) {
                        System.out.println("Numero de telefono adecuado");
                    } else {
                        System.out.println("Su numero de telefono debe contener 10 digitos");
                        System.out.print("Ingrese el numero telefonico: \n+57");
                        numero_telefono = src.nextLine();
                    }
                    contactos.put(nombre, numero_telefono);
                    System.out.println("Su contacto ha sido agendado");
                    break;
                case 2:
                    System.out.println("Esta es su lista de contactos");
                    for (Map.Entry<String, String> en : contactos.entrySet()) {
                        System.out.println("Nombre:" + en.getKey() + " Numero telefonico: " + en.getValue());
                    }
                    break;
                case 3:
                    System.out.println("Ingerse el nombre del contacto a buscar");
                    nombre = src.nextLine();
                    if (contactos.containsKey(nombre)) {
                        System.out.println("El telefono de su contacto es: " + contactos.get(nombre));
                    } else {
                        System.out.println("Contacto no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del contacto a eliminar: ");
                    nombre = src.nextLine();
                    if (contactos.containsKey(nombre)) {
                        contactos.remove(nombre);
                        System.out.println("Contacto eliminado correctamente");
                    } else {
                        System.out.println("Contacto no encotrado");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
        src.close();
    }
}
