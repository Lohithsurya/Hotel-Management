package org.example.hm1.service.impl;

import org.example.hm1.model.Room;
import org.example.hm1.repository.RoomRepository;
import org.example.hm1.service.RoomService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomServiceimpl implements RoomService {

    RoomRepository roomRepository;
    public RoomServiceimpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    @Override
    public String createRoom(Room room) {
        roomRepository.save(room);
        return "Success";
    }

    @Override
    public String updateRoom(Room room) {
        roomRepository.save(room);
        return "success";
    }

    @Override
    public String deleteRoom(int RoomNumber) {
        roomRepository.deleteById(String.valueOf(RoomNumber));
        return "Success";
    }

    @Override
    public Room getRoom(int RoomNumber) {

        return roomRepository.findById(String.valueOf(RoomNumber)).get();
    }

    @Override
    public List<Room> getAllRooms(String RoomType) {
        return null;
    }

    @Override
    public List<Room> getAllAvailableRooms() {
        // Assuming you have a method in your repository to retrieve available rooms
        return roomRepository.findByAvailability(true);
    }

    @Override
    public List<Room> getAvailableRooms() {
        return null;
    }




}
