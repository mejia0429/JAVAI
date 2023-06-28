package co.com.ps.calculadora;
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        int op;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("Elija una opcion para ejecutar la operación deseada");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVISION");
            System.out.println("5. POTENCIA");
            System.out.println("6. SALIR");
            op= leer.nextInt();

            switch (op){
                case 1:
                    Double sum = suma();
                    System.out.println("El resultado de la suma es: " + sum);
                    break;
                case 2:
                    double res = resta();
                    System.out.println("El resultado de la resta es: " + res);
                    break;
                case 3:
                    double mul = multiplica();System.out.println("El resultado de la multiplicación es: " + mul);
                    break;
                case 4:
                    try {
                        double div= divide();
                        System.out.println("El resultado de la multiplicación es: " + div);
                    } catch (ArithmeticException e) {
                        System.out.println("Error! No es posible diviir un número entre 0");
                    }
                    break;
                case 5:
                    double pot=potencia();
                    System.out.println("El resultado de la operación es: " + pot);
            }
        } while(op != 6);

        System.out.println("Gracias");

    }
    private static double potencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un número: ");
        double a = leer.nextDouble();
        System.out.println("Ingrese la potencia a cual desea elevarlo: ");
        double b = leer.nextDouble();
        double resultado= Math.pow(a,b);
        return resultado;
    }
    private static double divide() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite numero 1: ");
        double a = leer.nextDouble();
        System.out.println("Digite numero 2: ");
        double b = leer.nextDouble();
        double resultado = a/b;
        if (b == 0) {
          System.out.println("No se puede dividir entre 0");
        }
        return resultado;
    }
    private static double multiplica() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite numero 1: ");
        double a = leer.nextDouble();
        System.out.println("Digite numero 2: ");
        double b = leer.nextDouble();
        double resultado = a*b;
        return resultado;
    }
    private static double resta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite numero 1: ");
        double a = leer.nextDouble();
        System.out.println("Digite numero 2: ");
        double b = leer.nextDouble();
        double resultado = a-b;
        return resultado;
    }
    public static Double suma(){
            Scanner leer = new Scanner(System.in);
            System.out.println("Digite numero 1: ");
            double a = leer.nextDouble();
            System.out.println("Digite numero 2: ");
            double b = leer.nextDouble();
            double resultado = a+b;
            return resultado;
        }
    }


