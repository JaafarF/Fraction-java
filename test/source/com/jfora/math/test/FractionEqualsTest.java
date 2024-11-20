package com.jfora.math.test;

import com.jfora.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {

    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }

    @Test
    public void differentNumerators() throws Exception {
        assertNotEquals(new Fraction(1, 5), new Fraction(2, 5));
    }

    @Test
    public void differentDenominators() throws Exception {
        assertNotEquals(new Fraction(3, 5), new Fraction(3, 7));
    }

    @Test
    public void wholeNumberEqualsSameFraction() throws Exception {
        assertEquals(new Fraction(3), new Fraction(3, 1));
    }

    @Test
    public void wholeNumberNotEqualToDifferentWholeNumber() throws Exception {
        assertNotEquals(new Fraction(3), new Fraction(5));
    }
}
