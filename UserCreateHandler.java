package event_design;

import java.util.logging.Logger;

public class UserCreateHandler implements Handler<UserCreateEvent> {

	private static final Logger LOG = Logger.getLogger(UserCreateHandler.class.getName());
	
	@Override
	public void onEvent(UserCreateEvent event) {
		LOG.info("user:" + event.getUser().getUserName() + " updated");

	}

}
