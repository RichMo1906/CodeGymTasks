package en.codegym.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Three numbers
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

        int num[];
        num = new int[3];

        //Get numbers
        for (int i = 0; i < 3; i++) {
            Scanner keyboard = new Scanner(System.in);
            num[i] = keyboard.nextInt();
        }
        // Check matches
        int matches = 0;
        int numMatch = 0;

        for (int k = 0; k < num.length -1; k++){
           for (int l = k+1; l < num.length; l++) {
               if (num[k] == num[l]) {
                   matches = matches + 1;
                   numMatch = num[k];

                   if (matches == num.length){
                       matches = num.length -1;
                   }
               }
           }
        }
        // output
        if (numMatch > 0) {
            for (int x = 0; x <= matches; x++)
                System.out.print(numMatch + " ");
        }
    }
}
