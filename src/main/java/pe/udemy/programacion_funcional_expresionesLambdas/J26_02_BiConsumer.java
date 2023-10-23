package pe.udemy.programacion_funcional_expresionesLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class J26_02_BiConsumer {

    /*
    Es como un metodo void ==> 2 argumento
    */
    public static void main(String[] args) {

        System.out.println("Example 01 --------------------------------------------------------------------------- ");
        BiConsumer<String, Integer> biConsumer = (nombre, edad) -> {
            System.out.println(nombre + ", tiene " + edad + " años!");
        };
        biConsumer.accept("pepe", 20);
        System.out.println();

        System.out.println("Example 02 --------------------------------------------------------------------------- ");
        //Como es una sola linea de codigo se puede omitir las llaves
        BiConsumer<String, Integer> biConsumer02 = (nombre, edad) -> System.out.println(nombre + ", tiene " + edad + " años!");
        biConsumer02.accept("pepe", 20);
        System.out.println();

        System.out.println("Example 03 --------------------------------------------------------------------------- ");
        Consumer<String> consumidor = System.out::println;
        List<String> nombres = Arrays.asList("Andres", "Pepe", "Luz", "Paco");
        nombres.forEach(consumidor);
        System.out.println();

        System.out.println("Example 04 --------------------------------------------------------------------------- ");
        Usuario usuario = new Usuario();
        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> {
            persona.setNombre(nombre);
        };
        asignarNombre.accept(usuario, "Andres");
        System.out.println("Nombre usuarip: " + usuario.getNombre());

        System.out.println("Example 05 --------------------------------------------------------------------------- ");
        Usuario usuarioReferciaMetodo = new Usuario();
        BiConsumer<Usuario, String> asignarNombreReferenciaMetodo = Usuario::setNombre;
        asignarNombreReferenciaMetodo.accept(usuarioReferciaMetodo, "Miguel");
        System.out.println("Nombre usuario(ReferenciaMetodo): " + usuarioReferciaMetodo.getNombre());
        System.out.println();
    }

}
