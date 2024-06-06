public class CuerpoACuerpo extends Arma {
    private short multiplicadorAtaque;
    private short alcance;

    public short getAlcance() {
        return alcance;
    }

    public void setAlcance(short alcance) {
        this.alcance = alcance;
    }

    public short getMultiplicadorAtaque() {
        return multiplicadorAtaque;
    }

    public void setMultiplicadorAtaque(short multiplicadorAtaque) {
        this.multiplicadorAtaque = multiplicadorAtaque;
    }

    public CuerpoACuerpo(short multiplicadorAtaque, short alcance,String nombre, int ptsAtaque, int ptsDefensa,
                         int peso) {
        this.multiplicadorAtaque = multiplicadorAtaque;
        this.alcance = alcance;
        this.nombre = nombre;
        this.ptsAtaque = ptsAtaque;
        this.ptsDefensa = ptsDefensa;
        this.peso = peso;
    }

}
