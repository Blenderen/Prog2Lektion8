package opgave01.models;

import java.util.Arrays;

public class TwoDimensionalIntArray {
    private int[][] intArray;

    public TwoDimensionalIntArray(int[][] intArray) {
        this.intArray = intArray;
    }

    public void setValueAt(int row, int column, int value) {
        intArray[row][column] = value;
    }

    public int getValueAt(int row, int column) {
        return intArray[row][column];
    }


    public int sumRow(int row) {
        int sum = 0;
        for (int i = 0; i < intArray[row].length; i++) {
            sum += intArray[row][i];
        }
        return sum;
    }

    public int sumColumn(int column) {
        int sum = 0;
        for (int[] rows : intArray) {
            sum += rows[column];
        }
        return sum;
    }

    public int sumAll() {
        int sum = 0;
        for (int[] ints : intArray) {
            for (int anint : ints) {
                sum += anint;
            }
        }
        return sum;
    }

    public void print() {
        for (int[] ints : intArray) {
            for (int i : ints) {
                System.out.printf("%4d",i);
            }
            System.out.println();
        }

    }

    public void map(IntFunction function) {

    }

    public static double averageMajorDiagonal(double[][] m){
        double sum = 0;
        double count = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
            count++;
        }
        return sum/count;
    }

    public static int[] locateSmallest(double[][] a){
        int[] res = new int[2];
        double smallest = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < smallest) {
                    smallest = j;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
