package pe.udemy.programacion_funcional_expresionesLambdas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

public class J26_01_Consumer {
    /*
    Es como un metodo void ==> Solo un argumento
    */
    public static void main(String[] args) {

        System.out.println("Example 01 --------------------------------------------------------------------------- ");
        Consumer<String> consumidor = saludo -> System.out.println(saludo);
        consumidor.accept("Hello World");
        System.out.println();

        System.out.println("Example 02 --------------------------------------------------------------------------- ");
        // Referencias de metodos
        Consumer<String> consumidor02 = System.out::println;
        consumidor02.accept("Referencia de Metodo");
        System.out.println();

        System.out.println("Example 03 --------------------------------------------------------------------------- ");
        Consumer<Date> consumidorDate = fecha ->{
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidorDate.accept(new Date());
        System.out.println();
    }
}
