package en.codegym.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Triangle
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "It's a triangle";
    private static final String TRIANGLE_DOES_NOT_EXIST = "It's not a triangle";

    public static void main(String[] args) {
        //write your code here
        Scanner keyboard = new Scanner(System.in);
        int side1 = keyboard.nextInt(),
            side2 = keyboard.nextInt(),
            side3 = keyboard.nextInt();

        if ((side1 < (side2 + side3)) &&
           (side2 < (side3 + side1)) &&
           (side3 < (side2 + side1))) {
            System.out.println(TRIANGLE_EXISTS);
        }

        if ((side1 >= (side2 + side3)) ||
           (side2 >= (side3 + side1)) ||
           (side3 >= (side1 + side2))){
              System.out.println(TRIANGLE_DOES_NOT_EXIST);

        }

    }
}
