package ejercicio;
import java.util.*;
public class Est {
    public static void main(String[] args){
        int i;
        double suma=0;
        int[] estudiantes= new int[5];
        Scanner scanner = new Scanner(System.in);
        for (i=0;i<estudiantes.length;i++){
            System.out.println("ingrese nota del estudiante" + (i+1));
            estudiantes[i] = scanner.nextInt();
            suma += estudiantes[i];
        }
        System.out.println("La suma de las notas es:" + suma);
        System.out.println("El promedio de las notas es" + (suma/estudiantes.length));



    }
}
