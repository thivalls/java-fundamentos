package lambdas;

@FunctionalInterface
public interface Calculo {
    public abstract Double executar(double value1, double value2);

    /*
     * podemos criar apenas métodos default
     */
    default String hello(String name) {
        return "Olá " + name;
    }

    /*
     * podemos criar apenas métodos default
     */
    default String corra(String name) {
        return "Corre " + name + " que atrás vem gente!!!";
    }

    /*
     * podemos criar métodos estáticos
     */
    static String ola(String name) {
        return "Olá " + name;
    }
}
