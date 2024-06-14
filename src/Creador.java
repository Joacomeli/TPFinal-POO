import java.util.Map;
import java.util.Objects;
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

    public static void equiparArma(Map<Integer, Personaje> personajes, Map<String, Arma> armas){
        Scanner sc = new Scanner(System.in);

        System.out.println("Personajes Disponibles (Ingrese nombre)");
        for (Map.Entry<Integer, Personaje> entry : personajes.entrySet()) {
            System.out.print( entry.getValue().getNombre() + "  ");
        }
        System.out.println();
        System.out.print("Personaje Elegido: ");
        String personajeSeleccionado= sc.nextLine();              //reads string
        System.out.println(personajeSeleccionado);

        System.out.println("Armas Disponibles (Ingrese nombre)");
        for (Map.Entry<String, Arma> entry : armas.entrySet()) {
            System.out.print( entry.getKey() + "  ");
        }
        System.out.println();
        System.out.print("Personaje Elegido: ");
        String armaSeleccionada= sc.nextLine();              //reads string
        System.out.println(armaSeleccionada);


        int num = 0;
        for (Map.Entry<Integer, Personaje> entry : personajes.entrySet()) {
            if(Objects.equals(personajeSeleccionado, entry.getValue().getNombre())){
                num = entry.getKey();
            }
        }
        System.out.println("numero" + num);

        if(personajes.get(num).getClase().isUsaCuerpoACuerpo() && Objects.equals(armas.get(armaSeleccionada).getTipoArma(), "Cuerpo a Cuerpo") ||
                personajes.get(num).getClase().isUsaDistancia() && Objects.equals(armas.get(armaSeleccionada).getTipoArma(), "Distancia") ||
                personajes.get(num).getClase().isUsaBaculos() && Objects.equals(armas.get(armaSeleccionada).getTipoArma(), "Baculo") ||
                personajes.get(num).getClase().isUsaEscudos() && Objects.equals(armas.get(armaSeleccionada).getTipoArma(), "Escudo")){
            personajes.get(num).setArma(armas.get(armaSeleccionada));
            System.out.println(personajes.get(num).getNombre());
            System.out.println(personajes.get(num).getArma().getNombre());
        } else {
            System.out.println("Arma no disponible para esa clase");
        }



    }

}
