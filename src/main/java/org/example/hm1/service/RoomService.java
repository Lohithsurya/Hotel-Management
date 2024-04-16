package org.example.hm1.service;

import org.example.hm1.model.Room;

import java.util.List;

public interface RoomService {


    public String createRoom(Room room);
    public String updateRoom(Room room);
    public String deleteRoom(int RoomNumber);
    public Room getRoom(int RoomNumber);
    public List<Room> getAllRooms(String RoomType);


    List<Room> getAllAvailableRooms();

    List<Room> getAvailableRooms();





}
