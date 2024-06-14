import java.util.Map;
import java.util.Scanner;

public class Creador {

    public static Personaje CrearPersonaje(Map<String, Raza> razas, Map<String, Clase> clases) {
        Scanner sc = new Scanner(System.in);

        String nombrePersonaje;
        String clase = null;
        String raza = null;

        //Elegir Nombre
        System.out.println("Crear Nuevo Personaje");
        System.out.print("Ingrese Nombre del personaje: ");
        nombrePersonaje = sc.nextLine();

        //Elegir Clase
        System.out.println("Clases Disponibles (Ingrese nombre)");
        for (Map.Entry<String, Clase> entry : clases.entrySet()) {
            System.out.print( entry.getKey() + "  ");
        }
        System.out.println();
        System.out.print("Ingrese Clase del personaje: ");
        clase = sc.nextLine();

        //Elegir Raza
        System.out.println("Razas Disponibles (Ingrese nombre)");
        for (Map.Entry<String, Raza> entry : razas.entrySet()) {
            System.out.print( entry.getKey() + "  ");
        }
        System.out.println();
        System.out.print("Ingrese Raza del personaje: ");
        raza= sc.nextLine();

        System.out.println(nombrePersonaje + " - " + clases.get(clase).getNombre() + " - " + razas.get(raza).getNombre());
        //personajes.put(idPersonaje++, new Personaje("Pepito", razas.get("Orco"),clases.get("Asesino")));

        return new Personaje(nombrePersonaje, razas.get(raza), clases.get(clase));
    }



}
