public class Arma {
    private String nombre;
    private int ptsOfensivos;
    private int ptsDefensivos;
    public void Arma(String nombre, int ptsOfensivos, int ptsDefensivos){
        this.nombre = nombre;
        this.ptsOfensivos = ptsOfensivos;
        this.ptsDefensivos = ptsDefensivos;
    }
    public String getNombre(){
        return nombre;
    }
}
