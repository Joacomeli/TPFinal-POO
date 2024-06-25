import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Map<Integer,Clase> clases = new TreeMap<Integer,Clase>();
        Map<Integer,Personaje> personajes = new TreeMap<Integer,Personaje>();
        Map<Integer,Raza> razas = new TreeMap<Integer,Raza>();
        Map<Integer,Arma> armas = new TreeMap<Integer,Arma>();

        int idUsuario=0;
        int idPersonaje=0;


        //Crear Armas CuerpoACuerpo
        //Arma(String nombre, int ptsAtaque, int ptsDefensa, int alcance, int peso, String tipoArma)
        armas.put(1, new Arma("Espada Larga", 50, 20, 10, 25, "Cuerpo a Cuerpo"));
        armas.put(2, new Arma("Mazo Pesado", 60, 30, 5, 50, "Cuerpo a Cuerpo"));
        armas.put(3, new Arma("Hacha Doble", 55, 25, 5, 30, "Cuerpo a Cuerpo"));
        armas.put(4, new Arma("Daga Ligera", 30, 10, 3, 15, "Cuerpo a Cuerpo"));

        //Crear Arnas Distancia
        armas.put(5, new Arma("Arco Largo", 40, 10, 50, 25, "Distancia"));
        armas.put(6, new Arma("Ballesta", 60, 20, 50, 30, "Distancia"));
        armas.put(7, new Arma("Rifle", 80, 25, 80, 30, "Distancia"));
        armas.put(8, new Arma("Pistola", 30, 15, 80, 15, "Distancia"));

        //Crear Armas Baculos
        armas.put(9, new Arma("Bastón de Fuego", 70, 10, 80, 30, "Baculo"));
        armas.put(10, new Arma("Varita de Hielo", 60, 15, 80, 30, "Baculo"));
        armas.put(11, new Arma("Cetro de Trueno", 80, 20, 80, 30, "Baculo"));
        armas.put(12, new Arma("Bastón Curativo", 50, 25, 80, 30, "Baculo"));

        //Crear Armas Escudos
        armas.put(13, new Arma("Escudo Grande", 10, 50, 3, 80, "Escudo"));
        armas.put(14, new Arma("Escudo Pequeño", 5, 30, 3, 40, "Escudo"));
        armas.put(15, new Arma("Escudo Reforzado", 15, 60, 3, 120, "Escudo"));
        armas.put(16, new Arma("Escudo Mágico", 20, 70, 3, 60, "Escudo"));

        //Crear Clases
        clases.put(1, new Clase("Clerigo", false, false, true, true, 10, 15, 20, 25));
        clases.put(2, new Clase("Mago", false, false, true, false, 5, 10, 30, 10));
        clases.put(3, new Clase("Guerrero", true, false, false, true, 25, 20, 5, 30));
        clases.put(4, new Clase("Paladin", true, false, false, true, 20, 15, 10, 25));
        clases.put(5, new Clase("Arquero", false, true, false, false, 15, 25, 10, 20));
        clases.put(6, new Clase("Asesino", true, true, false, false, 20, 30, 5, 15));

        //Crear Razas
        razas.put(1, new Raza("Orco", 18, 10, 16, 8, 6));
        razas.put(2, new Raza("Gnomo", 8, 14, 10, 16, 12));
        razas.put(3, new Raza("Humano", 10, 10, 10, 10, 10));
        razas.put(4, new Raza("Elfo", 8, 16, 10, 14, 12));
        razas.put(5, new Raza("Elfo Drow", 8, 18, 8, 16, 14));
        razas.put(6, new Raza("Enano", 14, 10, 18, 8, 10));


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


        razas.forEach((key, Raza) -> System.out.println((key+ Raza.getConstitucion())));






        //Consola
        System.out.println("Bienvenido al MMO");
        int intInput = 0;
        while (intInput != 5){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese una acción(un numero)");
            System.out.println("1- Crear Personaje");
            System.out.println("2- Listar Personajes");
            System.out.println("3- Equipar armas a los personajes");
            System.out.println("4- Iniciar combate entre 2 personajes");
            System.out.println("5- Para terminar de jugar");
            intInput = sc.nextInt();


            if(intInput == 1){

                int numeroRaza;
                int numeroClase;
                String nombrePersonaje;

                System.out.println("Elija el nombre de su personaje");

                nombrePersonaje = sc.next();

                System.out.println("Seleccion el numero de la raza que le interesa");
                razas.forEach((key, Raza) -> System.out.println(key+" "+Raza.getNombre()));
                numeroRaza = sc.nextInt();

                System.out.println("Seleccion el numero de la clase que le interesa");
                clases.forEach((key, Clase) -> System.out.println(key+" "+Clase.getNombre()));
                numeroClase = sc.nextInt();

                personajes.put(idPersonaje++, new Personaje(nombrePersonaje,razas.get(numeroRaza), clases.get(numeroClase)));

            } else if (intInput == 2) {
                personajes.forEach((key, Personaje) -> System.out.println(( Personaje.getNombre()+ Personaje.getRaza().getNombre()+ Personaje.getClase().getNombre())));

            } else if (intInput == 3) {

               // Creador.equiparArma(personajes, armas);
            } else if (intInput == 4) {
                Personaje combatiente1;
                Personaje combatiente2;
                System.out.println("Selecciones Primer Combatiente");
                combatiente1=Creador.elegirPersonaje(personajes);
                System.out.println("Selecciones Segundo Combatiente");
                combatiente2=Creador.elegirPersonaje(personajes);
                Combate.batalla(combatiente1, combatiente2);
            } else if (intInput == 5){
                continue;
            } else {
                continue;
            }










        }


















    }
}