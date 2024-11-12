package com.jfora.math;

public class Fraction {

    private final int integerVlue;

    public Fraction(int integerVlue) {
        this.integerVlue = integerVlue;
    }

    public Fraction plus(Fraction fraction) {
        return this;
    }

    public int intValue() {
        return this.integerVlue;
    }
}
