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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Personaje(String nombre, Raza raza, Clase clase, Arma arma) {
        this.nombre = nombre;
        this.nivel = 0;
        this.raza = raza;
        this.clase = clase;
        this.vida=raza.getConstitucion()*10;
        this.arma=arma;

    }
    public boolean validarArma(Arma arma){
        if (arma.isEsCuerpoACuerpo() && clase.isUsaCuerpoACuerpo() ||
        arma.isEsDistancia() && clase.isUsaDistancia() ||
        arma.isEsBaculos() && clase.isUsaBaculos() ||
        arma.isEsEscudos() && clase.isUsaEscudos()){
            return true;
        }
        else {return false;}



    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
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

    public void sacarVida (int dano){

    }
    public void restaurarVida (){
        this.vida=raza.getConstitucion()*10;
    }



}
