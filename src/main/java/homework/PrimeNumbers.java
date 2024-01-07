package homework;

public class PrimeNumbers {

    public static void main(String[] args) {
        int number = 0;
        do {
            int temp = 0;
            for (int i = 2;
                 i < number / 2;
                 i++)
                if (number % i == 0)
                    temp++;
            if (temp == 0 && number != 1) {
                System.out.println("This is a prime number " + number);
            }
            number++;
        }
        while (number < 1000000) ;
    }
}




