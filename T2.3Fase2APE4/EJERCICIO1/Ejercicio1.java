
public class Ejercicio1 {
 public double calcularArea(double base, double altura) {
 double area = base * altura;
 System.out.println("El área es: " + area);
 return area;
 }
 public static void main(String[] args) {
 Ejercicio1 e = new Ejercicio1();
 double resultado = e.calcularArea(4.0, 2.5);
 System.out.println("Valor devuelto: " + resultado);
 }
}
