package org.example.hm1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Room")

public class Room {

    @Id
    public int RoomNumber;

    public String RoomType;
    public int Capacity;
    public int RatePerNight;
    public boolean Availability;



    public Room() {
    }

    public Room(int roomNumber, String roomType, int capacity, int ratePerNight, boolean availability) {
        RoomNumber = roomNumber;
        RoomType = roomType;
        Capacity = capacity;
        RatePerNight = ratePerNight;
        Availability = availability;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public int getRatePerNight() {
        return RatePerNight;
    }

    public void setRatePerNight(int ratePerNight) {
        RatePerNight = ratePerNight;
    }

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean availability) {
        Availability = availability;
    }

}
