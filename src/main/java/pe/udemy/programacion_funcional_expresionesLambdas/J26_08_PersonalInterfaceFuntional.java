package pe.udemy.programacion_funcional_expresionesLambdas;

import pe.udemy.programacion_funcional_expresionesLambdas.aritmetica.Aritmetica;
import pe.udemy.programacion_funcional_expresionesLambdas.aritmetica.Calculadora;

public class J26_08_PersonalInterfaceFuntional {

    /*
    Crear interfaces funcionales personales
    */
    public static void main(String[] args) {

        Aritmetica suma  = (a, b) -> a + b;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10, 5, suma));
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10, 5,(a, b) -> a * b));
        System.out.println(cal.computarBiFuntion(10, 5, (a, b)-> a+b));

    }
}
