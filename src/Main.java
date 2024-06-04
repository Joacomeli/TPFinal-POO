public class Main {
    public static void main(String[] args) {
        //Crear Armas
        Arma espadaLarga = new Arma();
        espadaLarga.Arma("Espada Larga", 100, 100);
        Arma katana = new Arma();
        katana.Arma("Katana", 100, 100);
        Arma espadaRopera = new Arma();
        espadaRopera.Arma("Espada Ropera", 100, 100);
        Arma hacha = new Arma();
        hacha.Arma("Hacha", 100, 100);
        Arma arco = new Arma();
        arco.Arma("Arco", 100, 100);
        Arma ballesta = new Arma();
        ballesta.Arma("Ballesta", 100, 100);
        Arma mosquete = new Arma();
        mosquete.Arma("Mosquete", 100, 100);
        Arma trabuco = new Arma();
        trabuco.Arma("Trabuco", 100, 100);
        Arma baston = new Arma();
        baston.Arma("Baston", 100, 100);

        //Crear Clases
        Clase espadachin = new Clase();
        espadachin.Clase("Espadachin");
        espadachin.agregarArma(espadaLarga);
        espadachin.agregarArma(katana);
        espadachin.agregarArma(espadaRopera);
        Clase barbaro = new Clase();
        barbaro.Clase("Barbaro");
        barbaro.agregarArma(hacha);
        barbaro.agregarArma(espadaLarga);
        Clase curandero = new Clase();
        curandero.Clase("Curandero");
        curandero.agregarArma(baston);
        Clase arquero = new Clase();
        arquero.Clase("Arquero");
        arquero.agregarArma(arco);
        arquero.agregarArma(ballesta);
        Clase mago = new Clase();
        mago.Clase("Mago");
        mago.agregarArma(baston);
        Clase pistolero = new Clase();
        pistolero.Clase("Pistolero");
        pistolero.agregarArma(trabuco);
        pistolero.agregarArma(mosquete);
        Clase guerrero = new Clase();
        guerrero.Clase("Guerrero");
        guerrero.agregarArma(hacha);
        guerrero.agregarArma(espadaLarga);

        //Crear Razas
        Raza humano = new Raza();
        humano.setRaza("Humano");
        Raza gnomo = new Raza();
        gnomo.setRaza("Gnomo");
        Raza elfo = new Raza();
        elfo.setRaza("Elfo");
        Raza enano = new Raza();
        enano.setRaza("Enano");
        Raza orco = new Raza();
        orco.setRaza("Orco");
        Raza zombie = new Raza();
        zombie.setRaza("Zombie");

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