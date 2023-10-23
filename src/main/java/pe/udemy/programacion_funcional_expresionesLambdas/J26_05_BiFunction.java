package pe.udemy.programacion_funcional_expresionesLambdas;

import java.util.function.BiFunction;

public class J26_05_BiFunction {

    /*
     Recibes 2 argimentos y retornas 1 valor
    */
    public static void main(String[] args) {
        System.out.println("Example 01 --------------------------------------------------------------------------- ");
        BiFunction <String, String, String> f1 = (a, b) -> a.toUpperCase().concat(" ").concat(b.toUpperCase());
        String r2 = f1.apply("Erick", "Navarrete");
        System.out.println(r2);
        System.out.println();

        System.out.println("Example 02 --------------------------------------------------------------------------- ");
        BiFunction <String, String, Integer> f2 = (a, b) -> a.compareTo(b);
        System.out.println(f2.apply("andres","andres2"));
        System.out.println();

        System.out.println("Example 03 ≡ Example 02 -------------------------------------------------------------- ");
        BiFunction <String, String, Integer> f3 = String::compareTo;
        System.out.println(f2.apply("andres","andres2"));
        System.out.println();

        System.out.println("Example 04 --------------------------------------------------------------------------- ");
        BiFunction <String, String, String> f4 = String::concat; // (a,b) -> a.concat(b);
        System.out.println(f4.apply("erich","Navarrete"));
        System.out.println();

     }
}
