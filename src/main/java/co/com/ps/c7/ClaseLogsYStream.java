package co.com.ps.c7;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
public class ClaseLogsYStream {
    private static final Logger logger = Logger.getLogger(ClaseLogsYStream.class.getName());

    public static void main (String[] args){

        logger.info( "Este es un mensaje de información");
        logger.warning("este es un mensaje de advertencia");
        logger.severe("este es un mensaje de error grave");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(n -> n % 2 == 0) //fILYRA NUMERO PARES
                .forEach(System.out::println);

        List<String> strings = Arrays.asList("Hola", "Mundo", "Java", "Stream");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        strings.stream()
                .map(String::length) //MAPEA CADA CADENA
                .forEach(System.out::println);



    }


}
