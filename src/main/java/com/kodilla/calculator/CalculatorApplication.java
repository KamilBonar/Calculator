package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public void dodawanie(int a, int b){
        int suma = a + b;
        System.out.println(suma);
    }

    public void odejmowanie(int c, int d){
        int roznica = c - d;
        System.out.println(roznica);
    }

    public static void main(String[] args) {
        CalculatorApplication calculator = new CalculatorApplication();
        calculator.dodawanie(5, 5);
        calculator.odejmowanie(5, 4);
    }

}
