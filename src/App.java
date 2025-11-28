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

// Trabajar con números de punto flotante
class OperacionesFlotantes {
    // Método para sumar dos números de punto flotante
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para dividir dos números de punto flotante
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }
}

// Trabajar con cadenas
class OperacionesCadenas {
    // Método para concatenar dos cadenas
    public String concatenar(String a, String b) {
        return a + b;
    }

    // Método para obtener la longitud de una cadena
    public int longitud(String a) {
        return a.length();
    }
}
