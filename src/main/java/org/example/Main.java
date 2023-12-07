package org.example;

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        String password = "Amira1@";
        System.out.println(processor.isStrongPassword(password));
        String sentence = "Today is December 6, 2023.";
        System.out.println(processor.calculateDigits(sentence));
        String sentence2 = "Hello, World";
        System.out.println(processor.calculateWords(sentence2));
        String expression = "1 + 5 * (9 - 4)";
        System.out.println(processor.calculateExpression(expression));
    }
}