package co.com.ps.c3;
import java.util.*;

public class Clase3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite su nombre");
    String nombre = scanner.nextLine();

    System.out.println("Digite su edad");
    int edad = scanner.nextInt();


    System.out.println("Su nombre es: "+nombre+" y su edad es: "+edad+" años.  Bienvenido");
    Persona persona = new Persona();
    persona.setEdad(29);
    persona.setNombre("Jorge");

    }
    }

