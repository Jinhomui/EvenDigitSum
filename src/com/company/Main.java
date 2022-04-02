package com.company;

public class Main {

    public static void main(String[] args) {
	getEvenDigitSum(-22);
    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            System.out.println("Invalid Number");
            return -1;
        }

        int LastDigit=0;
        int storedNumber=0;

        while(number>0){
            LastDigit=number%10; //extract last digit
            System.out.println(LastDigit);


            if(LastDigit%2==0){
                storedNumber=LastDigit+storedNumber;
            }
            System.out.println("Stored Number = " + storedNumber);

            number=number/10; //move to next digit
            System.out.println(number);



        } return storedNumber;
    }

}

//Write a method named getEvenDigitSum with one parameter of type int called number.
//
//The method should return the sum of the even digits within the number.
//
//If the number is negative, the method should return -1 to indicate an invalid value.
//
//
//EXAMPLE INPUT/OUTPUT:
//
//* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
//
//* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
//
//* getEvenDigitSum(-22); → should return -1 since the number is negative
//
//
//NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.
//
//NOTE: Do not add a main method to the solution code.
