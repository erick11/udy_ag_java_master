package pe.udemy.programacion_funcional_expresionesLambdas;

import java.util.function.Predicate;

public class J26_06_Predicate {

    public static void main(String[] args) {

        System.out.println("Example 01 --------------------------------------------------------------------------- ");
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(7);
        System.out.println("r= " + r);
        System.out.println();

        System.out.println("Example 02 --------------------------------------------------------------------------- ");
        Predicate<Integer> t2 = num -> num > 10;
        boolean r2 = test.test(10);
        System.out.println("r= " + r2);
        System.out.println();

        System.out.println("Example 03 --------------------------------------------------------------------------- ");
        Predicate<String> t3 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t3.test("ROLE_ADMIN"));
        System.out.println();
    }

}
