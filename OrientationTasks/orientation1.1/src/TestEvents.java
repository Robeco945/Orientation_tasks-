public class TestEvents {
    public static void main(String[] arg){
        Event event1 = new Event(2, EventType.START);
        Event event2 = new Event(5, EventType.ARRIVAL);
        Event event3 = new Event(10, EventType.FINISH);
        EventList list = new EventList();
        list.addEvent(event1);
        list.addEvent(event2);
        list.addEvent(event3);
        System.out.println(list.getNextEvent());
        while (!list.isEmpty()) {
            Event e = list.getNextEvent();
            System.out.println(e);
        }
    }
}
