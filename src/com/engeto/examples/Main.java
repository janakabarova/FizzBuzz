package com.engeto.examples;

public class Main {

    public static void main(String[] args) {
	// vypis cisla od 1 do 100 a pro kazde cislo delitelne 3 vypis Fizz a pro cislo delitelne 5 vypis Buzz
    // pokud bude cislo delitelne 3 i 5, vypis FizzBuzz
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
