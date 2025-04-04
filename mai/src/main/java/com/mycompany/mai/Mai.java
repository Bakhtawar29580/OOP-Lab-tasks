package com.mycompany.mai;

final class test 
    {
        final double circleArea(){
            final double r = 2;
            double res = 3.14 * r;
            
            return res;
        }
    }

class test2 extends test{
    double circleArea(){
        final double res = 3.14 * r;
        
        return res;
    }
}

public class Mai {

    public static void main(String[] args) {
        test2 t1 = new test2();
        System.out.println(t1.circleArea());
    }
}


