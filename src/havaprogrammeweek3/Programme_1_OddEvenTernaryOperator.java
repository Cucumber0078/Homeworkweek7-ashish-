package havaprogrammeweek3;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        //isItOddOrEvenNumber(number);
        scanner.close();
    }

    public static void ositOddOrEvenNumber(int number){
        String evenOrOdd=(number %2 == 0)? "Even" : "Odd";
        System.out.println("the" + number + "is" + evenOrOdd + "number" );
    }

}
