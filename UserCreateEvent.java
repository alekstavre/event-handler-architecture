package event_design;

public class UserCreateEvent extends AbstractEvent{

	private User user;

	public UserCreateEvent(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;

	}

}
