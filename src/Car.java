
public class Car extends Vehicle {

	public Car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame) {
		frame.fillRect(x + 20, y, 48, 20);
		frame.fillRect(x, y + 20, 90, 20);
		frame.fillOval(x + 15, y + 40, 15, 15);
		frame.fillOval(x + 50, y + 40, 15, 15);
	}

}
