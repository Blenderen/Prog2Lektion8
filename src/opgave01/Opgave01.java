package opgave01;

import opgave01.models.TwoDimensionalIntArray;

public class Opgave01 {
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 17, 23, 0, -1},
                {34, 12, 41, -17, 51},
                {1, 2, 3, 4, 5}
        };
        TwoDimensionalIntArray twoDimensionalIntArray = new TwoDimensionalIntArray(numbers);

        twoDimensionalIntArray.setValueAt(2, 4, 101);
        System.out.println(twoDimensionalIntArray.getValueAt(2, 4));
        System.out.println(twoDimensionalIntArray.sumRow(1));
        System.out.println(twoDimensionalIntArray.sumColumn(3));
        twoDimensionalIntArray.print();



        double[][] numb = {
                {2, 17, 23, 0, 1},
                {34, 12.5, 41, 17, 51},
                {1, 2, 3, 4, 5},
                {2,4,6,8,10}
        };
        System.out.println(TwoDimensionalIntArray.averageMajorDiagonal(numb));
    }
}
