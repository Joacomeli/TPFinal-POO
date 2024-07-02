import java.util.Random;

public class Combate {

    private static boolean golpeConecta (int destrezaAtacante, int destrezaDefensor){
        Random r = new Random();
        if (r.nextInt(1,20)+destrezaAtacante>r.nextInt(1,20)+destrezaDefensor){
            return true;
        }else return false;
    }


    public static void batalla (Personaje personaje1, Personaje personaje2){

        Random r = new Random();
        Personaje atacante;
        Personaje defensor;

        if (personaje1.getRaza().getDestreza() > personaje2.getRaza().getDestreza()){
            atacante = personaje1;
            defensor = personaje2;
        }else{
            atacante = personaje2;
            defensor = personaje1;
        }

        Printer.primerAtaque(atacante);

        while (personaje1.getVida()>0 && personaje2.getVida()>0){

            Personaje pivot;

            Printer.vidaPersonajes(personaje1,personaje2);

            if (golpeConecta(atacante.getRaza().getDestreza(),defensor.getRaza().getDestreza())){
                int dano = (r.nextInt(1,20)+atacante.getArma().getPtsAtaque()+atacante.getRaza().getFuerza()
                        -r.nextInt(1,20)+defensor.getArma().getPtsDefensa());

                Printer.golpeConecta(atacante,defensor,dano);

                defensor.setVida(defensor.getVida()-dano);
                pivot = atacante;
                atacante = defensor;
                defensor = pivot;

            } else {
                Printer.golpeFalla(atacante);
            }
        }
        Printer.vidaPersonajes(personaje1,personaje2);

        Printer.ganadorBatalla(defensor);


    }

}
