package pe.udemy.programacion_funcional_expresionesLambdas;

import java.util.function.Supplier;

public class J26_03_Supplier {

    public static void main(String[] args) {

        System.out.println("Example 01 --------------------------------------------------------------------------- ");
        Supplier<String> proveedor = () -> {
            return "Hola Mundo lambda supplier";
        };
        System.out.println(proveedor.get());
        System.out.println();

        System.out.println("Example 02 --------------------------------------------------------------------------- ");
        //Es equivalente al example 01
        Supplier<String> proveedor02 = () -> "Hola Mundo lambda supplier";
        System.out.println(proveedor02.get());
        System.out.println();

        System.out.println("Example 03 --------------------------------------------------------------------------- ");
        //Lo inicializa, pero no setea los atributo; por ello, imprime null
        //Supplier<Usuario> creaUsuario = () -> new Usuario();
        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();
        System.out.println(usuario.getNombre());
        System.out.println();

        System.out.println("Example 04 --------------------------------------------------------------------------- ");
        Supplier<Usuario> supplierUsuario04 = () -> {
            Usuario user = new Usuario();
            user.setNombre("Erick");
            return user;
        };
        System.out.println(supplierUsuario04.get());
        System.out.println(supplierUsuario04.get().getNombre());
        System.out.println();

        System.out.println("Example 05 --------------------------------------------------------------------------- ");
        Supplier<Usuario> supplierUsuario05 = () -> new Usuario("erich");
        System.out.println(supplierUsuario05.get());
        System.out.println(supplierUsuario05.get().getNombre());
        System.out.println();
    }

}
