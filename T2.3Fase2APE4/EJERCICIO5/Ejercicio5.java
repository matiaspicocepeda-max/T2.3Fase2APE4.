// Ejercicio 5: metodo con multiples parametros
public class Ejercicio5 {
 public static void main(String[] args) {
 Calculadora c = new Calculadora();
 double promedio = c.calcularPromedio(8.0, 7.0, 9.0);
 System.out.println("Promedio: " + promedio);
 }
}
class Calculadora {
 public double calcularPromedio(double n1, double n2, double n3) {
 return (n1 + n2 + n3) / 3;
 }
}
