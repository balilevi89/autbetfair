package homework;


public class SumOfNumbers {

    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        do {
            y = y + x;
            x++;
        } while (x <= 100);
        System.out.println("Sum of the first 100 numbers is: " + y );

    }
}
