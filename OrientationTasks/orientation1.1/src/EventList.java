import java.util.PriorityQueue;

public class EventList {
    PriorityQueue<Event> events = new PriorityQueue<>();
    public void addEvent(Event e){
        events.add(e);
    }
    public Event getNextEvent(){
        Event next = events.poll();
        return next;
    }
    public boolean isEmpty(){
        return events.isEmpty();
    }
}
