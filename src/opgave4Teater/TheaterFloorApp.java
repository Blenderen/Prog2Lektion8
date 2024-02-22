package opgave4Teater;

public class TheaterFloorApp {

	public static void main(String[] args) {
		TheaterFloor theater = new TheaterFloor();
		// TODO
		theater.printTheaterFloor();
		theater.buySeat(20);
		theater.buySeat(3,6);
		System.out.println(theater.buySeat(3, 6));
		theater.printTheaterFloor();
	}
}
