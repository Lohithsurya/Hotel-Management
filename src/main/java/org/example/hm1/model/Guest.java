package org.example.hm1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Guest")

public class Guest {
    @Id
    public  int guestID;
    public  String firstName;
    public  String lastName;
    public  String contactNumber;
    public  String email;
    public  String address;
    public  String bookingHistory;

    public Guest() {

    }
    public Guest(int guestID, String firstName, String lastName, String contactNumber, String email, String address, String bookingHistory) {
        this.guestID = guestID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.bookingHistory = bookingHistory;
    }

    public int getGuestID() {
        return guestID;
    }

    public void setGuestID(int guestID) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(String bookingHistory) {
        this.bookingHistory = bookingHistory;
    }


}
