public class Calculadora {
    // Método estático: se puede usar sin crear objeto
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método de instancia: requiere un objeto
    public int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int resultado1 = Calculadora.sumar(5, 3);
        Calculadora c = new Calculadora();
        int resultado2 = c.restar(8, 2);
        System.out.println("Suma: " + resultado1);
        System.out.println("Resta: " + resultado2);
    }
}
