import java.util.Random;

public class Combate {

    public static boolean golpeConecta (int destrezaAtacante, int destrezaDefensor){
        Random r = new Random();
        if (r.nextInt(1,20)+destrezaAtacante>r.nextInt(1,20)+destrezaDefensor){
            return true;
        }else return false;
    }

    //public int inicioCombate ();

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
        System.out.println(atacante.getNombre()+" es mas rapido y ataca primero!");
        while (personaje1.getVida()>0 && personaje2.getVida()>0){
            System.out.println("Vida "+ personaje1.getNombre() +" "+ personaje1.getVida()+
                    " Vida "+personaje2.getNombre()+" "+personaje2.getVida());
            Personaje pivot;
            if (golpeConecta(atacante.getRaza().getDestreza(),defensor.getRaza().getDestreza())){
                int dano = (r.nextInt(1,20)+atacante.getArma().getPtsAtaque()+atacante.getRaza().getFuerza()
                        -r.nextInt(1,20)+defensor.getArma().getPtsDefensa());
                System.out.println(atacante.getNombre()+" le quita "+dano+" Puntos de vida a "+defensor.getNombre());
                defensor.setVida(defensor.getVida()-dano);
                pivot = atacante;
                atacante = defensor;
                defensor = pivot;

            } else {
                System.out.println("El golpe de "+atacante.getNombre()+" a Fallado!");
            }
        }
        System.out.println("Vida "+ personaje1.getNombre() + personaje1.getVida()+
                " Vida "+personaje2.getNombre()+personaje2.getVida());
        System.out.println(defensor.getNombre()+ " A Ganado el duelo!");


    }

}
