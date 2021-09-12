package patterns.observer;

public class Application {
    public static void main(String[] args) {
        System.out.println("Iniciando entendimento do padrão Observer");

        // Criando ouvintes/listeners
//        ListenerEvent namorada = new ListenerEvent();
//        ListenerEvent1 namorada1 = new ListenerEvent1();

        // Criando disparador/dispatcher
        Dispatcher porteiro = new Dispatcher();

        // Registrando ouvintes para receberem notificações
        porteiro.registerListener(e -> System.out.println("Evento numero 1"));
        porteiro.registerListener(e -> System.out.println("Evento numero 2"));

        porteiro.monitoring();
    }
}
