package com.example.kirthikas.findyourway;

/**
 * Created by kirthikas on 9/28/17.
 */

public class PathStateCollector {

    private PathState bestPath;
    private PathStateComparator comparator;

    public PathStateCollector() {
        comparator = new PathStateComparator();
    }

    public PathState getBestPath() {
        return bestPath;
    }

    public void addPath(PathState newPath) {
        if (comparator.compare(newPath, bestPath) < 0) {
            bestPath = newPath;
        }
    }
}
