public class Distancia{
    private int distanciaEfectiva;
    private short velocidadRecarga;

    public short getVelocidadRecarga() {
        return velocidadRecarga;
    }

    public void setVelocidadRecarga(short velocidadRecarga) {
        this.velocidadRecarga = velocidadRecarga;
    }

    public int getDistanciaEfectiva() {
        return distanciaEfectiva;
    }

    public void setDistanciaEfectiva(int distanciaEfectiva) {
        this.distanciaEfectiva = distanciaEfectiva;
    }

    public Distancia(int distanciaEfectiva, short velocidadRecarga,String nombre, int ptsAtaque, int ptsDefensa,
                     int peso) {
        this.distanciaEfectiva = distanciaEfectiva;
        this.velocidadRecarga = velocidadRecarga;
//        this.nombre = nombre;
//        this.ptsAtaque = ptsAtaque;
//        this.ptsDefensa = ptsDefensa;
//        this.peso = peso;
    }

}
