package opgave4Teater;

public class TheaterFloor {
	int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
			{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

	/**
	 * Hvis plads seat på række row er ledig reserveres pladsen og der returneres true
	 * Der returneres false hvis pladsen er optaget.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */

	public boolean buySeat(int row, int seat) {
		// TODO
		return false;
	}

	/**
	 * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
	 * der returneres true. Der returneres false, hvis der ikke er nogen pladser ledige
	 * til den pågældende pris.
	 *
	 * @param price
	 * @return
	 */
	public boolean buySeat(int price) {
		// TODO
		return false;

	}

	public void printTheaterFloor() {
		// TODO
		System.out.println("De ledige pladser er angivet med deres pris");
		System.out.print("Sæde:");
		for (int i = 0; i <= seats[0].length; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		System.out.println("--------------------------------------");
		int row = 1;
		for (int i = 0; i < seats.length; i++) {
			if (i ==0){
				System.out.printf("Række: %d",row);
				row++;
			}
			for (int j = 0; j < seats[i].length; j++) {

			}
		}
	}
}
