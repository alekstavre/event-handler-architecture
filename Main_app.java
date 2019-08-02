package event_design;

public class Main_app {

	public static void main(String[] args) {
		
		EventControl controler = new EventControl();
		controler.registerHandler(UserCreate.class, new UserCreateHandler());
		controler.registerHandler(UserUpdate.class, new UserUpdateHandler());
		
		User user = new User("drWho");
		
		controler.control(new UserCreate(user));
		controler.control(new UserUpdate(user));

	}

}
