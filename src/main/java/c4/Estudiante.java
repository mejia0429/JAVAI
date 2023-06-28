package c4;

import java.util.*;
public class Estudiante {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estudiante:");
        System.out.println("Jorge");
        System.out.println("Nota del del estudiante:");
        int nota = scanner.nextInt();
        if (nota >= 3 && nota <=5){
            System.out.println("el estudiante aprueba la materia");
        } else if (nota <= 3 && nota >= 0) {
            System.out.println("el estudiante pierde la materia");

        } else {
            System.out.println("revisar la nota");
        }




    }
}
