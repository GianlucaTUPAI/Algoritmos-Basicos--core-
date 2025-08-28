package clases;

public class Aplicacion {
        public static void main(String args[]) {
            boolean numero1 = Algoritmos.esPar(8);
            boolean numero2 = Algoritmos.esPar(5);
            boolean numero3 = Algoritmos.esPar(2);
            boolean numero4 = Algoritmos.esPar(3);
            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(numero3);
            System.out.println(numero4);
            System.out.println("--------------");
            boolean num1 = Algoritmos.esPrimo(1);
            boolean num2 = Algoritmos.esPrimo(4);
            boolean num3 = Algoritmos.esPrimo(7);
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println("--------------");
            String nombre = Algoritmos.stringEnReversa("Gianluca");
            String nombre2 = Algoritmos.stringEnReversa("Alfredo");
            String nombre3 = Algoritmos.stringEnReversa("Candela");
            System.out.println(nombre);
            System.out.println(nombre2);
            System.out.println(nombre3);
            System.out.println("--------------");
            boolean Palabra = clases.Algoritmos.esPalindromo("radar");
            boolean Palabra2 = clases.Algoritmos.esPalindromo("neuquen");
            boolean Palabra3 = clases.Algoritmos.esPalindromo("lunar");
            System.out.println(Palabra);
            System.out.println(Palabra2);
            System.out.println(Palabra3);
            System.out.println("--------------");
            String secuencia = Algoritmos.secuenciaFizzBuzz(50);
            System.out.println(secuencia);
            System.out.println("--------------");
    }
}
