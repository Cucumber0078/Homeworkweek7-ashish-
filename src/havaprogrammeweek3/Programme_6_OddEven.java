package havaprogrammeweek3;

import java.util.Scanner;

public class Programme_6_OddEven {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the number you want ");
        int number = scanner.nextInt();
        Programme_6_OddEven programme_6_oddEven = new Programme_6_OddEven();
        Programme_6_OddEven oddEven = null;
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " number");
        scanner.close();

    }

    public String isItEvenOrOddNumber(int number){
        if (number % 2 == 0){
            return "even";
    }else{
            return "odd";
            
        }
}
}