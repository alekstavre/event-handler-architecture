package event_design;

public interface Event {

	Class<? extends Event> getType();

}
