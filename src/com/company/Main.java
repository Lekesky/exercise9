// Leke Obayemi
// 3/15/22
// Exercise 9


package com.company;


public class Main {

    public static void main(String[] args) {
        Email person = new Email("something@gmail.com");
        person.contact();
        Number person1 = new Number(12345678L);
        person1.contact();

    }

}

abstract class Contacts{
    private String name;
    public abstract void contact();
}

class Email extends Contacts{       //Used for emailing
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public void contact() {
        System.out.println("Emailing: " + email);
    }
}

class Number extends Contacts{      //Used for calling
    private Long phoneNumber;

    public Number(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Number{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public void contact() {
        System.out.println("Calling: " + phoneNumber);
    }
}



