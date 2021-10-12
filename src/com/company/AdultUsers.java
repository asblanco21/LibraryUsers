package com.company;

public class AdultUsers implements LibraryUserI {
    public AdultUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    private int age;
   private String bookType;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age > 12){
            System.out.println("You have successfully registered under an adult account!");
        }else if (age < 12){
            System.out.println("Sorry age must be greater than 12 to register as an adult!");
        }
    }

    @Override
    public void requestBook() {
        if (bookType == "Fiction"){
            System.out.println("Book issued successfully, please return the book within seven days.");
        }else{
            System.out.println("Oops, you are allowed to take only adult fiction books.");
        }
    }
}
