public class Personaje {
    private String nombre;
    private int nivel;
    private Raza raza;
    private Clase clase;

    public Personaje(String nombre, Raza raza, Clase clase) {
        this.nombre = nombre;
        this.nivel = 0;
        this.raza = raza;
        this.clase = clase;
    }

    public String getNombre(){
        return nombre;
    }
}
