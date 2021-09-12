package patterns.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Dispatcher {

    private List<ObserverDispatch> listeners = new ArrayList<>();

    public void registerListener(ObserverDispatch listener) {
        this.listeners.add(listener);
    }

    public void monitoring() {
        Scanner sc = new Scanner(System.in);

        String result = "";

        while (!"sair".equalsIgnoreCase(result)) {
            result = sc.nextLine();
            if (result.equalsIgnoreCase("dispatch")) {
                // Criar evento
                Event event = new Event(new Date());

                // disparar evento para todos ouvintes
                listeners.stream().forEach(listener -> listener.dispatch(event));
            } else {
                System.out.println("Ocorreu outro evento.");
            }
        }

        sc.close();
    }
}
