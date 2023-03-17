package com.calculator.calculator;

public class Model {
    public long calculation(long firstNumber, long secondNumber, String operator) {
        switch (operator) {
            case "+" -> {
                return firstNumber + secondNumber;
            }
            case "-" -> {
                return firstNumber - secondNumber;
            }
            case "*" -> {
                return firstNumber * secondNumber;
            }
            case "/" -> {
                if (secondNumber == 0) {
                    return 0;
                }
                return firstNumber / secondNumber;
            }
        }
        System.out.println("Неизвестный оператор " + operator);
        return 0;
    }
}
