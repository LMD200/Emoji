import java.awt.event.MouseEvent;

import wheels.users.ConversationBubble;

public class Talkative extends Emoji {
	
	private ConversationBubble convo;
	
	
	public Talkative(int x, int y) {
		super(x, y);
		
		
		convo = new ConversationBubble("Hello");
		
		convo.hide();
	}
	
	public void mousePressed(MouseEvent e) {
	
		super.mousePressed(e);
	
		convo.show();
	}
	
	public void mousereleased(MouseEvent e) {
		
		super.mouseReleased(e);
		
		convo.hide();
	}
}