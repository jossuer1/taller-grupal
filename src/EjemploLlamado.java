public class EjemploLlamado {
    public static double raiz(double n) {
        return Math.sqrt(n); // método estático
    }

    public void mostrar(double valor) {
        System.out.println("Valor: " + valor); // método de instancia
    }
    public static void main(String[] args) {
        double r = EjemploLlamado.raiz(25);
        EjemploLlamado obj = new EjemploLlamado();
        obj.mostrar(r);
    }
}



