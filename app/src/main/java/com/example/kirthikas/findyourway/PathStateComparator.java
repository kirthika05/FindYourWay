package com.example.kirthikas.findyourway;

import java.util.Comparator;

/**
 * Created by kirthikas on 9/28/17.
 */

public class PathStateComparator implements Comparator<PathState> {

    private static int SORT_LEFT = -1;
    private static int SORT_RIGHT = 1;
    private static int SORT_EQUAL = 0;

    @Override
    public int compare(PathState leftPath, PathState rightPath) {
        int comparedLength = compareLengths(leftPath, rightPath);
        return (comparedLength != 0) ? comparedLength : compareCosts(leftPath, rightPath);
    }

    private int compareLengths(PathState leftPath, PathState rightPath) {
        int leftLength = getLengthFromPath(leftPath);
        int rightLength = getLengthFromPath(rightPath);

        return (leftLength > rightLength) ? SORT_LEFT : (leftLength == rightLength) ? SORT_EQUAL : SORT_RIGHT;
    }

    private int compareCosts(PathState leftPath, PathState rightPath) {
        int leftCost = getCostFromPath(leftPath);
        int rightCost = getCostFromPath(rightPath);

        return (leftCost < rightCost) ? SORT_LEFT : (leftCost == rightCost) ? SORT_EQUAL : SORT_RIGHT;
    }

    private int getLengthFromPath(PathState path) {
        if (path != null) {
            return path.getPathLength();
        } else {
            return Integer.MIN_VALUE;
        }
    }

    private int getCostFromPath(PathState path) {
        if (path != null) {
            return path.getTotalCost();
        } else {
            return Integer.MAX_VALUE;
        }
    }
}
