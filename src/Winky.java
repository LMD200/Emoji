
public class Winky extends Emoji{

	public Winky(int x, int y) {
		super(x, y);
	}
	
	
	public void mousePressed(java.awt.event.MouseEvent e) {
		super.mousePressed(e);

		super.leye.setSize(30, 5);
		
		super.leye.setLocation(leye.getLocation().x, leye.getLocation().y+15);
	}
	
	public void mouseReleased(java.awt.event.MouseEvent e) {
		super.mouseReleased(e);
		
		super.leye.setSize(27, 30);
		
		super.leye.setLocation(leye.getLocation().x, leye.getLocation().y-15);
	}	
}