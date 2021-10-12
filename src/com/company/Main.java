package com.company;

public class Main {

    public static void main(String[] args) {

        //create an interface LibraryUser with following methods declared: registerAccount, requestBook

        //create 2 classes: KidUsers, AdultUser which implements the LibraryUser interface.

        //both classes should have two fields : age, bookType.

        LibraryUserI kid = new KidUsers (11, "Kids");
        kid.registerAccount();
        kid.requestBook();

        LibraryUserI adult = new AdultUsers (30, "Fiction");
        adult.registerAccount();
        adult.requestBook();
    }
}
