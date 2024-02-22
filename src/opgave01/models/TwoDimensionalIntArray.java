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
            for (int anint : ints) {
                System.out.printf("%4d",anint);
            }
        }

    }

    public void map(IntFunction function) {
    }


}
