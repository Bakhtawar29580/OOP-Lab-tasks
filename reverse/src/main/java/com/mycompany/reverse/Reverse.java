//Q3 Create an array of 5 integers and print it in reverse order. 

package com.mycompany.reverse;

public class Reverse {

    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4,5};
              
        System.out.println("Numbers in Reverse order: ");
        
        for(int i = nums.length -1; i >= 0; i--){           
            System.out.println(nums[i]);          
       }
    }         
 }
