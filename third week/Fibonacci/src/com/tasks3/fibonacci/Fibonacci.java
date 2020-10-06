package com.tasks3.fibonacci;

public class Fibonacci {
    Fibonacci(){}
    public long getNumber(int position){
        if (position < 1) {
            return -1;
        }
        else if (position == 1 || position == 2) {
            return 1;
        }
        else {
            return getNumber(position-2)+getNumber(position-1);
        }
    }
}
