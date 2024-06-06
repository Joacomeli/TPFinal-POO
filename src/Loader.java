import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Loader {

    //esta clase la podemos usar para cargar las armas de un txt

    //Esto iria en el main:
    //ArmasLoader loader = new ArmasLoader();
    //List<Escudos> escudosList = loader.cargarEscudos("armas.txt");


    public List<Escudos> cargarEscudos(String fileName) {
        List<Escudos> escudosList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                short multiplicadorDefensa = Short.parseShort(data[0].trim());
                String nombre = data[1].trim();
                int ptsAtaque = Integer.parseInt(data[2].trim());
                int ptsDefensa = Integer.parseInt(data[3].trim());
                int peso = Integer.parseInt(data[4].trim());

                Escudos escudo = new Escudos(multiplicadorDefensa, nombre, ptsAtaque, ptsDefensa, peso);
                escudosList.add(escudo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return escudosList;
    }

}
