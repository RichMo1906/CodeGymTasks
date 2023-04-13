package en.codegym.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Warm or cold
*/

public class WarmOrCold {
    public static void main(String[] args) {
        String cold = "It's cold outside";
        String warm = "It's warm outside";
        Scanner keyboard = new Scanner(System.in);
        int temp = keyboard.nextInt();

        if (temp >= 0) {
            System.out.println(warm);
        }
        else{
            System.out.println(cold);
        }
    }
}
