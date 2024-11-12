package com.jfora.math;

public class Fraction {

    private final int integerVlue;

    public Fraction(int integerVlue) {
        this.integerVlue = integerVlue;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.integerVlue + that.integerVlue);
    }

    public int intValue() {
        return this.integerVlue;
    }
}
