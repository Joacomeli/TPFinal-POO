import java.beans.PersistenceDelegate;
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

        int idUsuario=1;
        int idPersonaje=1;
        int idArma=1;
        int idRaza=1;
        int idClase=1;


        //Crear Armas CuerpoACuerpo
        armas.put(idArma++, new Arma("Puños", 1, 1, 0, 1,true,false,false,false));
        armas.put(idArma++, new Arma("Espada Larga", 50, 20, 10, 25,true,false,false,false));
        armas.put(idArma++, new Arma("Mazo Pesado", 60, 30, 5, 50,true,false,false,false));
        armas.put(idArma++, new Arma("Hacha Doble", 55, 25, 5, 30,true,false,false,false));
        armas.put(idArma++, new Arma("Daga Ligera", 30, 10, 3, 15,true,false,false,false));
        //Crear Arnas Distancia
        armas.put(idArma++, new Arma("Arco Largo", 40, 10, 50, 25,false,true,false,false));
        armas.put(idArma++, new Arma("Ballesta", 60, 20, 50, 30,false,true,false,false));
        armas.put(idArma++, new Arma("Rifle", 80, 25, 80, 30,false,true,false,false));
        armas.put(idArma++, new Arma("Pistola", 30, 15, 80, 15,false,true,false,false));
        //Crear Armas Baculos
        armas.put(idArma++, new Arma("Bastón de Fuego", 70, 10, 80, 30,false,false,true,false));
        armas.put(idArma++, new Arma("Varita de Hielo", 60, 15, 80, 30,false,false,true,false));
        armas.put(idArma++, new Arma("Cetro de Trueno", 80, 20, 80, 30,false,false,true,false));
        armas.put(idArma++, new Arma("Bastón Curativo", 50, 25, 80, 30,false,false,true,false));
        //Crear Armas Escudos
        armas.put(idArma++, new Arma("Escudo Grande", 10, 50, 3, 80,false,false,false,true));
        armas.put(idArma++, new Arma("Escudo Pequeño", 5, 30, 3, 40,false,false,false,true));
        armas.put(idArma++, new Arma("Escudo Reforzado", 15, 60, 3, 120,false,false,false,true));
        armas.put(idArma++, new Arma("Escudo Mágico", 20, 70, 3, 60,false,false,false,true));

        //Crear Clases
        clases.put(idClase++, new Clase("Clerigo", false, false, true, true, 10, 15, 20, 25));
        clases.put(idClase++, new Clase("Mago", false, false, true, false, 5, 10, 30, 10));
        clases.put(idClase++, new Clase("Guerrero", true, false, false, true, 25, 20, 5, 30));
        clases.put(idClase++, new Clase("Paladin", true, false, false, true, 20, 15, 10, 25));
        clases.put(idClase++, new Clase("Arquero", false, true, false, false, 15, 25, 10, 20));
        clases.put(idClase++, new Clase("Asesino", true, true, false, false, 20, 30, 5, 15));

        //Crear Razas
        razas.put(idRaza++, new Raza("Orco", 18, 10, 16, 8, 6));
        razas.put(idRaza++, new Raza("Gnomo", 8, 14, 10, 16, 12));
        razas.put(idRaza++, new Raza("Humano", 10, 10, 10, 10, 10));
        razas.put(idRaza++, new Raza("Elfo", 8, 16, 10, 14, 12));
        razas.put(idRaza++, new Raza("Elfo Drow", 8, 18, 8, 16, 14));
        razas.put(idRaza++, new Raza("Enano", 14, 10, 18, 8, 10));


        personajes.put(idPersonaje++, new Personaje("Matias",razas.get(1), clases.get(1),armas.get(1)));
        personajes.put(idPersonaje++, new Personaje("Matisa2",razas.get(2), clases.get(2), armas.get(1)));
        personajes.put(idPersonaje++, new Personaje("Matias3",razas.get(3), clases.get(4), armas.get(1)));
        personajes.put(idPersonaje++, new Personaje("Matias4",razas.get(4), clases.get(3), armas.get(1)));
        personajes.put(idPersonaje++, new Personaje("Matias5",razas.get(5), clases.get(2), armas.get(1)));




        //Consola
        System.out.println("Bienvenido al MMO");
        int intInput = 0;
        while (intInput != 7){

            intInput=Printer.seleccionMenu();

            if(intInput == 1){

                //Creacion de Personaje

                Scanner scanner = new Scanner(System.in);
                int numeroRaza;
                int numeroClase;
                String nombrePersonaje;

                System.out.println("Elija el nombre de su personaje");
                nombrePersonaje = scanner.next();

                razas.forEach((key, Raza) -> System.out.println(key+" - "+Raza.getNombre()));
                numeroRaza = Printer.validarInput(idRaza, "Ingrese el Numero de la raza que desea elegir");

                clases.forEach((key, Clase) -> System.out.println(key+" - "+Clase.getNombre()));
                numeroClase = Printer.validarInput(idClase, "Ingrese el Numero de la clase que desea elegir");

                personajes.put(idPersonaje++, new Personaje(nombrePersonaje,razas.get(numeroRaza), clases.get(numeroClase), armas.get(1)));

                // Siempre se equipa por defecto los puños

            } else if (intInput == 2) {

                //Listar Personajes

                personajes.forEach((key, Personaje) -> System.out.println(( Personaje.getNombre()+", "+
                        Personaje.getRaza().getNombre()+", "+
                        Personaje.getClase().getNombre()+", Arma: "+
                        Personaje.getArma().getNombre())));

            } else if (intInput == 3) {

                //Equipar arma

                int numeroPersonaje ;
                int numeroArma = 0;
                boolean armaValida = false;

                personajes.forEach((key, Personaje) -> System.out.println(key+" - "+ Personaje.getNombre()));
                numeroPersonaje = Printer.validarInput(idPersonaje, "Ingrese el Numero del Personaje que desea equipar con un arma");

                armas.forEach((key, Arma) -> System.out.println(key+" - "+Arma.getNombre()));

                while (armaValida==false){
                    numeroArma = Printer.validarInput(idArma, "Ingrese el Numero del Arma que desea equiparle");
                    armaValida = personajes.get(numeroPersonaje).validarArma(armas.get(numeroArma));
                    if (!armaValida){
                        System.out.println("Arma invalida para la clase del Personaje");
                        continue;
                    }else{
                        continue;
                    }
                }

                personajes.get(numeroPersonaje).setArma(armas.get(numeroArma));

            } else if (intInput == 4) {

                //Iniciar Combate

                Personaje combatiente1;
                Personaje combatiente2;

                personajes.forEach((key, Personaje) -> System.out.println(key+" - "+( Personaje.getNombre()+", "+
                        Personaje.getRaza().getNombre()+", "+
                        Personaje.getClase().getNombre()+", Arma: "+
                        Personaje.getArma().getNombre())));

                combatiente1 = personajes.get(Printer.validarInput(idPersonaje, "Ingrese el Numero del primer combatiente"));

                personajes.forEach((key, Personaje) -> System.out.println(key+" - "+( Personaje.getNombre()+", "+
                        Personaje.getRaza().getNombre()+", "+
                        Personaje.getClase().getNombre()+", Arma: "+
                        Personaje.getArma().getNombre())));

                combatiente2 = personajes.get(Printer.validarInput(idPersonaje, "Ingrese el Numero del segundo combatiente"));

                Combate.batalla(combatiente1, combatiente2);

            } else if (intInput == 5){

                // Listar Razas

                razas.forEach((key, Raza) -> System.out.println(
                        Raza.getNombre()+", Fuerza: "
                        +Raza.getFuerza()+", Destreza: "
                        +Raza.getDestreza()+", Constitucion: "
                        +Raza.getConstitucion()+", Inteligencia: "
                        +Raza.getInteligencia()+", Carisma: "
                        +Raza.getCarisma()
                ));


            } else if (intInput == 6){
                clases.forEach((key, Clase) -> System.out.println(Clase.getNombre()+", "+ Clase.arsenal()));

            }

            else if (intInput == 7){
                continue;
            } else{
                continue;
            }










        }


















    }
}