public class Funcion2 {
    public boolean esPar(int numero) {
        return numero % 2 == 0;
        }

        // Método principal para probar la función
        public static void main(String[] args) {
            Funcion2 ejemplo = new Funcion2();
            int n = 15;
            if (ejemplo.esPar(n)) {
                System.out.println(n + " es par.");
            } else {
                System.out.println(n + " es impar.");
            }
        }
    }

