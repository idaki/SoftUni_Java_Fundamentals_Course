package Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class PB02_Sum_Big_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num1 = new BigInteger(scanner.nextLine());
        BigInteger num2 = new BigInteger(scanner.nextLine());
        BigInteger sum = num1.add(num2);

        System.out.println(sum);

    }
}
