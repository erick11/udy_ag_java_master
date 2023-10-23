package pe.udemy.programacion_funcional_expresionesLambdas;

import java.util.Locale;
import java.util.function.Function;

public class J26_04_Function {

    public static void main(String[] args) {

        System.out.println("Example 01 --------------------------------------------------------------------------- ");
        Function<String, String> f1 = param ->  "Hola que tal!! " + param;
        String resultado = f1.apply("Erich");
        System.out.println(resultado);
        System.out.println();

        System.out.println("Example 02 --------------------------------------------------------------------------- ");
        Function<String, String > f2 = param -> param.toUpperCase();
        System.out.println(f2.apply("Erick"));
        System.out.println();

        System.out.println("Example 03 --------------------------------------------------------------------------- ");
        Function<String, String> f3 = String::toUpperCase;
        System.out.println(f2.apply("Erick02"));
        System.out.println();

    }
}
