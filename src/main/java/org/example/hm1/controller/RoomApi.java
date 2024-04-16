    package org.example.hm1.controller;



    import org.example.hm1.model.Room;
    import org.example.hm1.service.RoomService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    //hello
    @Controller
    @RequestMapping("/home")
    public class RoomApi {

        @Autowired
        RoomService roomService;

        public RoomApi(RoomService roomService) {
            this.roomService = roomService;
        }

        @GetMapping("/rooms")
        public String showAvailableRooms(Model model) {
            // Retrieve available rooms from service layer
            List<Room> availableRooms = roomService.getAllAvailableRooms();

            // Add available rooms to model
            model.addAttribute("rooms", availableRooms);

            // Return view name
            return "available_rooms";
        }



        @GetMapping("/create")
        public String createRoom(){

            return "room";
        }
        @PostMapping("/create")
        public String createRoom(@ModelAttribute("roomcr") Room room, Model model) {
            room.setAvailability(true);
            roomService.createRoom(room);
            System.out.println("Received POST request with data: " + room.getRoomNumber());
            model.addAttribute("room", "room"); // If you want to display the created room in the "room" view.
            return "room"; // Assumes "room" is the name of your HTML template for displaying room details.
        }





        @PutMapping("/update")
        public String updateRoom(@RequestBody Room room){
            roomService.updateRoom(room);
            return "roomer";
        }

        @DeleteMapping("/room/{RoomNumber}")
        public String deleteRoom(@PathVariable  ("RoomNumber") int RoomNumber){
            roomService.deleteRoom(RoomNumber);
            return "login";
        }


    }
