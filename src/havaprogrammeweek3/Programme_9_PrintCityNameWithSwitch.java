package havaprogrammeweek3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter alphabet between A to F:");
        String city = scanner.next().toUpperCase();
        Programme_9_PrintCityNameWithSwitch programme_9_printCityNameWithSwitch = new Programme_9_PrintCityNameWithSwitch();
        Programme_9_PrintCityNameWithSwitch cityName;
      //  cityName.printCityName(city);
        scanner.close();
        }
        public void printCityName(String city){
        switch (city){
            case "A":
                System.out.println("Aberdeeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derdy");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between AtoF");

        }
    }
}