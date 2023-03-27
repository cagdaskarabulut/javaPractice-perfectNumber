package com.karabulut.javapracticeperfectnumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaPracticePerfectNumberApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaPracticePerfectNumberApplication.class, args);

        int givenNumber = 28;
        if(isPerfectNumber(givenNumber)) System.out.println(givenNumber+" is a perfect number"); else System.out.println(givenNumber+" is not a perfect number");
    }

    private static boolean isPerfectNumber(int number) {
        if (number==1){
            return false;
        }

        int sum = 1;

        for (int i = 2; i < number ; i++) {
            if(number%i==0){
                sum += i;
            }
        }

        if(sum==number){
            return true;
        } else {
            return false;
        }

    }
}
