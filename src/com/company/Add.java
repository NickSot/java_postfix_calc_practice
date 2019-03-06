package com.company;

public class Add extends BinaryOperation {

    public Add(Calculator calc) {
        super(calc, "+");
    }

    @Override
    public double calculate(double val1, double val2) {
        return val1 + val2;
    }
}
