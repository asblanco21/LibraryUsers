package com.company;

public class KidUsers implements LibraryUserI{
    public KidUsers(int age, String bookType) {
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
        if (age < 12){
            System.out.println("You have successfully registered under Kids Account!");
        }else {
            System.out.println("Sorry age must be less than 12 to register as a kid!");
        }
    }

    @Override
    public void requestBook() {
        if (bookType == "Kids"){
            System.out.println("Book issued successfully, please return the book within 10 days.");
        }else {
            System.out.println("Oops, you are allowed only to take kids books!");
        }
    }
}
