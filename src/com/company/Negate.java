package com.company;

public class Negate extends UnaryOperation{
    private Calculator calc;

    public Negate(Calculator calc) {
        super(calc, "neg");
    }

    public void execute(){
        double value = -this.getCalc().pop();

        this.getCalc().push(value);
    }

    @Override
    protected double calculate(double value) {
        return -value;
    }
}
