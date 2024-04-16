package org.example.hm1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Guest")

public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)// or GenerationType.SEQUENC

    public Long guestID;


    public  String firstName;
    public  String lastName;
    public  String contactNumber;
    public  String email;

    public  String password;
    public  String bookingHistory;

    public Guest(String firstName, String lastName, String contactNumber, String email, String password, String bookingHistory) {

    }
    public Guest(Long guestID, String firstName, String lastName, String contactNumber, String email, String password, String bookingHistory) {
        this.guestID = guestID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.password = password;
        this.bookingHistory = bookingHistory;
    }

    public Guest() {

    }

    public Long getGuestID() {
        return guestID;
    }

    public void setGuestID(Long guestID) {
        this.guestID = guestID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(String bookingHistory) {
        this.bookingHistory = bookingHistory;
    }


}
