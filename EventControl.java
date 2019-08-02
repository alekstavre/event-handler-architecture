package event_design;

import java.util.HashMap;
import java.util.Map;

public class EventControl {

	private Map<Class<? extends Event>, Handler<? extends Event>> handlers;

	public EventControl() {
		handlers = new HashMap<>();
	}

	public <E extends Event> void registerHandler(Class<E> eventType, Handler<E> handler) {
		handlers.put(eventType, handler);
	}

	@SuppressWarnings("unchecked")
	public <E extends Event> void control(E event) {
		Handler<E> handler = (Handler<E>) handlers.get(event.getClass());
		if (handler != null) {
			handler.onEvent(event);
		}

	}

}
