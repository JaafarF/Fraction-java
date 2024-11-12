package com.jfora.math;

public class Fraction {

    private final int integerVlue;

    public Fraction(int integerVlue) {
        this.integerVlue = integerVlue;
    }

    public Fraction plus(Fraction that) {
        if (that.integerVlue  != 0) {
            return new Fraction(this.integerVlue + that.integerVlue);
        } else {
            return this;
        }
    }

    public int intValue() {
        return this.integerVlue;
    }
}
