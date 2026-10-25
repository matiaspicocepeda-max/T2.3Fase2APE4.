// Ejercicio 6: validacion de datos
public class Ejercicio6 {
 public boolean verificarEdad(int edad) {
 if (edad < 0 || edad > 120) {
 System.out.println("Edad inválida");
 return false;
 }
 return true;
 }
 public static void main(String[] args) {
 Ejercicio6 e = new Ejercicio6();
 System.out.println(e.verificarEdad(25));
 System.out.println(e.verificarEdad(150));
 }
}
