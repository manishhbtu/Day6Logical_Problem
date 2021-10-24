package com.blp.Day6PracticeProblem;

public class Fibonacci {
    static int a=0, b=1,c;
    public static void main(String[] args) {
        System.out.println("Welcome to day6 practice problem");
        System.out.print(a+" "+b);
        Fibonacci obj= new Fibonacci ();
        obj.printFib(13);

    }
    void printFib(int i){
        if (i>=1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            printFib(i-1);
        }
    }
}
