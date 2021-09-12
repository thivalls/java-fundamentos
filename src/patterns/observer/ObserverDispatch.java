package patterns.observer;

@FunctionalInterface
public interface ObserverDispatch {
    public void dispatch(Event event);
}
