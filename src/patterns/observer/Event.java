package patterns.observer;

import java.util.Date;

public class Event {
    private Date moment;

    public Event(Date moment) {
        this.moment = moment;
    }

    public Date getMoment() {
        return this.moment;
    }
}
