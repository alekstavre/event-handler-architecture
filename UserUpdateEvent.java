package event_design;

public class UserUpdateEvent extends AbstractEvent{

	private User user;

	public UserUpdateEvent(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}
