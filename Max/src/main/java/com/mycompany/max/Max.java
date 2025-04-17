//Q2 Given an array of 6 numbers, write a program to find and print the largest number.

package com.mycompany.max;

public class Max {

    public static void main(String[] args) {
        int nums[] = {7, 23, 65, 78, 94, 10};
        int max = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }      
        System.out.println("The largest number is: " + max);
    }
}
