package fizzBuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) 
        {
        if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 3 & 5?
            System.out.println("FizzBuzz");
        else if ((i % 3) == 0) // Is it a multiple of 3?
            System.out.println("Fizz");
        else if ((i % 5) == 0) // Is it a multiple of 5?
            System.out.println("Buzz");
        else
            System.out.println(i); // Not a multiple of 5 or 7
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
