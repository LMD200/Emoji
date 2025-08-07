
public class App extends wheels.users.Frame{
	
	private Emoji talkative;
	
	private Emoji winky;
	
		
	public App() {
		
		talkative = new Talkative(100, 200);
		
		winky = new Winky(300, 300);
	}

public static void main (String[] args) {
	
		new App();
	}
}