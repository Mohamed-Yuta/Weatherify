package com.allali.Weatherify.repositories;

import com.allali.Weatherify.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
