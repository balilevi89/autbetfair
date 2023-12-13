package homework;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Select a year between 1900 and 2016 : ");
        Integer year = input.nextInt();

          if (year % 4 == 0)
            System.out.println("February in the year " + year + "had 29 days");
        else{
            System.out.println("February in the year " + year + "had 28 days");

        }
    }
}
