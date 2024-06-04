import java.util.HashSet;

public class Usuario {
    private String NombreUsuario;
    private int id;
    HashSet<Personaje> personajesDisponibles = new HashSet<Personaje>();
    public void Usuario(String nombreUsuario, int id){
        this.NombreUsuario = nombreUsuario;
        this.id = id;
    }
    public void crearPersonaje(String nombre, Raza raza, Clase clase, Arma arma){
        if (clase.estaArma(arma)){
            Personaje p = new Personaje();
            p.Personaje(nombre, raza, clase, arma);
            personajesDisponibles.add(p);
            System.out.println("Creacion Correcta");
        } else {
            System.out.println("El arma no esta disponible para esa clase");
        }

    }
    public boolean estaPersonaje(Personaje personaje){
        return personajesDisponibles.contains(personaje);
    }
    public void eliminarPersonaje(Personaje personaje){
        personajesDisponibles.remove(personaje);
    }
    public void imprimirPersonaje(){
        for(Personaje i : personajesDisponibles){
            System.out.println(i.getNombre());
        }
    }


}
