public class Arma {
    private String nombre;
    private int ptsAtaque;
    private int ptsDefensa;

    private int alcance;
    private int peso;

    private boolean esCuerpoACuerpo;
    private boolean esDistancia;
    private boolean esBaculos;
    private boolean esEscudos;

    public Arma(String nombre, int ptsAtaque, int ptsDefensa, int alcance, int peso, boolean esCuerpoACuerpo, boolean esDistancia, boolean esBaculos, boolean esEscudos) {
        this.nombre = nombre;
        this.ptsAtaque = ptsAtaque;
        this.ptsDefensa = ptsDefensa;
        this.alcance = alcance;
        this.peso = peso;
        this.esCuerpoACuerpo = esCuerpoACuerpo;
        this.esDistancia = esDistancia;
        this.esBaculos = esBaculos;
        this.esEscudos = esEscudos;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public boolean isEsCuerpoACuerpo() {
        return esCuerpoACuerpo;
    }

    public void setEsCuerpoACuerpo(boolean esCuerpoACuerpo) {
        this.esCuerpoACuerpo = esCuerpoACuerpo;
    }

    public boolean isEsDistancia() {
        return esDistancia;
    }

    public void setEsDistancia(boolean esDistancia) {
        this.esDistancia = esDistancia;
    }

    public boolean isEsBaculos() {
        return esBaculos;
    }

    public void setEsBaculos(boolean esBaculos) {
        this.esBaculos = esBaculos;
    }

    public boolean isEsEscudos() {
        return esEscudos;
    }

    public void setEsEscudos(boolean esEscudos) {
        this.esEscudos = esEscudos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getPtsAtaque() {
        return ptsAtaque;
    }

    public void setPtsAtaque(int ptsAtaque) {
        this.ptsAtaque = ptsAtaque;
    }

    public int getPtsDefensa() {
        return ptsDefensa;
    }
    public void setPtsDefensa(int ptsDefensa) {
        this.ptsDefensa = ptsDefensa;
    }


}
