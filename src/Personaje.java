public class Personaje {
    private String nombre;
    private int nivel;
    private Raza raza;
    private Clase clase;
    private Arma ArmaEquipada;
    public void Personaje(String nombre, Raza raza, Clase clase, Arma ArmaEquipada){
        this.nombre = nombre;
        this.nivel = 0;
        this.raza = raza;
        this.clase = clase;
        this.ArmaEquipada = ArmaEquipada;
    }
    public String getNombre(){
        return nombre;
    }
}
