import java.util.Scanner;

// Estructura básica de un programa Java
public class App {
    public static void main(String[] args) throws Exception {
        // Imprime el nombre
        System.out.println("Tu Nombre");
    }

}

class operaciones {
    // Método para realizar una suma
    public int sumar(int a, int b) {
        return a + b;
    }
}


// operaciones aritméticas básicas
class OperacionesAritmeticas {
    // Método para sumar dos números
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar dos números
    public int restar(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dos números
    public double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }
}