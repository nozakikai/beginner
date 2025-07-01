
public class RectLoop extends MyFrame {
	public void run() {
		setColor(0, 128, 0);
		int x = 30;
		for (int i=0; i <10 ; i++) {

			fillRect(x, 50+x, 10, 100);
			x+=20;
			
		}
	}
}
