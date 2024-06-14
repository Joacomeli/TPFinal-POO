import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String,Clase> clases = new TreeMap<String,Clase>();
        Map<Integer,Personaje> personajes = new TreeMap<Integer,Personaje>();
        Map<String,Raza> razas = new TreeMap<String,Raza>();
        Map<String,Arma> armas = new TreeMap<String,Arma>();

        int idUsuario=0;
        int idPersonaje=0;


        //Crear Armas CuerpoACuerpo
        //Arma(String nombre, int ptsAtaque, int ptsDefensa, int alcance, int peso, String tipoArma)
        armas.put("Espada Larga", new Arma("Espada Larga", 50, 20, 10, 25, "Cuerpo a Cuerpo"));
        armas.put("Mazo Pesado", new Arma("Mazo Pesado", 60, 30, 5, 50, "Cuerpo a Cuerpo"));
        armas.put("Hacha Doble", new Arma("Hacha Doble", 55, 25, 5, 30, "Cuerpo a Cuerpo"));
        armas.put("Daga Ligera", new Arma("Daga Ligera", 30, 10, 3, 15, "Cuerpo a Cuerpo"));

        //Crear Arnas Distancia
        armas.put("Arco Largo", new Arma("Arco Largo", 40, 10, 50, 25, "Distancia"));
        armas.put("Ballesta", new Arma("Ballesta", 60, 20, 50, 30, "Distancia"));
        armas.put("Rifle", new Arma("Rifle", 80, 25, 80, 30, "Distancia"));
        armas.put("Pistola", new Arma("Pistola", 30, 15, 80, 15, "Distancia"));

        //Crear Armas Baculos
        armas.put("Bastón de Fuego", new Arma("Bastón de Fuego", 70, 10, 80, 30, "Baculo"));
        armas.put("Varita de Hielo", new Arma("Varita de Hielo", 60, 15, 80, 30, "Baculo"));
        armas.put("Cetro de Trueno", new Arma("Cetro de Trueno", 80, 20, 80, 30, "Baculo"));
        armas.put("Bastón Curativo", new Arma("Bastón Curativo", 50, 25, 80, 30, "Baculo"));

        //Crear Armas Escudos
        armas.put("Escudo Grande", new Arma("Escudo Grande", 10, 50, 3, 80, "Escudo"));
        armas.put("Escudo Pequeño", new Arma("Escudo Pequeño", 5, 30, 3, 40, "Escudo"));
        armas.put("Escudo Reforzado", new Arma("Escudo Reforzado", 15, 60, 3, 120, "Escudo"));
        armas.put("Escudo Mágico", new Arma("Escudo Mágico", 20, 70, 3, 60, "Escudo"));

        //Crear Clases
        clases.put("Clerigo", new Clase("Clerigo", false, false, true, true, 10, 15, 20, 25));
        clases.put("Mago", new Clase("Mago", false, false, true, false, 5, 10, 30, 10));
        clases.put("Guerrero", new Clase("Guerrero", true, false, false, true, 25, 20, 5, 30));
        clases.put("Paladin", new Clase("Paladin", true, false, false, true, 20, 15, 10, 25));
        clases.put("Arquero", new Clase("Arquero", false, true, false, false, 15, 25, 10, 20));
        clases.put("Asesino", new Clase("Asesino", true, true, false, false, 20, 30, 5, 15));

        //Crear Razas
        razas.put("Orco", new Raza("Orco", 18, 10, 16, 8, 6));
        razas.put("Gnomo", new Raza("Gnomo", 8, 14, 10, 16, 12));
        razas.put("Humano", new Raza("Humano", 10, 10, 10, 10, 10));
        razas.put("Elfo", new Raza("Elfo", 8, 16, 10, 14, 12));
        razas.put("Elfo Drow", new Raza("Elfo Drow", 8, 18, 8, 16, 14));
        razas.put("Enano", new Raza("Enano", 14, 10, 18, 8, 10));


        /*
        personajes.put(idPersonaje, new Personaje("Pepito", razas.get("Orco"),clases.get("Asesino")));
        idPersonaje++;
        //System.out.println(personajes.get(0).getNombre());

        personajes.get(0).agregarArma(baculos.get("Bastón Curativo"));
        try{
            System.out.println(personajes.get(0).getArmaEquipada().getNombre());
        } catch (NullPointerException e){
            System.out.println("El personaje no tiene armas");
        } */






        //Consola
        System.out.println("Bienvenido al MMO");
        int accion = 0;
        while (accion != 5){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese una acción(un numero)");
            System.out.println("1- Crear Personaje");
            System.out.println("2- Listar Personajes");
            System.out.println("3- Equipar armas a los personajes");
            System.out.println("4- Iniciar combate entre 2 personajes");
            System.out.println("5- Para terminar de jugar");
            accion = sc.nextInt();


            if(accion == 1){
                System.out.println("");
                personajes.put(idPersonaje++, Creador.CrearPersonaje( razas, clases));
            } else if (accion == 2) {
                for (Map.Entry<Integer, Personaje> entry : personajes.entrySet()) {
                    try {
                        System.out.println(entry.getValue().getNombre() + " - " + entry.getValue().getClase().getNombre() + " - " + entry.getValue().getRaza().getNombre() + " - " + entry.getValue().getArma().getNombre());

                    } catch(NullPointerException e){
                        System.out.println("Algunos personajes no tienen arma disponble, Equipale un arma");
                    }
                }
            } else if (accion == 3) {
                Creador.equiparArma(personajes, armas);
            } else if (accion == 4) {
                Personaje p1 = Creador.elegirPersonaje(personajes);
                Personaje p2 = Creador.elegirPersonaje(personajes);
                Combate.batalla(p1, p2);
            } else if (accion == 5){
                accion = 5;
            } else {
                accion = 0;
            }










        }


















    }
}