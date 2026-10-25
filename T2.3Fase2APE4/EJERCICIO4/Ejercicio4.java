// Ejercicio 4: paso por valor
public class Ejercicio4 {
 public void incrementar(int n) {
 n = n + 5;
 }
 public static void main(String[] args) {
 Ejercicio4 e = new Ejercicio4();
 int numero = 10;
 e.incrementar(numero);
 System.out.println("numero = " + numero);
 }
}
