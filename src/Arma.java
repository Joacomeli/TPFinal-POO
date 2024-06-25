public class Arma {
    private String nombre;
    private int ptsAtaque;
    private int ptsDefensa;

    private int alcance;
    private int peso;

    protected String tipo;

    public Arma(String nombre, int ptsAtaque, int ptsDefensa, int peso, int alcance, String tipo) {
        this.nombre = nombre;
        this.ptsAtaque = ptsAtaque;
        this.ptsDefensa = ptsDefensa;
        this.peso = peso;
        this.alcance=alcance;
        this.tipo = tipo;
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
