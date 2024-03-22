package org.example.data;

public record User(String firstname, String lastname, String middleName, String birthday, long phoneNumber,
                   char gender) {

    @Override
    public String toString() {
        return lastname() + " " + firstname() + " " + middleName() + " " +
                birthday() + " " + phoneNumber() + " " + gender();
    }
}
