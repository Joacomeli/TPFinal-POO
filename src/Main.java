public class Main {
    public static void main(String[] args) {
        //Crear Armas CuerpoACuerpo
        CuerpoACuerpo EspadaLarga = new CuerpoACuerpo((short) 2.5, (short) 5, "Espada Larga", 50, 20, 15);
        CuerpoACuerpo MazoPesado = new CuerpoACuerpo((short) 3, (short) 2, "Mazo Pesado", 60, 30, 25);
        CuerpoACuerpo HachaDoble = new CuerpoACuerpo((short) 4, (short) 3, "Hacha Doble", 55, 25, 20);
        CuerpoACuerpo DagaLigera = new CuerpoACuerpo((short) 1, (short) 1, "Daga Ligera", 30, 10, 5);


        //Crear Arnas Distancia
        Distancia ArcoLargo = new Distancia(100, (short) 2, "Arco Largo", 40, 10, 15);
        Distancia Ballesta = new Distancia(80, (short) 3, "Ballesta", 60, 20, 30);
        Distancia Rifle = new Distancia(200, (short) 1, "Rifle", 80, 25, 10);
        Distancia Pistola = new Distancia(50, (short) 5, "Pistola", 30, 15, 5);

        //Crear Armas Baculos
        Baculos BastonDeFuego = new Baculos((short) 5, (short) 3, "Bastón de Fuego", 70, 10, 12);
        Baculos VaritaDeHielo = new Baculos((short) 4, (short) 4, "Varita de Hielo", 60, 15, 8);
        Baculos CetroDeTrueno = new Baculos((short) 6, (short) 2, "Cetro de Trueno", 80, 20, 14);
        Baculos BastonCurativo = new Baculos((short) 3, (short) 5, "Bastón Curativo", 50, 25, 10);

        //Crear Armas Escudos
        Escudos EscudoGrande = new Escudos((short) 5, "Escudo Grande", 10, 50, 20);
        Escudos EscudoPequeno = new Escudos((short) 3, "Escudo Pequeño", 5, 30, 10);
        Escudos EscudoReforzado = new Escudos((short) 6, "Escudo Reforzado", 15, 60, 25);
        Escudos EscudoMagico = new Escudos((short) 7, "Escudo Mágico", 20, 70, 15);



        //Crear Clases
        Clase Clerigo = new Clase("Clerigo", false, false, true, true, 10, 15, 20, 25);
        Clase Mago = new Clase("Mago", false, false, true, false, 5, 10, 30, 10);
        Clase Guerrero = new Clase("Guerrero", true, false, false, true, 25, 20, 5, 30);
        Clase Paladin = new Clase("Paladin", true, false, false, true, 20, 15, 10, 25);
        Clase Arquero = new Clase("Arquero", false, true, false, false, 15, 25, 10, 20);
        Clase Asesino = new Clase("Asesino", true, true, false, false, 20, 30, 5, 15);




        //Crear Razas
        Raza Orco = new Raza("Orco", 18, 10, 16, 8, 6);
        Raza Gnomo = new Raza("Gnomo", 8, 14, 10, 16, 12);
        Raza Humano = new Raza("Humano", 10, 10, 10, 10, 10);
        Raza Elfo = new Raza("Elfo", 8, 16, 10, 14, 12);
        Raza ElfoDrow = new Raza("Elfo Drow", 8, 18, 8, 16, 14);
        Raza Enano = new Raza("Enano", 14, 10, 18, 8, 10);



        //Crear Usuario
        Usuario u1 = new Usuario();
        u1.Usuario("Marcos", 1111);
        u1.crearPersonaje("Mike", humano, arquero, arco);
        u1.crearPersonaje("Jordan", enano, pistolero, arco);
        u1.crearPersonaje("Roman", zombie, espadachin, katana);
        u1.imprimirPersonaje();

        /*  Razas
        Humano
        Gnomo
        Elfo
        Enano
        Orco
        Zombie
         */

        /*  Clases
        -Espadachin
        -Barbaro
        -Guerrero
        -Mago
        -Curandero
        -Pistolero
        -Arquero
         */

        /*  Armas
        -Espada Larga
        -Katana
        -Espada Ropera
        -Hacha
        -Arco
        -Ballesta
        -Mosquete
        -Trabuco
        -Bastón de Curación
        -Baston de Fuego
        -Baston de Agua
        -Baston de Tierra
         */









    }
}