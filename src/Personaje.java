import java.util.ArrayList;
import java.util.Map;

public class Personaje {
    private String nombre;
    private int nivel;
    private Raza raza;
    private Clase clase;
    ArrayList<Arma> armas = new ArrayList<Arma>();

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

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public String getNombre(){
        return nombre;
    }

    public void agregarArma(Arma arma, Map cuerpoACuerpo, Map distancia, Map baculos, Map escudos){
        if (
            clase.isUsaCuerpoACuerpo() && cuerpoACuerpo.containsKey(arma) ||
            clase.isUsaDistancia() && distancia.containsKey(arma) ||
            clase.isUsaBaculos() && baculos.containsKey(arma) ||
            clase.isUsaEscudos() && escudos.containsKey(arma)
        ) {
            armas.add(arma);
        }
    }

    public void agregarArmaBis(Personaje personaje, Arma arma){
        if (personaje.getClase().isUsaCuerpoACuerpo())

    }

}
