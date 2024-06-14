public class Escudos{
    private short multiplicadorDefensa;

    public short getMultiplicadorDefensa() {
        return multiplicadorDefensa;
    }

    public void setMultiplicadorDefensa(short multiplicadorDefensa) {
        this.multiplicadorDefensa = multiplicadorDefensa;
    }

    public Escudos(short multiplicadorDefensa,  String nombre, int ptsAtaque, int ptsDefensa,
                   int peso) {
        this.multiplicadorDefensa = multiplicadorDefensa;
//        this.nombre = nombre;
//        this.ptsAtaque = ptsAtaque;
//        this.ptsDefensa = ptsDefensa;
//        this.peso = peso;
    }
}
