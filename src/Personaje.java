import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class Personaje {
    private String nombre;
    private int nivel;
    private int vida;
    private Raza raza;
    private Clase clase;
    private Arma arma;

    public Personaje(String nombre, Raza raza, Clase clase) {
        this.nombre = nombre;
        this.nivel = 0;
        this.raza = raza;
        this.clase = clase;
        this.vida=raza.getConstitucion()*10;


    }

    public int getNivel() {
        return nivel;
    }

    public Raza getRaza() {
        return raza;
    }

    public Clase getClase() {
        return clase;
    }

    public Arma getArmaEquipada() {
        return arma;
    }

    public String getNombre(){
        return nombre;
    }

    public void agregarArma(Arma arma) {
        if(clase.isUsaCuerpoACuerpo() && arma.getClass() == CuerpoACuerpo.class ||
                clase.isUsaDistancia() && arma.getClass() == Distancia.class ||
                clase.isUsaEscudos() && arma.getClass() == Escudos.class ||
                clase.isUsaBaculos() && arma.getClass() == Baculos.class){
            this.arma=arma;
        } else {
            System.out.println("Arma no disponible para esa clase");
        }
    }

    public void sacarVida (int dano){

    }
    //Agregar si ya tiene arma



}
