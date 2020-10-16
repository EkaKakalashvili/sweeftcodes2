package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money: ");
        int money = scanner.nextInt();
        System.out.println("The minimum amount of coins is: " + minSplit(money));
    }

    public static int minSplit(int money){
        //reversing array values
        int[] coins  = {1,5,10,20,50};
        int result = 0;
        for(int i = coins.length-1; i>=0;i-- ){
            while(money-coins[i]>=0){
                ++result;
                money-=coins[i];
            }
        }
        return result;
    }
}
