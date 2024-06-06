public class Personaje {
    private String nombre;
    private int nivel;
    private Raza raza;
    private Clase clase;

    public Personaje(String nombre, int nivel, Raza raza, Clase clase) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.raza = raza;
        this.clase = clase;
    }

    public String getNombre(){
        return nombre;
    }
}
