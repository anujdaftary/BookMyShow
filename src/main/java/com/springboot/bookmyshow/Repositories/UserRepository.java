package com.springboot.bookmyshow.Repositories;

import com.springboot.bookmyshow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long userId);
    //find the User by the given userId.

    @Override
    List<User> findAllById(Iterable<Long> longs);

    Optional<User> findByEmailId(String email);

    User findByPhoneNumber(String phone);





}
