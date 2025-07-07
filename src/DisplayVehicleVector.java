import java.util.Vector;

public class DisplayVehicleVector extends MyFrame {
	public void run() {
		Vector<Vehicle> vehicles = new Vector<Vehicle>();
		vehicles.add(new Car(10, 30, 3, 0));
		vehicles.add(new Car(70, 100, -5, 0));
		vehicles.add(new Train(90, 150, 7, 0));
		vehicles.add(new Train(40, 200, -10, 0));
		vehicles.add(new Truck(0, 260, 12, 0));
		vehicles.add(new Truck(80, 320, 15, 0));
		while (true) {
			for (int i = 0; i < 30; i++) {
				clear();
				for (int j = 0; j < vehicles.size(); j++) {
					vehicles.get(j).draw(this);
					vehicles.get(j).move();
				}
				sleep(0.05);
			}
		}
	}

}
