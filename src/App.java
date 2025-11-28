// comprendiendo las Sentencias If-Else
public class App {
    public static void main(String[] args) throws Exception {
        int numero = 5;

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}

//  Trabajando con Bucles For
class forLoopExample {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración número: " + i);
        }
    }
}