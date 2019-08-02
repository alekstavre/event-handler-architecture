package event_design;

import java.util.logging.Logger;

public class UserUpdateHandler implements Handler<UserUpdateEvent> {

	private static final Logger LOG = Logger.getLogger(UserCreateHandler.class.getName());

	@Override
	public void onEvent(UserUpdateEvent event) {
		LOG.info("user:" + event.getUser().getUserName() + " created");

	}

}
