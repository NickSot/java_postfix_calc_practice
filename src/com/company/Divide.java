package com.company;

public class Divide extends BinaryOperation {
    public Divide(Calculator calc) {
        super(calc, "/");
    }

    class ZeroDivisionException extends Exception{
        public ZeroDivisionException() { }
    }

    @Override
    public double calculate(double val1, double val2) throws ZeroDivisionException {
        if (val2 == 0)
            throw new ZeroDivisionException();

        return val1 / val2;
    }
}
