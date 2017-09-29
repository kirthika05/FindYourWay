package com.example.kirthikas.findyourway;

import java.util.Stack;

/**
 * Created by kirthikas on 9/28/17.
 */

public class Path {

    public Stack<Integer> path;
    public int sum;

    public Path(){
        super();
        this.path = new Stack<>();
        this.sum = 0;
    }

    public Path(int[] path,int sum){
        super();
        this.path = new Stack<>();
        this.sum = sum;
    }

    public boolean checkSum(){
            if(sum>50){
                return false;
            }
            return true;
    }

}
