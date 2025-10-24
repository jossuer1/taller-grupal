public class EjemploReturn {
    public static int sumar(int a, int b) {
        return a + b; // devuelve un número
    }

    public static String saludar(String nombre) {
        return "Hola " + nombre; // devuelve texto
    }
    public static void main(String[] args) {
        System.out.println(sumar(3, 7));
        System.out.println(saludar("Josue"));
    }
}
