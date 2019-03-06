package com.company;

public abstract class BinaryOperation extends AbstractOperation {

    public BinaryOperation(Calculator calc, String name) {
        super(calc, name);
    }

    @Override
    public void execute() {
        double value1 = this.getCalc().lastValue();

        this.getCalc().pop();

        double value2 = this.getCalc().lastValue();
        try {
            this.getCalc().push(calculate(value1, value2));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public abstract double calculate(double val1, double val2) throws Divide.ZeroDivisionException;
}
