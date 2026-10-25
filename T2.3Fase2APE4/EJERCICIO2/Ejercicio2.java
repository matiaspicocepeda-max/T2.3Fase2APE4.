// Ejercicio 2: metodo void con dos parametros
public class Ejercicio2 {
 public static void main(String[] args) {
 Bienvenida b = new Bienvenida();
 b.darBienvenida("Carlos", 18);
 }
}
class Bienvenida {
 public void darBienvenida(String nombre, int edad) {
 System.out.println("Hola " + nombre + ", tienes " + edad
 + " años. ¡Bienvenido al sistema!");
 }
}
