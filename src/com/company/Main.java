package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.addOperation(new Negate(calc));
        calc.addOperation(new Absolute(calc));
        calc.addOperation(new Add(calc));
        calc.addOperation(new Substract(calc));
        calc.addOperation(new Divide(calc));
        calc.addOperation(new Multiply(calc));
        CompositeOperation cOp = new CompositeOperation(calc, "don't");
        cOp.addOperation(new Negate(cOp.getCalc()));
        cOp.addOperation(new Substract(cOp.getCalc()));
        calc.addOperation(cOp);
        calc.run(System.in, System.out);
    }
}
