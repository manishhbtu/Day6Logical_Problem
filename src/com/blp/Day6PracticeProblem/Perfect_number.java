package com.blp.Day6PracticeProblem;
import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        int num, sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        if ( num >0){
            for (int i=1;i<num;i++){
                if (num%i==0){
                    sum=sum+i;
                }
            }
            if (sum==num){
                System.out.println(num + " is perfect number");
            }else {
                System.out.println(num+"is not a perfect number");
            }


        }else{
            System.out.println("Enter a positive number");
        }

    }
}
