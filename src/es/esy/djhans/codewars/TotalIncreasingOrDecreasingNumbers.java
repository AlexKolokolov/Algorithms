package es.esy.djhans.codewars;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 12.03.2016.
 */
public class TotalIncreasingOrDecreasingNumbers {
    private static List<BigInteger> list = new ArrayList<>();

    public static BigInteger totalIncDec(int x){
        // Good Luck!
        BigInteger counter = BigInteger.ZERO;
        BigInteger lim = BigInteger.TEN.pow(x);
        BigInteger currentNumber = BigInteger.ZERO;
        while (!currentNumber.equals(lim)) {
            List<Integer> digits = bigIntegerToDigits(currentNumber);
            List<Integer> digitsClone = new ArrayList<>(digits);
            Collections.sort(digitsClone);
            if (digits.equals(digitsClone)) {
                counter = counter.add(BigInteger.ONE);
                list.add(currentNumber);
            }
            else {
                Collections.reverse(digitsClone);
                if (digits.equals(digitsClone)) {
                    counter = counter.add(BigInteger.ONE);
                    list.add(currentNumber);
                }
            }
            currentNumber = currentNumber.add(BigInteger.ONE);
        }

        return counter;
    }

    private static List<Integer> bigIntegerToDigits(BigInteger number) {
        List<Integer> digits = new ArrayList<>();
        while (!number.equals(BigInteger.ZERO)) {
            int digit = number.mod(BigInteger.TEN).intValue();
            digits.add(digit);
            number = number.divide(BigInteger.TEN);
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(totalIncDec(3));
        System.out.println(list);
    }
}
