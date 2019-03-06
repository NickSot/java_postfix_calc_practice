package com.company;

public class Multiply extends BinaryOperation {
    public Multiply(Calculator calc) {
        super(calc, "*");
    }

    @Override
    public double calculate(double val1, double val2) {
        return val1 * val2;
    }
}
