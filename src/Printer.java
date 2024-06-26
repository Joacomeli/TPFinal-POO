import java.util.Map;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Printer {
    public static int validarInput(int valorMaximo, String texto){

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(texto+"\n");
                number = scanner.nextInt();
                if (number>0 && number<valorMaximo){
                    validInput = true; // input is valid, exit the loop

                }else {
                    System.out.println("Este numero no existe en la lista");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese un NUMERO");
                scanner.next(); // clear the invalid input
            }
        }
        return number;

    }

    public static int seleccionMenu(){
        Scanner sc = new Scanner(System.in);
        int valorMaximo = 9;
        String texto = ("1 - Crear Personaje"+"\n"+
        "2 - Listar Personajes"+"\n"+
        "3 - Equipar armas a los personajes"+"\n"+
        "4 - Iniciar combate entre 2 personajes"+"\n"+
        "5 - Listar Razas"+"\n"+
        "6 - Listar Clases"+"\n"+
        "7 - Listar Armas"+"\n"+
        "8 - Para terminar de jugar"+"\n"+
        "Ingrese una acción(un numero)");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        System.out.print(texto+"\n");

        while (!validInput) {
            try {
                number = scanner.nextInt();
                if (number>0 && number<valorMaximo){
                    validInput = true; // input is valid, exit the loop

                }else {
                    System.out.println("Este numero no existe en la lista");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese un NUMERO");
                scanner.next(); // clear the invalid input
            }
        }
        return number;
    }

    public static void primerAtaque(Personaje personaje){
        System.out.println(personaje.getNombre()+ " es mas rapido y ataca primero!");
    }

    public static void vidaPersonajes (Personaje personaje1, Personaje personaje2){
        System.out.println("Vida "+ personaje1.getNombre() +" "+ personaje1.getVida()+
                " Vida "+personaje2.getNombre()+" "+personaje2.getVida());
    }

    public static void golpeConecta(Personaje atacante, Personaje defensor, int dano){
        System.out.println(atacante.getNombre()+" le quita "+dano+" Puntos de vida a "+defensor.getNombre());

    }

    public static void golpeFalla (Personaje atacante){
        System.out.println("El golpe de "+atacante.getNombre()+" a Fallado!");
    }

    public static void ganadorBatalla (Personaje personaje){
        System.out.println(personaje.getNombre()+ " A Ganado el duelo!");
    }





}
