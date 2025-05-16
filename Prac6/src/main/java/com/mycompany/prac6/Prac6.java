package com.mycompany.prac6;

public class Prac6 {

    interface Printable {
        String print();
    }

    class Book implements Printable {
        String title;
        String author;

        Book(String t, String a) {
            title = t;
            author = a;
        }

        public String print() {
            return "Book title: " + title + ", Book author: " + author;
        }
    }

    class Magazine implements Printable {
        String title;
        int issueNum;

        Magazine(String t, int i) {
            title = t;
            issueNum = i;
        }

        public String print() {
            return "Magazine title: " + title + ", Issue number: " + issueNum;
        }
    }

    public static void main(String[] args) {
        Prac6 obj = new Prac6();  // To access inner classes

        Printable book = obj.new Book("The House", "Hina");
        Printable magazine = obj.new Magazine("Tech Today", 33);

        System.out.println(book.print());
        System.out.println(magazine.print());
    }
}
