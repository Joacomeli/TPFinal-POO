public class Baculos extends Arma{
    private short multiplicadorMagia;
    private short multiplicadorMana;

    public short getMultiplicadorMana() {
        return multiplicadorMana;
    }

    public void setMultiplicadorMana(short multiplicadorMana) {
        this.multiplicadorMana = multiplicadorMana;
    }

    public short getMultiplicadorMagia() {
        return multiplicadorMagia;
    }

    public void setMultiplicadorMagia(short multiplicadorMagia) {
        this.multiplicadorMagia = multiplicadorMagia;
    }

    public Baculos(short multiplicadorMagia, short multiplicadorMana,String nombre, int ptsAtaque, int ptsDefensa,
                   int peso) {
        this.multiplicadorMagia = multiplicadorMagia;
        this.multiplicadorMana = multiplicadorMana;
        this.nombre = nombre;
        this.ptsAtaque = ptsAtaque;
        this.ptsDefensa = ptsDefensa;
        this.peso = peso;
    }

}
