package company;
import java.util.Scanner;

public class prime_Number {
    public static void main(String[] args) {
        int num, count = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }if(num == 1 ){
            System.out.println(num +" is the prime number ");
        } else if (count==2) {
            System.out.println(num +" is the prime number ");
        }
        else System.out.println( num + " is not the prime number ");
    }

}
