package opgave5fravaer;

import java.util.Arrays;

public class FravaersSystem {
	/**
	 * Fraværstallene udskrives på skærmen
	 *
	 * @param fravaer
	 */
	public void udskrivFravaer(int[][] fravaer) {
		System.out.printf("%10s","Elev\\Måned");
		for (int i = 1; i <= fravaer[0].length; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		System.out.println("----------------------------------------------------------");
		int j = 1;

		for (int[] ints : fravaer) {

			System.out.printf("%8d |",j);
			j++;
			for (int i : ints) {
				System.out.printf("%4d",i);
			}
			System.out.println();
		}
	}

	/**
	 * Returnerer det samlede antal fravaerdage over 12 måneder for eleven med
	 * elevnr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public int samletFravaer(int[][] fravaer, int elevNr) {
		int res = 0;
		for (int i = 0; i < fravaer.length; i++) {
				res += fravaer[i][elevNr];

		}
		return res;
	}

	/**
	 * Returnerer det gennemsnitlige antal fraværsdage pr måned for eleven med
	 * elevNr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public double gennemsnit(int[][] fravaer, int elevNr) {
		int res = 0;
		double count = 0.0;
		for (int i = 0; i < fravaer.length; i++) {
			res += fravaer[i][elevNr];
			count++;
		}
		return res/count;
	}

	/**
	 * Returnerer antallet af elever der ikke har haft fravær i de 12 måneder.
	 *
	 * @param fravaer
	 * @return
	 */
	public int antalUdenFravaer(int[][] fravaer) {
		int res = 0;
		for (int i = 0; i < fravaer.length; i++) {
			int elev = 0;
			for (int j = 0; j < fravaer[i].length; j++) {
				if (fravaer[i][j] == 0 && elev == 0){
					elev++;
					res++;
				}
			}
		}
		return res;
	}

	/**
	 * Returnerer elevNr for den elev der har haft mest fravær igennem de 12
	 * måneder. Hvis flere elever har haft højst fravær, returneres elevnummer
	 * for en af disse.
	 *
	 * @param fravaer
	 * @return
	 */
	public int mestFravaer(int[][] fravaer) {
		int max = -1;
		int maxElevNr = 0;
		int elevNr = 0;
		for (int[] elev: fravaer) {
			int sum = 0;
			elevNr++;
			for (int f : elev) {
				sum += f;
			}
			if (max < sum){
				max = sum;
				maxElevNr = elevNr;
			}
		}
		return maxElevNr;
	}

	/**
	 * Registrerer at elenven med elevNr ikke har haft fravær i nogen af de 12
	 * måneder.
	 *
	 * @param fravaer
	 * @param elevNr
	 */
	public void nulstil(int[][] fravaer, int elevNr) {
		for (int i = 0; i < fravaer.length; i++) {
			for (int j = 0; j < fravaer[i].length; j++) {
				fravaer[i][j] = 0;
			}
		}
	}
}
