package com.jasmin.webarchive.repository;


import com.jasmin.webarchive.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    User findByUsername(String username);

   // Optional<User> findByUsername(String username);

    //@Query(value =
    //        "SELECT b FROM User b " +
    //                "JOIN b.username a " +
    //                "JOIN b.password c " +
    //                "WHERE (:username IS NULL OR b.username = :username) " +
    //                "AND (:password IS NULL OR a.password = :password)")
    //List<User> findByQuery(
    //        @Param("username") String username,
    //        @Param("password") String password);
}
