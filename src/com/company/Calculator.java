package com.company;

import java.io.*;
import java.util.*;

public class Calculator {
    private Stack<Double> numbers;

    private Map<String, Operation> operations;

    public Calculator(){
        this.numbers = new Stack<>();
        this.operations = new HashMap<String, Operation>();
    }

    public void push(double value){
        this.numbers.push(value);
    }

    public void addOperation(Operation op){
        this.operations.put(op.getName(), op);
    }

    public void run(InputStream in, PrintStream out){
        Scanner scanner = new Scanner(in);

        while (true){
            out.printf("(%d): ", this.stackSize());

            String token = scanner.next();

            try{
                Double value = Double.parseDouble(token);
                this.push(value);
            }catch(NumberFormatException ex){
                execute(token);

                out.printf("%f\n", lastValue());
            }
        }
    }

    public void execute(String token){
        Operation op = operations.get(token);

        if (op == null){
            throw new RuntimeException(String.format("Operation %s not found", token));
        }

        op.execute();
    }

    public int stackSize(){
        return this.numbers.size();
    }

    public double lastValue(){
        return this.numbers.peek();
    }

    public double pop(){
        return this.numbers.pop();
    }
}
