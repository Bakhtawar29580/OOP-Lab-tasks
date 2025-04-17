//Create an array with 10 integers. Print only the even numbers from the array.

package com.mycompany.even;

public class Even {

    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
                
        System.out.println("Even numbers are: ");
        
        for(int i =0; i <10; i++){
            if(nums[i] %2 == 0){
                System.out.println(nums[i] + " ");
                
            }
        }     
    }
}
