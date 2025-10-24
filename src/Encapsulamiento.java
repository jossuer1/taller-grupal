public class Encapsulamiento {
        private String nombre;
        private int edad;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        }

        public static void main(String[] args) {
            Encapsulamiento persona = new Encapsulamiento();
            persona.setNombre("Maria");
            persona.setEdad(20);
            persona.mostrarInformacion();
        }
    }

