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

//  Explorando los Bucles While
class whileejemplo {
    public static void main(String[] args) throws Exception {
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}

// Desafio FizzBuzz
class FizzBuzz {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}