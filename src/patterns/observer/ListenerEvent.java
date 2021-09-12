package patterns.observer;

public class ListenerEvent implements ObserverDispatch {
    @Override
    public void dispatch(Event event) {
        System.out.println("Evento foi disparado - executar alguma coisa");
    }
}
