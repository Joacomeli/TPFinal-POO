import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class Personaje {
    private String nombre;
    private int nivel;
    private Raza raza;
    private Clase clase;
    ArrayList<Arma> armas = new ArrayList<Arma>();
    private HashSet<Arma> armasEquipadas = new HashSet<Arma>();

    public Personaje(String nombre, Raza raza, Clase clase) {
        this.nombre = nombre;
        this.nivel = 0;
        this.raza = raza;
        this.clase = clase;
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

    public HashSet<Arma> getArmasEquipadas() {
        return armasEquipadas;
    }

    public String getNombre(){
        return nombre;
    }

    public void agregarArma(Arma arma) {
        if(clase.isUsaCuerpoACuerpo() && arma.getClass() == CuerpoACuerpo.class ||
                clase.isUsaDistancia() && arma.getClass() == Distancia.class ||
                clase.isUsaEscudos() && arma.getClass() == Escudos.class ||
                clase.isUsaBaculos() && arma.getClass() == Baculos.class){
            this.armasEquipadas.add(arma);
        } else {
            System.out.println("Arma no disponible para esa clase");
        }
    }

    /*public void agregarArmaBis(Personaje personaje, Arma arma){
        if (personaje.getClase().isUsaCuerpoACuerpo());

    }*/

}
