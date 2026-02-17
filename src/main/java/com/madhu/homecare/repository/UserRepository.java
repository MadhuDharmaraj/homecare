package com.madhu.homecare.repository;

import com.madhu.homecare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository  extends JpaRepository<User, UUID> {

}
