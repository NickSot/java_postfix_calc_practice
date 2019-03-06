package com.company;

public class Absolute extends UnaryOperation {
    private Calculator calc;

    public Absolute(Calculator calc){
        super(calc, "abs");
    }

    @Override
    public void execute() {
        double value = this.getCalc().pop();

        if (value < 0){
            value = -value;
        }

        this.getCalc().push(value);
    }

    @Override
    protected double calculate(double value) {
        return value < 0 ? -value : value;
    }
}
