public class Parametros {
    public static void cambiarNumero(int x) {
        x = 10;
    }

    public static void cambiarNombre(Persona p) {
        p.setNombre("Carlos");
    }

    public static void main(String[] args) {
        int numero = 5;
        cambiarNumero(numero);
        System.out.println(numero); // sigue siendo 5
        Persona persona = new Persona();
        persona.setNombre("Ana");
        cambiarNombre(persona);
        System.out.println(persona.getNombre()); // ahora es "Carlos"
    }
}

class Persona {
    private String nombre;
    public void setNombre(String n) { nombre = n; }
    public String getNombre() { return nombre; }
}
