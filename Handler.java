package event_design;

public interface Handler <E extends Event>{

	void onEvent(E event);
	
}
