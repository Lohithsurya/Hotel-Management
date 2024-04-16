package org.example.hm1.repository;

import org.example.hm1.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, String > {


    List<Room> findByAvailability(boolean Availability);
}
