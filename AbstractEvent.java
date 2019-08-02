package event_design;

public class AbstractEvent implements Event {

	@Override
	public Class<? extends Event> getType() {
		return getClass();
	}
}
