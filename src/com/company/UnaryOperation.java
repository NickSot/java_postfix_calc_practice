package com.company;

public abstract class UnaryOperation extends AbstractOperation {
    public UnaryOperation(Calculator calc, String name) {
        super(calc, name);
    }

    @Override
    public void execute() {
        double value = this.getCalc().pop();

        this.getCalc().push(this.calculate(value));
    }

    protected abstract double calculate(double value);
}
