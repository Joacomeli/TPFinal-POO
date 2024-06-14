import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static Personaje CrearPersonaje( Map<String, Raza> razas, Map<String, Clase> clases) {
        Scanner sc = new Scanner(System.in);

        String nombrePersonaje;
        String clase = null;
        String raza = null;

        //Elegir Nombre
        System.out.println("Crear Nuevo Personaje");
        System.out.print("Ingrese Nombre del personaje: ");
        nombrePersonaje = sc.nextLine();

        int sumador = 0;
        //Elegir Clase
        System.out.println("Clases Disponibles (Ingrese nombre)");
        for (Map.Entry<String, Clase> entry : clases.entrySet()) {
            System.out.print(sumador + "-" + entry.getKey() + "  ");
            sumador++;
        }
        System.out.println();
        System.out.print("Ingrese Clase del personaje: ");
        clase = sc.nextLine();

        //Elegir Raza
        System.out.println("Razas Disponibles (Ingrese nombre)");
        sumador = 0;
        for (Map.Entry<String, Raza> entry : razas.entrySet()) {
            System.out.print(sumador + "-" + entry.getKey() + "  ");
            sumador++;
        }
        System.out.println();
        System.out.print("Ingrese Raza del personaje: ");
        raza= sc.nextLine();

        System.out.println(nombrePersonaje + " - " + clases.get(clase).getNombre() + " - " + razas.get(raza).getNombre());
        //personajes.put(idPersonaje++, new Personaje("Pepito", razas.get("Orco"),clases.get("Asesino")));

        return new Personaje(nombrePersonaje, razas.get(raza), clases.get(clase));
    }

    public static void main(String[] args) {

        Map<String,Clase> clases = new TreeMap<String,Clase>();
        Map<Integer,Personaje> personajes = new TreeMap<Integer,Personaje>();
        Map<String,Raza> razas = new TreeMap<String,Raza>();
        Map<String,CuerpoACuerpo> cuerpoACuerpo = new TreeMap<String,CuerpoACuerpo>();
        Map<String,Distancia> distancia = new TreeMap<String,Distancia>();
        Map<String,Baculos> baculos = new TreeMap<String,Baculos>();
        Map<String,Escudos> escudos = new TreeMap<String,Escudos>();

        int idUsuario=0;
        int idPersonaje=0;


        //Crear Armas CuerpoACuerpo
        cuerpoACuerpo.put("Espada Larga", new CuerpoACuerpo((short) 2.5, (short) 5, "Espada Larga", 50, 20, 15));
        cuerpoACuerpo.put("Mazo Pesado", new CuerpoACuerpo((short) 3, (short) 2, "Mazo Pesado", 60, 30, 25));
        cuerpoACuerpo.put("Hacha Doble", new CuerpoACuerpo((short) 4, (short) 3, "Hacha Doble", 55, 25, 20));
        cuerpoACuerpo.put("Daga Ligera", new CuerpoACuerpo((short) 1, (short) 1, "Daga Ligera", 30, 10, 5));

        //Crear Arnas Distancia
        distancia.put("Arco Largo", new Distancia(100, (short) 2, "Arco Largo", 40, 10, 15));
        distancia.put("Ballesta", new Distancia(80, (short) 3, "Ballesta", 60, 20, 30));
        distancia.put("Rifle", new Distancia(200, (short) 1, "Rifle", 80, 25, 10));
        distancia.put("Pistola", new Distancia(50, (short) 5, "Pistola", 30, 15, 5));

        //Crear Armas Baculos
        baculos.put("Bastón de Fuego", new Baculos((short) 5, (short) 3, "Bastón de Fuego", 70, 10, 12));
        baculos.put("Varita de Hielo", new Baculos((short) 4, (short) 4, "Varita de Hielo", 60, 15, 8));
        baculos.put("Cetro de Trueno", new Baculos((short) 6, (short) 2, "Cetro de Trueno", 80, 20, 14));
        baculos.put("Bastón Curativo", new Baculos((short) 3, (short) 5, "Bastón Curativo", 50, 25, 10));

        //Crear Armas Escudos
        escudos.put("Escudo Grande", new Escudos((short) 5, "Escudo Grande", 10, 50, 20));
        escudos.put("Escudo Pequeño", new Escudos((short) 3, "Escudo Pequeño", 5, 30, 10));
        escudos.put("Escudo Reforzado", new Escudos((short) 6, "Escudo Reforzado", 15, 60, 25));
        escudos.put("Escudo Mágico", new Escudos((short) 7, "Escudo Mágico", 20, 70, 15));

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
            System.out.println("El personaje no tiene arma");
        } */





        //Consola
        System.out.println("Bienvenido al MMO");
        int accion = 0;
        while (accion != 5){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese una acción(un numero)");
            System.out.println("1- Crear Personaje");
            System.out.println("2- Listar Personajes");
            System.out.println("3- Agregar armas a los personajes");
            System.out.println("4- Iniciar combate entre 2 personajes");
            System.out.println("5- Para terminar de jugar");
            accion = sc.nextInt();


            if(accion == 1){
                personajes.put(idPersonaje++, CrearPersonaje( razas, clases));
            } else if (accion == 2) {
                for (Map.Entry<Integer, Personaje> entry : personajes.entrySet()) {
                    System.out.println(entry.getValue().getNombre() + "  ");
                }
            } else if (accion == 3) {
                System.out.println("Accion 3");
            } else if (accion == 4) {
                System.out.println("Accion 4");
            } else if (accion == 5){
                accion = 5;
            } else {
                accion = 0;
            }










        }


















    }
}