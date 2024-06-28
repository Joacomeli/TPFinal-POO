import java.util.Collection;

public class Clase {
    private String nombre;
    private Collection<TipoArma> armasUsadas;
    private int plusFuerza;
    private int plusDestreza;
    private int plusInteligencia;
    private int plusConstitucion;

    public void setTipoArma(TipoArma tipoArma){
        armasUsadas.add(tipoArma);
    }
    public Collection<TipoArma> getArmasUsadas(){
        return armasUsadas;
    }
    public String getNombre() {
        return nombre;
    }

    public boolean isUsaCuerpoACuerpo() {
        return usaCuerpoACuerpo;
    }

    public boolean isUsaDistancia() {
        return usaDistancia;
    }

    public boolean isUsaBaculos() {
        return usaBaculos;
    }

    public boolean isUsaEscudos() {
        return usaEscudos;
    }

    public int getPlusFuerza() {
        return plusFuerza;
    }

    public int getPlusDestreza() {
        return plusDestreza;
    }

    public int getPlusInteligencia() {
        return plusInteligencia;
    }

    public int getPlusConstitucion() {
        return plusConstitucion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsaCuerpoACuerpo(boolean usaCuerpoACuerpo) {
        this.usaCuerpoACuerpo = usaCuerpoACuerpo;
    }

    public void setUsaDistancia(boolean usaDistancia) {
        this.usaDistancia = usaDistancia;
    }

    public void setUsaBaculos(boolean usaBaculos) {
        this.usaBaculos = usaBaculos;
    }

    public void setUsaEscudos(boolean usaEscudos) {
        this.usaEscudos = usaEscudos;
    }

    public void setPlusFuerza(int plusFuerza) {
        this.plusFuerza = plusFuerza;
    }

    public void setPlusDestreza(int plusDestreza) {
        this.plusDestreza = plusDestreza;
    }

    public void setPlusInteligencia(int plusInteligencia) {
        this.plusInteligencia = plusInteligencia;
    }

    public void setPlusConstitucion(int plusConstitucion) {
        this.plusConstitucion = plusConstitucion;
    }

    public Clase(String nombre, int plusFuerza, int plusDestreza, int plusInteligencia, int plusConstitucion) {
        this.nombre = nombre;
        this.plusFuerza = plusFuerza;
        this.plusDestreza = plusDestreza;
        this.plusInteligencia = plusInteligencia;
        this.plusConstitucion = plusConstitucion;
    }

    public String arsenal(){
        String texto = "Usa: ";
        if (usaCuerpoACuerpo){
            texto = texto+"Cuerpo a Cuerpo - ";
        }
        if (usaDistancia){
            texto = texto+"Distancia - ";
        }
        if (usaBaculos){
            texto = texto+"Baculos - ";
        }
        if (usaEscudos){
            texto = texto+"Escudos - ";
        }
        texto=texto.substring(0, texto.length()-3);
        return  texto;
    }
}
