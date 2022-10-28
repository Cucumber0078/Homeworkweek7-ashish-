package havaprogrammeweek3;

import java.util.Scanner;

public class Programme_2_Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scanner.nextInt();
        Programme_2_Leapyear leapyear= new Programme_2_Leapyear();
        leapyear.isItLeapyear(year);
        scanner.close();

    }
    public void isItLeapyear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("the year "+year+" is not leap year");
            return;

        }
    }

}
