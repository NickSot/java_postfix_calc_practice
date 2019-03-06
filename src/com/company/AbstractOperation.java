package com.company;

public abstract class AbstractOperation implements Operation{
    private Calculator calc;
    private String name;

    public AbstractOperation(Calculator calc, String name){
        this.calc = calc;
        this.name = name;
    }

    protected Calculator getCalc() {
        return calc;
    }

    @Override
    public String getName() {
        return name;
    }
}
