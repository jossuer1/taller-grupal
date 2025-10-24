public class Static {
        // Metodo estático
        public static int edad(int anio_actual, int anio_nacimiento) {
            return anio_actual -  anio_nacimiento;
        }
        // Metodo de instancia
        private String nombre;
        public Static(String nombre) {
            this.nombre = nombre;
        }
        public void saludar() {
            System.out.println("Hola, " + nombre + "!");
        }
        public static void main(String[] args) {
            // Llamada a metodo estático
            int suma = Static.edad(2025, 2005);
            System.out.println("edad " + edad(2025, 2005));
            // Llamada a metodo de instancia
            Static persona = new Static("Ana");
            persona.saludar();
        }
    }

