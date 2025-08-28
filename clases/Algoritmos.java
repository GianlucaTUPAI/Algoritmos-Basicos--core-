package clases;

public class Algoritmos {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }



    public static boolean esPrimo(int num) {
        if (num == 1 || num <= 0) {
            return false;
        }
        int divisores = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static String stringEnReversa(String texto) {
        // Convertimos el texto a un arreglo de caracteres
        char[] caracteres = texto.toCharArray();
        // Creamos un arreglo nuevo para guardar el texto al revés
        char[] resultado = new char[caracteres.length];
        // Recorremos el texto de atrás hacia adelante
        int posicion = 0;
        for (int i = caracteres.length - 1; i >= 0; i--) {
            resultado[posicion] = caracteres[i];
            posicion++;
        }
        // Convertimos el arreglo de caracteres a String y lo retornamos
        return new String(resultado);
    }

    public static boolean esPalindromo(String Palabra) {
        String textoLimpio = Palabra.toLowerCase();

        // Crear una variable para guardar el texto al revés
        String textoReverso = "";

        // Voltear el texto letra por letra
        for (int i = textoLimpio.length() - 1; i >= 0; i--) {
            textoReverso = textoReverso + textoLimpio.charAt(i);
        }

        // Comparar si son iguales
        if (textoLimpio.equals(textoReverso)) {
            return true;
        } else {
            return false;
        }
    }

    public static String secuenciaFizzBuzz(long nombre) {
        String resultado = "";
        for (int i = 1; i <= nombre; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultado = resultado + "FizzBuzz";
            } else if (i % 3 == 0) {
                resultado = resultado + "Fizz";
            } else if (i % 5 == 0) {
                resultado = resultado + "Buzz";
            }
            else {
                resultado = resultado + i;
            }
            //agrega espacio entre los numeros menos en el ultimo
            if (i < nombre){
                resultado = resultado + " ";
            }
        }
            return resultado;
    }
    
}
