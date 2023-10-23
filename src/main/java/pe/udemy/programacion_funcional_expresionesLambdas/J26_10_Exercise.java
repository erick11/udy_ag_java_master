package pe.udemy.programacion_funcional_expresionesLambdas;

import java.util.Arrays;
import java.util.function.Consumer;

public class J26_10_Exercise {
    /*
    Expresión Lambda que cuenta la cantidad de veces que se repiten las palabras de una frase y devuelva la mas repetida
    */
    public static void main(String[] args) {
        System.out.println("Example 01 | Consumer --------------------------------------------------------------------------- ");
        /*
        Consumer<String> consumer = parameter -> System.out.println(Arrays.stream(
                                                                    parameter.split("\\s+|\n")).
                                                                    filter());

        consumer.accept("lorem impsum armet amet, hello     world");
        */


        String text = "lorem impsum armet amet, hello     world";
        System.out.println(text.split("\\s+|\n").length);
    }
}
