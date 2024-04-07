package org.example.hm1.controller;

import org.example.hm1.model.Room;
import org.example.hm1.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//hello
@RestController
@RequestMapping("/room")
public class RoomApi {

    RoomService roomService;

    public RoomApi(RoomService roomService) {
        this.roomService = roomService;
    }



    @GetMapping("{RoomNumber}")
    public Room getRoomDetails(@PathVariable("RoomNumber") int RoomNumber){

            return  roomService.getRoom(RoomNumber);
    }

    @PostMapping
    public String createRoom(@RequestBody Room room){
        roomService.createRoom(room);
        System.out.println("Received POST request with data: " + room.getRoomNumber());
        return "Room created Successfully";
    }

    @PutMapping
    public String updateRoom(@RequestBody Room room){
        roomService.updateRoom(room);
        return "Room Updated Successfully";
    }

    @DeleteMapping("{RoomNumber}")
    public String deleteRoom(@PathVariable  ("RoomNumber") int RoomNumber){
        roomService.deleteRoom(RoomNumber);
        return "Room Deleted Successfully";
    }


}
