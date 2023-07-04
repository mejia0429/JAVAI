package co.com.ps.c6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        try {

            int resultado = dividir(10, 0);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero.");
        }

        try {
            leerArchivo("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        }

        try {
            int resultado = dividirGenerico(10, 0);
            System.out.println("El resultado de la división genérica es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }

    public static void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        File archivo = new File(nombreArchivo);
        Scanner scanner = new Scanner(archivo);
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            System.out.println(linea);
        }
        scanner.close();
    }

    public static int dividirGenerico(int dividendo, int divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("División entre cero no es posible.");
        }
        return dividendo / divisor;
    }
}