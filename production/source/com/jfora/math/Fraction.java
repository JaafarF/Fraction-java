package com.jfora.math;

public class Fraction {

    private final int integerVlue;

    public Fraction(int integerVlue) {
        this.integerVlue = integerVlue;
    }

    public Fraction plus(Fraction that) {
        return that.integerVlue != 0 ? that : this;
    }

    public int intValue() {
        return this.integerVlue;
    }
}
