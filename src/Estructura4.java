public class Estructura4 {
        // Función para calcular el área de un cuadrado
        // Parámetro: lado (longitud de un lado del cuadrado)
        public double areaCuadrado(double lado) {
            return lado * lado;
        }
        // Función para calcular el área de un rectángulo
        // Parámetros: base y altura
        public double areaRectangulo(double base, double altura) {
            return base * altura;
        }

        // Función para calcular el área de un trapecio
        // Parámetros: baseMayor, baseMenor y altura
        public double areaTrapecio(double baseMayor, double baseMenor, double altura) {
            return ((baseMayor + baseMenor) * altura) / 2;
        }

        // Metodo principal para probar las funciones
        public static void main(String[] args) {
            Estructura4 figuras = new Estructura4();
            // Ejemplo de área de cuadrado con lado 4
            double areaC = figuras.areaCuadrado(4);
            System.out.println("Área del cuadrado: " + areaC);
            // Ejemplo de área de rectángulo con base 5 y altura 3
            double areaR = figuras.areaRectangulo(5, 3);
            System.out.println("Área del rectángulo: " + areaR);
            // Ejemplo de área de trapecio: base mayor 8, base menor 4, altura 5
            double areaT = figuras.areaTrapecio(8, 4, 5);
            System.out.println("Área del trapecio: " + areaT);
        }
    }

