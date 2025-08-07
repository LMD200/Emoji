import wheels.users.Ellipse;

public class Emoji extends Ellipse {
	
	private Ellipse reye;
	protected Ellipse leye;
	private Ellipse mouth;
	
	public Emoji(int x, int y) {
		super(x, y);
		super.setSize(100, 100);
		
		
			leye = new Ellipse(java.awt.Color.green);
			
			leye.setSize(27, 30);
			
			leye.setLocation(x+22, y+10);
			
			
			reye = new Ellipse(java.awt.Color.yellow);
					
			reye.setSize(27, 30);
			
			reye.setLocation(x+50, y+10);
			
			mouth = new Ellipse(java.awt.Color.pink);
			
			mouth.setSize(50, 15);
			
			mouth.setLocation(x+25, y+60);	
		}
		
		
		public void mousePressed(java.awt.event.MouseEvent e) {	
			super.setColor(java.awt.Color.pink);
		}	
		
		public void mouseReleased(java.awt.event.MouseEvent e) {
			super.setColor(java.awt.Color.red);
	}
}	