//Create an array of 5 integers. Initialize it with values and print the sum of all elements. 
package com.mycompany.sum;

public class Sum {

    public static void main(String[] args) {
        int nums[] = {12, 24, 35, 48, 98};
        int sum = 0;
          
        for(int i = 0; i < 5; i++){
            sum += nums[i];
        }
        System.out.println("Sum of array elements is: " + sum);
    }    
}