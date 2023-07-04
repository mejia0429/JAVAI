package co.com.ps.c6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones2 {

    public static void main(String[] args) {
        try {
            // Ejemplo 1: Excepción de formato incorrecto al leer un entero (InputMismatchException)
            int numero = leerEntero();
            System.out.println("El número ingresado es: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor ingresado no es un entero válido.");
        }

        try {
            // Ejemplo 2: Excepción personalizada al validar una contraseña (InvalidPasswordException)
            String contraseña = "abc123";
            validarContraseña(contraseña);
            System.out.println("La contraseña es válida.");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: Contraseña inválida - " + e.getMessage());
        }
    }

    public static int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();
        return numero;
    }

    public static void validarContraseña(String contraseña) throws InvalidPasswordException {
        if (contraseña.length() < 8) {
            throw new InvalidPasswordException("La contraseña debe tener al menos 8 caracteres.");
        }
        // Validar otras reglas de la contraseña...
    }
}

class InvalidPasswordException extends Exception {

    public InvalidPasswordException(String mensaje) {
        super(mensaje);
    }
}