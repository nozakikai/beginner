
public class Animation extends MyFrame {
	public void run() {
		int x = 60;
		int y = 180;

		while (y > 40) { //永久に繰り返す
			//(1)画面を消す
			clear();
			//(2)四角を表示する
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);
			y-=5;
			sleep(0.01);
		}
		
		while (x <= 300) { //永久に繰り返す
			//(1)画面を消す
			clear();
			//(2)四角を表示する
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);
			x+=5;
			sleep(0.01);
		}

	}

}
