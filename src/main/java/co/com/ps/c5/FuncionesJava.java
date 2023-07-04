package co.com.ps.c5;

public class FuncionesJava {
    public static void main(String[] args) {

        saludar("Jorge");
        suma(29,12);
        resta(7,5);

    }
    public static int suma(int a, int b) {
       // int resultado = a+b;
        return a+b;
    }
    public static int resta(int a , int b){
        return a-b;
    }

    public static void saludar(String nombre){
        System.out.println("Saludos a, "+nombre);
    }
}
