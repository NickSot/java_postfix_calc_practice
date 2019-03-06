package com.company;

import java.util.Stack;

public class CompositeOperation extends AbstractOperation{
    private Stack<Operation> operations;

    public CompositeOperation(Calculator calc, String name) {
        super(calc, name);
        operations = new Stack<>();
    }

    public void addOperation(Operation op){
        this.operations.push(op);
    }

    @Override
    public void execute() {
        for (Operation op: this.operations){
            op.execute();
        }
    }
}
