enum EventType{
    ARRIVAL,
    FINISH,
    START
}
public class Event implements Comparable<Event>{
    private int currentTime;
    private EventType type;

    public int getTime(){
        return currentTime;
    }
    public EventType getType(){
        return type;
    }

    public Event(int currentTime, EventType type){
        this.currentTime = currentTime;
        this.type = type;
    }
    public int compareTo(Event e){
        if (currentTime== e.currentTime)
            return 0;
        else if (currentTime>e.currentTime)
            return 1;
        else
            return -1;
    }
    @Override
    public String toString(){
        return(("event: \ntime: "+getTime() +"\nevent type: "+ getType()));
    }
}
