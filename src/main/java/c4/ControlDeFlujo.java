package c4;

import java.util.Scanner;

public class ControlDeFlujo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero = scanner.nextInt();
        if (numero == 10) {
            System.out.println("el numero es igual a 10");
        }
        else{
            System.out.println("el numero es diferente de 10");
        }




    }
}
