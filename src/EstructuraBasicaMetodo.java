public class EstructuraBasicaMetodo {
    // Metodo
    public void verificarNumero(int numero) {
        if (numero > 0) {
            System.out.println(numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    public static void main(String[] args) {
        EstructuraBasicaMetodo ejemplo = new EstructuraBasicaMetodo();
        ejemplo.verificarNumero(8);
        ejemplo.verificarNumero(-3);
        ejemplo.verificarNumero(0);
    }
}