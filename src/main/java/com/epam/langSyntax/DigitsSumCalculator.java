package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        while (number>=1) {
            sum += number%10;
            number = number/10;
        }
        System.out.println(sum);
    }

}
