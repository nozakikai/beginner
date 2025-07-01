
public class Animation extends MyFrame {
	public void run() {
		int x = 60;
		int y = 40;
		for (x = 30; x <= 300; x += 30) {
			clear();
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);

			sleep(0.05);
		}
		for (x = 300; x >= 30; x -= 30) {
			clear();
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);

			sleep(0.05);
		}
		for (x = 30; x <= 300; x += 30) {
			clear();
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);

			sleep(0.05);
		}
	}

}
