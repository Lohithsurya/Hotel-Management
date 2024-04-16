package org.example.hm1.repository;

import org.example.hm1.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long>  {

    Guest findByEmail(String email);
}
