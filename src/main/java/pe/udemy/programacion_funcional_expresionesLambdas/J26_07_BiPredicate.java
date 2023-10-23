package pe.udemy.programacion_funcional_expresionesLambdas;

import java.util.function.BiPredicate;

public class J26_07_BiPredicate {

    public static void main(String[] args) {

        System.out.println("Example 01 --------------------------------------------------------------------------- ");
        BiPredicate<String, String> t1 = (a, b) -> a.equals(b);
        System.out.println(t1.test("andres", "amdres"));
        System.out.println();

        System.out.println("Example 02 --------------------------------------------------------------------------- ");
        BiPredicate<String, String> t2 = String::equals;
        System.out.println(t2.test("andres", "amdres"));
        System.out.println();

        System.out.println("Example 03 --------------------------------------------------------------------------- ");
        BiPredicate<Integer, Integer> t3 = (i, j) -> j > i;
        boolean r2 = t3.test(5, 10);
        System.out.println(r2);
        System.out.println();

        System.out.println("Example 04 --------------------------------------------------------------------------- ");
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("maria");
        b.setNombre("maria");
        BiPredicate<Usuario, Usuario> t4 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(t4.test(a, b));
        System.out.println();

    }
}
