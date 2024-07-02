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
        Map<Integer,TipoArma> tiposArmas= new TreeMap<Integer,TipoArma>();


        int idUsuario=1;
        int idPersonaje=1;
        int idArma=1;
        int idRaza=1;
        int idClase=1;
        int idTiposArmas = 1;


        //Crear TipoArma tiposArmas
        tiposArmas.put(idTiposArmas++, new TipoArma("CuerpoACuerpo"));
        tiposArmas.put(idTiposArmas++, new TipoArma("Distancia"));
        tiposArmas.put(idTiposArmas++, new TipoArma("Baculo"));
        tiposArmas.put(idTiposArmas++, new TipoArma("Escudo"));
        //Crear Armas CuerpoACuerpo
        armas.put(idArma++, new Arma("Puños", 1, 1, 0, 1,tiposArmas.get(1)));
        armas.put(idArma++, new Arma("Espada Larga", 50, 20, 10, 25, tiposArmas.get(1)));
        armas.put(idArma++, new Arma("Mazo Pesado", 60, 30, 5, 50, tiposArmas.get(1)));
        armas.put(idArma++, new Arma("Hacha Doble", 55, 25, 5, 30, tiposArmas.get(1)));
        armas.put(idArma++, new Arma("Daga Ligera", 30, 10, 3, 15, tiposArmas.get(1)));
        //Crear Arnas Distancia
        armas.put(idArma++, new Arma("Arco Largo", 40, 10, 50, 25,tiposArmas.get(2)));
        armas.put(idArma++, new Arma("Ballesta", 60, 20, 50, 30,tiposArmas.get(2)));
        armas.put(idArma++, new Arma("Rifle", 80, 25, 80, 30,tiposArmas.get(2)));
        armas.put(idArma++, new Arma("Pistola", 30, 15, 80, 15,tiposArmas.get(2)));
        //Crear Armas Baculos
        armas.put(idArma++, new Arma("Bastón de Fuego", 70, 10, 80, 30,tiposArmas.get(3)));
        armas.put(idArma++, new Arma("Varita de Hielo", 60, 15, 80, 30,tiposArmas.get(3)));
        armas.put(idArma++, new Arma("Cetro de Trueno", 80, 20, 80, 30,tiposArmas.get(3)));
        armas.put(idArma++, new Arma("Bastón Curativo", 50, 25, 80, 30,tiposArmas.get(3)));
        //Crear Armas Escudos
        armas.put(idArma++, new Arma("Escudo Grande", 10, 50, 3, 80,tiposArmas.get(4)));
        armas.put(idArma++, new Arma("Escudo Pequeño", 5, 30, 3, 40,tiposArmas.get(4)));
        armas.put(idArma++, new Arma("Escudo Reforzado", 15, 60, 3, 120,tiposArmas.get(4)));
        armas.put(idArma++, new Arma("Escudo Mágico", 20, 70, 3, 60,tiposArmas.get(4)));

        //Crear Clases
        clases.put(idClase++, new Clase("Clerigo", 10, 15, 20, 25));
        clases.get(1).setTipoArma(tiposArmas.get(3));
        clases.get(1).setTipoArma(tiposArmas.get(4));
        clases.put(idClase++, new Clase("Mago", 5, 10, 30, 10));
        clases.get(2).setTipoArma(tiposArmas.get(3));
        clases.put(idClase++, new Clase("Guerrero", 25, 20, 5, 30));
        clases.get(3).setTipoArma(tiposArmas.get(1));
        clases.get(3).setTipoArma(tiposArmas.get(4));
        clases.put(idClase++, new Clase("Paladin", 20, 15, 10, 25));
        clases.get(4).setTipoArma(tiposArmas.get(1));
        clases.get(4).setTipoArma(tiposArmas.get(4));
        clases.put(idClase++, new Clase("Arquero", 15, 25, 10, 20));
        clases.get(5).setTipoArma(tiposArmas.get(2));
        clases.put(idClase++, new Clase("Asesino", 20, 30, 5, 15));
        clases.get(6).setTipoArma(tiposArmas.get(1));
        clases.get(6).setTipoArma(tiposArmas.get(2));

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

                int numeroPersonaje;
                int numeroArma = 0;
                boolean armaValida = false;

                personajes.forEach((key, Personaje) -> System.out.println(key+" - "+ Personaje.getNombre()));
                numeroPersonaje = Printer.validarInput(idPersonaje, "Ingrese el Numero del Personaje que desea equipar con un arma");

                armas.forEach((key, Arma) -> System.out.println(key+" - "+Arma.getNombre()));

                while (!armaValida){
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

                //Aca podemos agregar que se muestre la clase del personaje y los tipos de arma que usa

                combatiente1 = personajes.get(Printer.validarInput(idPersonaje, "Ingrese el Numero del primer combatiente"));

                combatiente2 = combatiente1;

                boolean combatientesIguales = true;
                while(combatientesIguales){
                    personajes.forEach((key, Personaje) -> System.out.println(key+" - "+( Personaje.getNombre()+", "+
                            Personaje.getRaza().getNombre()+", "+
                            Personaje.getClase().getNombre()+", Arma: "+
                            Personaje.getArma().getNombre())));

                    //Aca podemos agregar a que clase pertenece cada arma

                    combatiente2 = personajes.get(Printer.validarInput(idPersonaje, "Ingrese el Numero del segundo combatiente"));
                    if(combatiente1 != combatiente2){
                        combatientesIguales = false;
                    } else {
                        Printer.elegirOtroPersonaje(combatiente2);
                    }
                }

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

            } else if (intInput == 7){
                armas.forEach((key, Arma) -> System.out.println(Arma.getNombre()+", Ataque: "+
                        Arma.getPtsAtaque()+", Defensa: "+
                        Arma.getPtsDefensa()+", Peso: "+
                        Arma.getPeso()+", Alcance: "+
                        Arma.getAlcance()));

            }

            else if (intInput == 8){
                continue;
            } else{
                continue;
            }










        }


















    }
}