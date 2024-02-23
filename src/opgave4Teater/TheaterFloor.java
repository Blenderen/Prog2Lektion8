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
        if (seats[row][seat] != 0){
			seats[row][seat] = 0;
			return true;
		}
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
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				if (seats[i][j] == price) {
					seats[i][j] = 0;
					return true;
				}
			}
		}
		return false;

	}

	public void printTheaterFloor() {
		System.out.println("De ledige pladser er angivet med deres pris");
		System.out.printf("%9s","Sæde :");
		for (int i = 0; i < seats[0].length; i++) {
			System.out.printf("%4d", i+1);
		}
		System.out.println();
		System.out.println("           --------------------------------------");

		for (int i = 0; i < seats.length; i++) {
			System.out.printf("%9s",("Række " + (i+1) + " :  "));
			for (int k = 0; k < seats[i].length; k++) {
				if (seats[i][k] == 0){
					System.out.printf("%3s ", "--,");
				} else if (seats[i].length-1 == k){
					System.out.printf("%2d ",seats[i][k]);
				} else {
					System.out.printf("%2d, ",seats[i][k]);
				}
			}
			System.out.println();
		}
	}
}
