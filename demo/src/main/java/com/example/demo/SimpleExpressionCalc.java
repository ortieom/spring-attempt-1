package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class SimpleExpressionCalc {
    private DoubleCalculator calc;

    public SimpleExpressionCalc(DoubleCalculator calculator) {
        this.calc = calculator;
    }

    double eval(String expr) throws Exception {
        String[] terms = expr.split(" ");
        double a = Double.parseDouble(terms[0]);
        double b = Double.parseDouble(terms[2]);

        switch (terms[1]) {
            case "+":
                return calc.add(a, b);
            case "-":
                return calc.sub(a, b);
            case "*":
                return calc.mul(a, b);
            case "/":
                return calc.div(a, b);
        }

        throw new Exception("Invalid expression");
    }
}
