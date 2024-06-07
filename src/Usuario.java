import java.awt.*;
import java.util.ArrayList;

public class Usuario {
    private String NombreUsuario;
    private int idUsuario ;
    ArrayList <Personaje> personajes = new ArrayList<Personaje>();
    public Usuario(String nombreUsuario, int idUsuario){
        this.NombreUsuario = nombreUsuario;
        this.idUsuario = idUsuario;
    }
/*
    public void crearPersonaje(String nombre, Raza raza, Clase clase, int idpersonaje, String banana){
        Personaje  banana = new Personaje(nombre,raza,clase,idpersonaje);
        p.Personaje(nombre, raza, clase, arma);
        personajesDisponibles.add(p);
        System.out.println("Creacion Correcta");


    }*/


/*

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
*/


}
