package pe.udemy.programacion_funcional_expresionesLambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class J26_09_Exercise {
    /*
    Expresión Lambda que elimine espacios.
    */
    public static void main(String[] args) {

        System.out.println("Example 01 | Consumer --------------------------------------------------------------------------- ");
        Consumer<String> consumer = parameterConsumer -> System.out.println(parameterConsumer.replace(" ", "")) ;
        consumer.accept("Erick Eduardo Navarrete Guerrero");
        System.out.println();

        System.out.println("Example 02 | Supplier --------------------------------------------------------------------------- ");
        Supplier<String> supplier = () -> {
            return "Erick Eduardo Navarrete Guerrero".replace(" ", "");
        };
        System.out.println(supplier.get());
        System.out.println();

        System.out.println("Example 03 | Function --------------------------------------------------------------------------- ");
        Function<String, String> funtion = param ->  param.replace(" ", "");
        String resultFuntion = funtion.apply("Erick Eduardo Navarrete Guerrero");
        System.out.println(resultFuntion);


    }
}
