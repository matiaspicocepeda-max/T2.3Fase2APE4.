// Ejercicio 3: parametros vs argumentos
public class Ejercicio3 {
 // x e y son los PARAMETROS
 public double multiplicar(double x, double y) {
 return x * y;
 }
 public static void main(String[] args) {
 Ejercicio3 miObjeto = new Ejercicio3();
 // 4.0 y 5.5 son los ARGUMENTOS
 double res = miObjeto.multiplicar(4.0, 5.5);
 System.out.println("Resultado: " + res);
 }
}
