import java.util.Scanner;

public class Funcion {
    private String nombre;
    // Constructor
    public Funcion(String nombre) {
        this.nombre = nombre;
    }
    //-funcion
    public void saludar() {
        System.out.println("Hola, " + nombre + "!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String nombreUsuario = scanner.nextLine();

        Funcion saludo = new Funcion(nombreUsuario);
        saludo.saludar();
    }
}