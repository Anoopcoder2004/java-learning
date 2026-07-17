package org.anoop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // Create a Book object using the constructor
        Book b1 = new Book("Java", "James", true, 200);

        // Call methods on the object
        b1.displayBook();
        b1.borrowBook();
        b1.borrowBook();
    }
}
