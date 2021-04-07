package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Calculator {
    private final int a;
    private final int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    int substractAFromB() {
        return a - b;
    }

    int addAtoB() {
        return a + b;
    }
}

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {

        SpringApplication.run(CalculatorApplication.class, args);

        Calculator firstCalculator = new Calculator(23, 21);

        System.out.println("Substracting arguments(" + firstCalculator.getA() + ", " + firstCalculator.getB() +
                ") equals: " + firstCalculator.substractAFromB());

        System.out.println("Adding arguments(" + firstCalculator.getA() + ", " + firstCalculator.getB() + ") equals: " +
                firstCalculator.addAtoB());

    }

}
