package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int var1=sc.nextInt();
        int var2=sc.nextInt();
        int temp=0;
        System.out.println("Before the swapping:"+var1);
        System.out.println("Before the swapping:"+var2);
        temp=var1;
        var1=var2;
        var2=temp;
        System.out.println("After the swapping:"+var1);
        System.out.println("After the swapping:"+var2);
	// write your code here
    }
}
