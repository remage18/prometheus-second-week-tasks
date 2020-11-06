package com.tasks7.rpn;

import java.util.Deque;
import java.util.LinkedList;

public class RPN {

    public static double parse(String [] rpnString) {
        Deque<Double> rpn = new LinkedList<>();
        for(String trivial: rpnString) {
            try {
                rpn.push(Double.parseDouble(trivial));
            } catch(NumberFormatException e) {
                double last_val = rpn.pop();
                switch (trivial) {
                    case "+" -> rpn.add(rpn.pop() + last_val);
                    case "-" -> rpn.add(rpn.pop() - last_val);
                    case "*" -> rpn.add(rpn.pop() * last_val);
                    case "/" -> {
                        if (last_val == 0) {
                            throw new ArithmeticException();
                        }
                        rpn.add(rpn.pop() / last_val);
                    }
                    default -> throw new RPNParserException("Incorrect symbol found", trivial);
                }
            }
        }
        if(rpn.size() == 1) {
            return rpn.remove();
        } else {
            throw new RPNParserException("Incorrect quantity of numbers and symbols");
        }
    }

    public static void main(String[] args) {
        if(args != null) {
            System.out.println(parse(args));
        }
    }
}
