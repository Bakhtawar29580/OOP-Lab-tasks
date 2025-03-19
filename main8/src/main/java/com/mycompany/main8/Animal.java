package com.mycompany.main8;

class parent {
    public void Animal() {
        System.out.println("The animal is dog");
    }
}

class child extends parent {
    @Override
    public void Animal() {
        System.out.println("The animal is cat");
    }
}
