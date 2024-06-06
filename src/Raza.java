public class Raza {
    private String nombre;
    private int fuerza;
    private int destreza;
    private int constitucion;
    private int inteligencia;
    private int carisma;

    public int getCarisma() {
        return carisma;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza(String nombre, int fuerza, int destreza, int constitucion, int inteligencia, int carisma) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
    }
}
