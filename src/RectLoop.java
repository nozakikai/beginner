
public class RectLoop extends MyFrame {
	public void run() {
		
		int x = 30;
		for (int i=0; i <10 ; i++) {
			setColor(x, x, x);
			fillRect(x, 80, 10, 100);
			x+=20;
			
		}
	}
}
