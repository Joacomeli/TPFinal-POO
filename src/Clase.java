import java.util.HashSet;
public class Clase {
    private String nombre;
    HashSet<Arma> armasDisponibles = new HashSet<Arma>();
    public void Clase(String nombre){
        this.nombre = nombre;
    }
    public void agregarArma(Arma arma){
        armasDisponibles.add(arma);
    }
    public boolean estaArma(Arma arma){
        return armasDisponibles.contains(arma);
    }
    public void eliminarArma(Arma arma){
        armasDisponibles.remove(arma);
    }
    public void imprimirArma(){
        for (Arma i : armasDisponibles) {
            System.out.println(i.getNombre());
        }
    }
}
