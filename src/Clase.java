import java.util.Collection;
import java.util.HashSet;

public class Clase {
    private String nombre;
    private Collection<TipoArma> tipoArmasUsables = new HashSet<TipoArma>();
    private int plusFuerza;
    private int plusDestreza;
    private int plusInteligencia;
    private int plusConstitucion;

    public void setTipoArma(TipoArma tipoArma){
        tipoArmasUsables.add(tipoArma);
    }
    public Collection<TipoArma> getArmasUsadas(){
        return tipoArmasUsables;
    }
    public String getNombre() {
        return nombre;
    }

    public int getPlusFuerza() {
        return plusFuerza;
    }

    public int getPlusDestreza() {
        return plusDestreza;
    }

    public int getPlusInteligencia() {
        return plusInteligencia;
    }

    public int getPlusConstitucion() {
        return plusConstitucion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPlusFuerza(int plusFuerza) {
        this.plusFuerza = plusFuerza;
    }

    public void setPlusDestreza(int plusDestreza) {
        this.plusDestreza = plusDestreza;
    }

    public void setPlusInteligencia(int plusInteligencia) {
        this.plusInteligencia = plusInteligencia;
    }

    public void setPlusConstitucion(int plusConstitucion) {
        this.plusConstitucion = plusConstitucion;
    }

    public Clase(String nombre, int plusFuerza, int plusDestreza, int plusInteligencia, int plusConstitucion) {
        this.nombre = nombre;
        this.plusFuerza = plusFuerza;
        this.plusDestreza = plusDestreza;
        this.plusInteligencia = plusInteligencia;
        this.plusConstitucion = plusConstitucion;
    }

    public String arsenal(){
        StringBuilder texto = new StringBuilder("Usa: ");
        for(TipoArma tipoArma : tipoArmasUsables){
            texto.append(tipoArma.getNombre()).append(" - ");
        }

        texto = new StringBuilder(texto.substring(0, texto.length() - 3));
        return texto.toString();
    }
}
