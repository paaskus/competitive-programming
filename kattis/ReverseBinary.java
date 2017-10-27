import java.util.*;

public class ReverseBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String reversedBinary = decimalToBinary(decimal);        
        int reversedBinaryInDecimal = binaryToDecimal(reversedBinary);
        System.out.println(reversedBinaryInDecimal);
    }

    // indexed by exponent
    public static String decimalToBinary(int decimal) {
        int n = decimal;
        int exponent = 32;
        int[] result = new int[exponent];
        if (n % 2 == 1) { // uneven number
            result[0] = 1;
            n--;
        }
        while (n > 0) {
            double powerOfTwo = Math.pow(2, exponent);
            if (n >= powerOfTwo) {
                result[exponent] = 1;
                n -= (int)powerOfTwo;
            }
            exponent--;
        }
        return binArrToString(result);
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1')
                decimal += Math.pow(2, binary.length()-i-1);
        }
        return decimal;
    }

    private static String binArrToString(int[] arr) {
        String result = "";
        int index = arr.length-1;
        while (index >= 0 && arr[index] == 0) {
            index--;
        }
        for (int i = 0; i <= index; i++) {
            result += arr[i];
        }
        return result;
    }
    
}
