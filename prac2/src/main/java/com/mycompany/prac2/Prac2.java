package com.mycompany.prac2;

public class Prac2 {   

    public static void main(String[] args) {
        
        int[] arr = {12,24,560,76,45,90};
        int max = arr[0];
        
        for(int i = 0; i <arr.length; i++){
            if(arr[i] > max){
                max = arr[i];       
            }
        }     
         System.out.println("Largest number is: "+ max);
    }
}
