package en.codegym.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Conscription
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", you've been drafted for military service";
        //write your code here

        //System.out.print("Enter Name: ");
        Scanner keyboard1 = new Scanner(System.in);
        String name = keyboard1.nextLine();

        //System.out.print("Enter age: ");
        Scanner keyboard2 = new Scanner(System.in);
        int age = keyboard2.nextInt();

        if (age >= 18 && age <= 28){
            System.out.println(name + militaryCommissar);
        }
    }
}
