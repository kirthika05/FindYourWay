package com.example.kirthikas.findyourway;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kirthikas on 9/28/17.
 */

public class Grid {

    int[][] matrix;

    Grid(int[][] matrix) {
        if (matrix.length < 1 || matrix.length > 10) {
            throw new IllegalArgumentException("Row values must be between 1-10");
        } else if (matrix[0].length < 5 || matrix[0].length > 100) {
            throw new IllegalArgumentException("Column values must be between 5-100");
        }
        this.matrix = matrix;
    }

    public int getValueForRowAndColumn(int row, int column) {

        return matrix[row - 1][column - 1];
    }

    public int getRowCount() {

        return matrix.length;
    }

    public int getColumnCount() {

        return matrix[0].length;
    }

    public List<Integer> getRowsAdjacentTo(int rowNumber) {
        Set<Integer> adjacentRows = new HashSet<Integer>();
        if (isValidRow(rowNumber)) {
            adjacentRows.add(rowNumber);
            adjacentRows.add(getRowAbove(rowNumber));
            adjacentRows.add(getRowBelow(rowNumber));
        }
        return new ArrayList<Integer>(adjacentRows);
    }

    public String asFormattedString(String delimiter) {
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                builder.append(matrix[row][column]);
                if (column < matrix[row].length - 1) {
                    builder.append(delimiter);
                }
            }
            if (row < matrix.length - 1) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }

    private boolean isValidRow(int rowNumber) {
        return (rowNumber > 0) && (rowNumber <= matrix.length);
    }

    private int getRowAbove(int rowNumber) {
        int potentialRowNumber = rowNumber - 1;
        return (potentialRowNumber < 1) ? matrix.length : potentialRowNumber;
    }

    private int getRowBelow(int rowNumber) {
        int potentialRowNumber = rowNumber + 1;
        return (potentialRowNumber > matrix.length) ? 1 : potentialRowNumber;
    }
}
