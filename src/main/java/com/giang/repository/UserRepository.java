package com.giang.repository;

import com.giang.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.roleId = ?1")
    List<User> findAllByRoleID(Integer roleID);

    @Query("SELECT u FROM User u WHERE u.fullname LIKE ?1")
    List<User> findAllByFullName(String fullName);

    @Query("SELECT u FROM User u WHERE u.username = ?1 AND u.password = ?2")
    User findByUsernameAndPassword(String username, String password);


    @Query("UPDATE User u SET u.isBlocked = ?2 WHERE u.id = ?1")
    @Modifying
    void updateStatusUser(Integer id, Boolean status);


    @Query("SELECT u FROM User u WHERE u.id LIKE ?1")
    User findById(Integer id);
}
