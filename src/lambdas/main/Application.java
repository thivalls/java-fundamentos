package lambdas.main;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Thi", "Gui", "Ana", "Bia");

        for (String name : aprovados) {
            System.out.println(name);
        }

        // Usando Lambda
        System.out.println("-----------------------------");
        aprovados.forEach(Application::imprimir);
    }

    static void imprimir(String name) {
        System.out.println("meu motor de impressao >>> " + name);
    }
}
