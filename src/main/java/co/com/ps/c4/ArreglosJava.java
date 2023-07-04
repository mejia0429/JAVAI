package co.com.ps.c4;

public class ArreglosJava {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        //int[] numeros1={1,2,3,4,5};


        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;


        System.out.println("Elementos del arreglo 'numeros':");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        String[] nombres = {"pepito", "nico", "yola"};

        System.out.println("\nElementos del arreglo 'nombres':");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombres[" + i + "] = " + nombres[i]);
        }

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("\nSuma de los elementos del arreglo 'numeros': " + suma);
        System.out.println("Promedio de los elementos del arreglo 'numeros': " + (suma / numeros.length));
    }
}
