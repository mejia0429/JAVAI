package co.com.ps.c5;

public class Ciclos {
    public static void main(String[] args) {
        int[] numeros={1,2,3,4};

        for (int i=0 ; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

        int contador = 0;
        while (contador < 4) {
            System.out.println("El contador es: " + contador);
            contador++;
        }

        contador=0;
        do {
            System.out.println("El contador es: " + contador);
            contador++;
        } while (contador < 4);

    }
}
