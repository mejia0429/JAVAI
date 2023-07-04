package co.com.ps.c5;
import java.util.Scanner;

public class PromedioClase {
    public static void main(String[] args) {
        int numEstudiantes = 5;

        int[] notas = new int[numEstudiantes];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Digite la nota del estudiante " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }


        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        double promedio = (double) suma / numEstudiantes;


        System.out.println("El promedio de las notas es: " + promedio);
    }
}
